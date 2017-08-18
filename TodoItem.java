/**
 * Class representing a single todo item.
 *
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TodoItem{

    Boolean isDone;
    String name;
    Date date;

    public TodoItem(String name, Date date) {
        this.name = name;
        this.date = date;
        this.isDone = false;
    }

    public String getName() {
        return this.name;
    }

    public Date getDate() {
        return this.date;
    }

    public void markAsDone() {
        this.isDone = true;
        System.out.println(this.name + " is completed.");
    }

    public String getString() {
        String status = "";
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = df.format(this.date);
        if (this.isDone)
            status = "[x]";
        else if (!this.isDone)
            status = "[ ]";
        return name + " " + formattedDate + " " + status;
    }
}
