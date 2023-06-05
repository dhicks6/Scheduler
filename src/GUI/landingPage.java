// I am currently using the Oracle docs to get started

/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
*/

package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.Container;


public class landingPage {
    

    
    public static void createAndShowLandingPage() {
        //Create and set up the window.
        JFrame landingPageFrame = new JFrame("Scheduler");
        landingPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        Container contentPane = landingPageFrame.getContentPane();
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

        //Display the window.
        landingPageFrame.pack();
        landingPageFrame.setVisible(true);

    }




    
}
