public class ViewConsole {
    Model dataModel;

    public ViewConsole(Controller controller) {
        this.dataModel = controller.getDataModel();
        System.out.println(dataModel.toString());
    }

}
