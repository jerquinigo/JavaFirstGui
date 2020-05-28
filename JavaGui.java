import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;


public class JavaGui {

    public JavaGui() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("click button");
        //panel is flexible
        // common things to set up for panel is set up the border for the frame
        // set layout and then add elements to the layout

        //setBorder takes a border object
        //border in pixels. This is similar to canvasAPI for javascript
        panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
        //this will be rows and columns
        panel.setLayout(new GridLayout(0,1));

        //adding button to panel
        panel.add(button);


        // this is boiler plate code to draw panel to screen and close it once done
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My first Java Gui :)");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new JavaGui();
    }
}