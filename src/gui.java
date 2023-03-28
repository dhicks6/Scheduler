import javax.swing.SpringLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Spring;
import java.awt.Component;
import java.awt.Container;

// Currently using the oracle docs tutorial on the spring layout


/*
 Design ideas
 I want a landing page that displays the calendar in the middle with a weekly task tracker on the right side
 */
public class gui {

/*
 Method for the landing page
 Should contain a calendar in the middle of the frame with a display on the right that shows this weeks tasks
 */
    public void landingPage() {
        
    }

/*
 Method for the task creation page
 */
    public void addTask() {

    }



    /*
     startgui should be the driver for my gui
     */
    public void startgui() {
        //Create and set up the window.
        JFrame frame = new JFrame("Scheduler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
       
        //Create and add the components.
        JLabel label = new JLabel("Label: ");
        JTextField textField = new JTextField("Text field", 15);
        contentPane.add(label);
        contentPane.add(textField);

        //Adjust constraints for the label so it's at (5,5).
        layout.putConstraint(SpringLayout.WEST, label,
                             5,
                             SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, label,
                             5,
                             SpringLayout.NORTH, contentPane);

        //Adjust constraints for the text field so it's at
        //(<label's right edge> + 5, 5).
        layout.putConstraint(SpringLayout.WEST, textField,
                             5,
                             SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, textField,
                             5,
                             SpringLayout.NORTH, contentPane);

        //Adjust constraints for the content pane: Its right
        //edge should be 5 pixels beyond the text field's right
        //edge, and its bottom edge should be 5 pixels beyond
        //the bottom edge of the tallest component (which we'll
        //assume is textField).
        layout.putConstraint(SpringLayout.EAST, contentPane,
                             5,
                             SpringLayout.EAST, textField);
        layout.putConstraint(SpringLayout.SOUTH, contentPane,
                             5,
                             SpringLayout.SOUTH, textField);

                             
        //Adjust constraints for the content pane.
        setContainerSize(contentPane, 5);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
}

public static void setContainerSize(Container parent, int pad) {
    SpringLayout layout = (SpringLayout) parent.getLayout();
    Component[] components = parent.getComponents();
    Spring maxHeightSpring = Spring.constant(0);
    SpringLayout.Constraints pCons = layout.getConstraints(parent);

    //Set the container's right edge to the right edge
    //of its rightmost component + padding.
    Component rightmost = components[components.length - 1];
    SpringLayout.Constraints rCons =
            layout.getConstraints(rightmost);
    pCons.setConstraint(
            SpringLayout.EAST,
            Spring.sum(Spring.constant(pad),
                       rCons.getConstraint(SpringLayout.EAST)));

    //Set the container's bottom edge to the bottom edge
    //of its tallest component + padding.
    for (int i = 0; i < components.length; i++) {
        SpringLayout.Constraints cons =
            layout.getConstraints(components[i]);
        maxHeightSpring = Spring.max(maxHeightSpring,
                                     cons.getConstraint(
                                            SpringLayout.SOUTH));
    }
    pCons.setConstraint(
            SpringLayout.SOUTH,
            Spring.sum(Spring.constant(pad), maxHeightSpring));
}

}