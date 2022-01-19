import java.awt.*;

public class FrameExample extends Frame {

    FrameExample() {
        // Set the Size of Frame
        setSize(400, 400);
        
        // Set the title of Frame
        setTitle("Frame Example");
        
        // Make frame visible : by default false
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameExample();  //calling the constructor


    }
}