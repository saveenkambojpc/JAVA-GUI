import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceExample {

    ChoiceExample() {
        // Creating a frame
        Frame frame = new Frame("Choice Example");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true); // By default it is false

        // Creating a Choice
        Choice choice = new Choice();
        choice.setBounds(50, 50, 75, 75);

        // Adding item to the choice menu
        choice.add("Item 1");
        choice.add("Item 2");
        choice.add("Item 3");
        choice.add("Item 4");
        choice.add("Item 5");

        // Adding choice to frame
        frame.add(choice);

        // Creating a button
        Button btn1 = new Button("Show");

        // Creating a label
        Label label = new Label();

        // Adding Event Listener
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("The Selected item is : "+choice.getItem(choice.getSelectedIndex()));

            }
        });

        label.setBounds(50,100,200,50);
        frame.add(label);
        
        btn1.setBounds(50,150,100,50);
        frame.add(btn1);




    }

    public static void main(String[] args) {
        new ChoiceExample(); // calling the constructor
    }
}
