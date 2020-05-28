import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//will have to add unimplemented methods 
public class JavaGui implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public JavaGui() {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("click button");
        label = new JLabel("Number of clicks: " + this.count);
        // panel is flexible
        // common things to set up for panel is set up the border for the frame
        // set layout and then add elements to the layout

        // setBorder takes a border object
        // border in pixels. This is similar to canvasAPI for javascript
        panel.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));
        // this will be rows and columns
        panel.setLayout(new GridLayout(0, 1));

        // this is similar to javascript add event listener
        // to use this as an argument, you will have to modify the entire class. It will
        // be JavaGui implements ActionLister
        button.addActionListener(this);

        // adding button to panel
        panel.add(button);
        // adding label to panel
        panel.add(label);

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


    // after adding the unimplemented methods, this method will populate and you add your actions here
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        count = count + 1;
        label.setText("Number of clicks: " + this.count);

    }
}