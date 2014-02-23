package com.organization4242.delmgorb.View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ilya-murzinov on 22.02.14.
 */
public class MainWindowView extends JPanel{
    private JFrame jf;
    private JLabel label;
    private int textFieldNumber = 14;
    private JTextField[] textFields = new JTextField[textFieldNumber];
    private JButton button;

    public JTextField[] getTextFields() {
        return textFields;
    }

    public JButton getButton() {
        return button;
    }

    public MainWindowView() {
        jf = new JFrame("Main Window");
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e){
        }
        jf.setSize(400, 160);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        label = new JLabel("Input parameters:");
        for (int i=0; i<textFieldNumber; i++)
            textFields[i] = new JTextField(4);
        button = new JButton("Draw!");
        GridBagLayout gbl = new GridBagLayout();
        jf.setLayout(gbl);
        GridBagConstraints c =  new GridBagConstraints();
        c.anchor = GridBagConstraints.PAGE_START;
        c.fill   = GridBagConstraints.NONE;
        c.gridheight = 1;
        c.insets = new Insets(10, 0, 0, 0);
        c.gridy = 0;
        c.ipadx = 0;
        c.ipady = 0;
        c.weightx = 1.0;
        c.weighty = 0.0;
        c.gridwidth = textFieldNumber/2;
        gbl.setConstraints(label, c);
        jf.add(label);
        c.gridy++;
        c.gridwidth = 1;
        for (int i=0; i<textFieldNumber/2; i++) {
            gbl.setConstraints(textFields[i], c);
            jf.add(textFields[i]);
        }
        c.gridy++;
        for (int i=textFieldNumber/2; i<textFieldNumber; i++) {
            gbl.setConstraints(textFields[i], c);
            jf.add(textFields[i]);
        }
        c.gridy++;
        c.gridx = 5;
        c.gridwidth = 2;
        c.insets = new Insets(10, 0, 0, 0);
        gbl.setConstraints(button, c);
        jf.add(button);
    }

    public void display() {
        jf.setVisible(true);
    }
}
