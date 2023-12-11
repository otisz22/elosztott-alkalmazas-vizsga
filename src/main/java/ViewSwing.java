import javax.swing.*;
import java.awt.*;

public class ViewSwing {
    private final Controller controller;
    private final JFrame frame;
    private final JTextArea textArea;

    public ViewSwing(Controller controller) {
        this.controller = controller;

        frame = new JFrame("JSON Viewer");
        textArea = new JTextArea();
        textArea.setEditable(false);

        frame.getContentPane().add(new JScrollPane(textArea));
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton showDataButton = new JButton("Show Data");
        showDataButton.addActionListener(e -> {
            controller.fetchData();
            JOptionPane.showMessageDialog(frame, controller.getDataModel());
            displayData(controller.getDataModel());
        });

        frame.getContentPane().add(showDataButton, BorderLayout.SOUTH);


        frame.setVisible(true);
    }

    public void displayData(Model data) {
        textArea.setText(data.toString());
    }



}