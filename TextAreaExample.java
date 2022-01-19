import java.awt.*;


public class TextAreaExample {

    TextAreaExample() {
        // Creating a frame
        Frame frame = new Frame("TextArea Example");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true); // By default it is false

        // Create a TextField
        TextArea textarea = new TextArea("This is textarea", 2, 7, TextArea.SCROLLBARS_NONE);
        textarea.setBounds(50,50,250,50);

        frame.add(textarea);

    }

    public static void main(String[] args) {
        // calling the constructor
        new TextAreaExample();

    }
}
