import java.awt.*;

public class CheckBoxExample {

    CheckBoxExample() {
        // Creating a frame
        Frame frame = new Frame("Checkbox Example");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true); // By default it is false

        // Creating a Checkbox
        // Firstly we need a CheckboxGroup to create a checkbox
        CheckboxGroup checkboxgroup = new CheckboxGroup();

        // public Checkbox(String label, CheckboxGroup group, boolean state){}
        Checkbox checkbox1 = new Checkbox("Java", checkboxgroup, false);
        Checkbox checkbox2 = new Checkbox("Python", checkboxgroup, false);

        checkbox1.setBounds(50, 50, 50, 50);
        checkbox2.setBounds(50, 100, 50, 50);

        frame.add(checkbox1);
        frame.add(checkbox2);
    }

    public static void main(String[] args) {
        new CheckBoxExample(); // calling the constructor
    }
}
