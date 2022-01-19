import java.awt.*;
import java.awt.event.*;

public class DialogExample {
    DialogExample() {
        // Creating a frame
        Frame frame = new Frame("Dialog Example");
        frame.setSize(400, 400);
        frame.setLayout(null); // setLayout to flow
        frame.setVisible(true); // By default it is false

        // Creating a Dialog
        Dialog dialog = new Dialog(frame, "Dialog Example", true);
        dialog.setLayout(new FlowLayout()); // setLayout to flow
        dialog.setSize(200, 200);

        // Adding a button and pack inside dialog container
        Button button = new Button("OK");

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);

            }

        });

        dialog.add(button); // Add Button to dialog continer
        dialog.setVisible(true); // Make Dialog visible
    }

    public static void main(String[] args) {
        new DialogExample(); // constructor calling

    }
}
