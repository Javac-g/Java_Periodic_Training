package Journal.V1.Controller;

import Journal.V1.Model.*;
import Journal.V1.View.View;

public class Controller {
    View view = new View();
    Model model = new Model();
    public boolean process(){
        view.printMenu();
        Integer ch = view.getNumb("Enter:");
        boolean choose = switch (ch){
            case 1 -> {
              view.printMSG("Adding new person: ");
              model.addPerson(  view.getString("Enter name: "),
                                view.getString("Enter position: "),
                                view.getNumb("Enter salary: "),
                                view.getNumb("Enter id: "));
              view.printMSG("Person saved");
              yield true;
            }
            case 2->{
                view.printMSG("Searching person");
                Person person = model.findPerson(view.getNumb("Enter id of person to find: "));
                if (person != null){
                    view.printData(person);
                }else {
                    view.printMSG("Nobody found");
                }
                yield true;
            }
            case 3->{
                view.printMSG("Updating person");
                Person person = model.updatePerson(view.getNumb("Enter id of person to update"),
                                                    view.getString("New name: "),
                                                    view.getString("New position: "),
                                                    view.getNumb("New salary: "),
                                                    view.getNumb("New id: "));
                if (person != null){
                    view.printMSG("Updated person:");
                    view.printData(person);
                }else {
                    view.printMSG("Nobody updated");
                }
                yield true;
            }
            case 4 -> {
                view.printMSG("Deleting person:  ");
                int id = model.delete(view.getNumb("Enter person id to delete"));
                if (id != -1){
                    view.printMSG("Was deleted person N: " + id);
                }else{
                    view.printMSG("Nobody was deleted");
                }
                yield true;
            }
            default -> {
                System.out.println("Wrong command");
                yield true;
            }
            case 5->{
                System.out.println("Bye Bye");
                yield false;
            }

        };
        return choose;
    }
    public void initController(){
        boolean choose = true;
        while (choose){
            choose = process();
        }
    }
}
