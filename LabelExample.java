import java.awt.*;

import javax.swing.plaf.ColorUIResource;

public class LabelExample {

    LabelExample() {
        // Creating a frame
        Frame frame = new Frame("Label Example");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true); // By default it is false

        // Creating a Label
        Label label = new Label("This is Label");
        label.setBounds(50, 50, 200, 50);

        label.setBackground(new ColorUIResource(40, 55, 166));
        label.setAlignment(Label.CENTER);
        label.setForeground(new ColorUIResource(255, 255, 255));

        frame.add(label);
        //adding to the frame

    }

    public static void main(String[] args) {

        // Calling the constructor
        new LabelExample();

    }
}
