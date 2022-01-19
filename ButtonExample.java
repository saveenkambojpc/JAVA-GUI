import java.awt.*;
import java.awt.event.*;

public class ButtonExample {

    ButtonExample() {
        // Create a Frame
        Frame frame = new Frame();
        frame.setTitle("Button Example");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400, 400);

        // Create a button
        Button button = new Button("Click Here to change the title");
        button.setBounds(50, 50, 200, 50);

        // Event Listener on Button
        button.addActionListener(new ActionListener() {
            // ActionListener is an interface which has actionPerformed method
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("Now Title is changed");
            }
        });
        ;
        frame.add(button);

    }

    public static void main(String[] args) {

        // Calling the constructor
        new ButtonExample();
    }
}
