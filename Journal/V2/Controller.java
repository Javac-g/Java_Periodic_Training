package Journal.V2;

public class Controller {
    public void initController(){
        Model model = new Model();
        View view = new View();

        boolean run = false;

        while (!run){
            view.printMenu();
            int command = view.addInteger("Enter Menu Number");

           run =  switch (command) {
                case 1 -> {
                    view.printMessage("Adding Student");
                    model.add(view.addInteger("Add ID: "), view.addString("Add Name: "), view.addInteger("Add Salary: ") );
                    view.printMessage("Saved");
                    yield false;
                }
                case 2 ->{
                    view.printMessage("Searching Student: ");
                    Student student = model.find(view.addInteger("Add id to Find: "));

                    if (student != null){
                        view.printData(student);
                    }else {
                        view.printMessage("Nobody found");
                    }
                    yield false;
                }
                case 3 ->{
                    view.printMessage("Updating Student: ");
                    Student student = model.update(view.addInteger("Enter ID to update: "),
                                                    view.addInteger("Enter new ID:"),
                                                    view.addString("Enter new Name: "),
                                                    view.addInteger("Enter new Salary: "));
                    if (student != null){
                        view.printData(student);
                    }else {
                        view.printMessage("Nobody wasn't update");
                    }
                    yield false;
                }
                case 4 ->{
                    view.printMessage("Deleting Student: ");
                    int index = model.delete(view.addInteger("Enter ID to delete: "));

                    if (index != -1){
                        view.printMessage("Was deleted student N: " + index);
                    }else {
                        view.printMessage("Nobody wasn't deleted");
                    }
                    yield false;

                }
                case 5 ->{
                    view.printMessage("Bye Bye");
                    yield true;
                }
                default -> {
                    System.out.println("Wrong command");
                    yield false;
                }

           } ;
        }


    }
}
