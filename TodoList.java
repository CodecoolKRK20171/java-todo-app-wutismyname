/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.ListIterator;

public class TodoList{

    ArrayList<TodoItem> todoList;

    public TodoList() {
        todoList = new ArrayList<>();
    }

    public void listAll() {

        for (TodoItem item : todoList) {
            System.out.println(item.getString());
        }
    }

    public void addItem(String name) {
        Date today = Calendar.getInstance().getTime();
        TodoItem newItem = new TodoItem(name, today);
        todoList.add(newItem);
    }

    public void markItem(int idx) {

        Boolean existsItem = false;
        for (int i = 0; i < todoList.size(); i++) {
            if ((idx - 1) == i) {
                todoList.get(i).markAsDone();
                existsItem = true;
            }
        }
        if (!existsItem)
            System.out.println("No such item.");
    }

    public void archiveItems() {
        ListIterator<TodoItem> iter = todoList.listIterator();
        while(iter.hasNext()) {
            if(iter.next().isDone)
                iter.remove();
        }
    }


}
