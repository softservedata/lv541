package com.myproject.factory;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class DialogFactory extends JFrame {
    private static final long serialVersionUID = 1L;
    //
    private JLabel tLabel = new JLabel("     Time:");
    private JTextField tOutput = new JTextField("", 15);
    private JButton buttonTime = new JButton("GetTime");
    private JButton buttonExit = new JButton("Exit");
    private JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));

    public DialogFactory() {
        super("Clock");
        this.setBounds(100, 100, 250, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //
        centerPanel.add(tLabel);
        centerPanel.add(tOutput);
        centerPanel.add(buttonTime);
        centerPanel.add(buttonExit);
        Container container = this.getContentPane();
        container.add(centerPanel, BorderLayout.CENTER);
        //
        buttonTime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                System.out.println("buttonTime: Thread ID = " + Thread.currentThread().getId());
            }
        });

        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("buttonExit: Thread ID = " + Thread.currentThread().getId());
                setVisible(false);
                System.exit(0);
            }
        });
    }

    public void setTOutput(String textOutput) {
        //DialogTime tt = DialogTime.this;
        tOutput.setText(textOutput);
    }

}
