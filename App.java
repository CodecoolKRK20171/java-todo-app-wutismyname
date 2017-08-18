/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
import java.util.Scanner;

public class App{

    public static void main(String[] args) {

        boolean end = false;
        TodoList todoList = new TodoList();

        while (!end) {
            System.out.println("Please specify a command [list, add, mark, archive], else the program will quit:");
            String command = getInput();

            if (command.toLowerCase().equals("list")) {
                todoList.listAll();
            }

            else if (command.toLowerCase().equals("add")) {
                System.out.println("Add an item:");
                String name = getInput();
                todoList.addItem(name);
            }

            else if (command.toLowerCase().equals("mark")) {
                todoList.listAll();
                System.out.println("Which one do you want to mark as completed: ");
                try {
                    Integer idx = Integer.parseInt(getInput());
                    todoList.markItem(idx);
                }
                catch (NumberFormatException e) {
                    System.out.println("Please type only integers.");
                }
            }

            else if (command.toLowerCase().equals("archive")) {
                todoList.archiveItems();
            }

            else {
                System.out.println("Goodbye!");
                end = true;
            }
        }
    }

    public static String getInput() {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }
}
