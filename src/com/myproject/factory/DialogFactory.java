package com.myproject.factory;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;


public class DialogFactory extends JFrame {
    private static final long serialVersionUID = 1L;
    //
    private DefaultListModel<Cab> listModelC = new DefaultListModel<Cab>();
    private DefaultListModel<¿ccessories> listModelA = new DefaultListModel<¿ccessories>();
    private JLabel tLabelC = new JLabel("Cab warehouse:");
    private JLabel tLabelA = new JLabel("¿ccessories warehouse:");
    private JList<Cab> tOutputC = new JList<Cab>(listModelC);
    private JList<¿ccessories> tOutputA = new JList<¿ccessories>(listModelA);
    private JButton buttonExit = new JButton("Exit");
    private JPanel centerPanel = new JPanel(new GridLayout(3, 3, 6, 6));

    
    public DialogFactory() {
        this.setBounds(100, 100, 1500, 900);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //
        centerPanel.add(tLabelC);
        centerPanel.add(tOutputC);
        
        tOutputC.setSelectedIndex(0);
        tOutputC.setFocusable(false);
        centerPanel.add(new JScrollPane(tOutputC), BorderLayout.CENTER);       centerPanel.add(tLabelA);
        
        centerPanel.add(tOutputA);
        
        tOutputA.setSelectedIndex(0);
        tOutputA.setFocusable(false);
        centerPanel.add(new JScrollPane(tOutputA), BorderLayout.CENTER);
        
       // centerPanel.add(buttonExit);
        Container container = this.getContentPane();
        container.add(centerPanel, BorderLayout.NORTH);
        //


        

        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("buttonExit: Thread ID = " + Thread.currentThread().getId());
                setVisible(false);
                System.exit(0);
            }
        });
    }

    public void cabSetOutput(Cab someCab) {

    	listModelC.addElement(someCab);
    	int index = listModelC.size() - 1;
    	tOutputC.setSelectedIndex(index);
    	tOutputC.ensureIndexIsVisible(index);
    }
    
    public void accessoriesSetOutput(¿ccessories some¿ccessories) {

    	listModelA.addElement(some¿ccessories);
    	int index = listModelA.size() - 1;
    	tOutputA.setSelectedIndex(index);
    	tOutputA.ensureIndexIsVisible(index);
    }
    
    public void cabRemove(Cab someCab) {

    	listModelC.removeElement(someCab);
    }
    
    public void accessoriesRemove(¿ccessories some¿ccessories) {

    	listModelA.removeElement(some¿ccessories);
    }

}
