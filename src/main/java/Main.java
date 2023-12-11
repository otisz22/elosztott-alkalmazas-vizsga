public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.fetchData();
        new ViewConsole(controller);
        new ViewSwing(controller);

    }
}