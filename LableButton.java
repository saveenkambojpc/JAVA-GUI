import java.awt.*;

import javax.swing.plaf.ColorUIResource; //for color

public class LableButton extends Frame {

    LableButton() {
        // Setting the Frame Size
        setSize(300, 300);

        // Set the Title
        setTitle("Label and Button");

        // Make Frame Visible -> by default True
        setVisible(true);

        setLayout(null);

        // Creating a Label
        Label label = new Label();
        label.setBounds(100, 50, 100, 50);
        label.setText("This is Label");
        add(label);

        // Creating a Button
        Button button = new Button("Click here");
        button.setBounds(100, 100, 100, 50);
        button.setBackground(new ColorUIResource(31, 166, 207));
        button.setForeground(new ColorUIResource(255, 255, 255));

        add(button);

    }

    public static void main(String[] args) {
        new LableButton(); // calling the constructor

    }
}
