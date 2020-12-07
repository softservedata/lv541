package com.myproject.factory;

import java.awt.BorderLayout;
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
    private DefaultListModel<Engine> listModelE = new DefaultListModel<Engine>();
    private DefaultListModel<Object> listModelWorker1 = new DefaultListModel<Object>();
    private DefaultListModel<Object> listModelWorker2 = new DefaultListModel<Object>();
    private DefaultListModel<Object> listModelWorker3 = new DefaultListModel<Object>();
    private DefaultListModel<Car> listModelCar = new DefaultListModel<Car>();
    private JLabel tLabelC = new JLabel("Cab warehouse:");
    private JLabel tLabelA = new JLabel("¿ccessories warehouse:");
    private JLabel tLabelE = new JLabel("Engine warehouse:");
    private JLabel tLabelW1 = new JLabel("Worker 1:");
    private JLabel tLabelW2 = new JLabel("Worker 2:");
    private JLabel tLabelW3 = new JLabel("Worker 3:");
    private JLabel tLabelCar = new JLabel("Cars:");
    private JList<Cab> tOutputC = new JList<Cab>(listModelC);
    private JList<¿ccessories> tOutputA = new JList<¿ccessories>(listModelA);
    private JList<Engine> tOutputE = new JList<Engine>(listModelE);
    private JList<Object> tOutputWorker1 = new JList<Object>(listModelWorker1);
    private JList<Object> tOutputWorker2 = new JList<Object>(listModelWorker2);
    private JList<Object> tOutputWorker3 = new JList<Object>(listModelWorker3);
    private JList<Car> tOutputCar = new JList<Car>(listModelCar);
    private JButton buttonExit = new JButton("Exit");
    private JPanel centerPanel = new JPanel(new GridLayout(3, 3, 6, 6));
    private JPanel workPanel = new JPanel(new GridLayout(4, 4, 4, 4));

    
    public DialogFactory() {
        this.setBounds(100, 100, 600, 900);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //
        centerPanel.add(tLabelC);
        centerPanel.add(tOutputC);
        
        tOutputC.setSelectedIndex(0);
        tOutputC.setFocusable(false);
        centerPanel.add(new JScrollPane(tOutputC), BorderLayout.CENTER);      
        
        centerPanel.add(tLabelA);
        centerPanel.add(tOutputA);
        
        tOutputA.setSelectedIndex(1);
        tOutputA.setFocusable(false);
        centerPanel.add(new JScrollPane(tOutputA), BorderLayout.CENTER);
        
        centerPanel.add(tLabelE);
        centerPanel.add(tOutputE);
        

        
        tOutputE.setSelectedIndex(3);
        tOutputE.setFocusable(false);
        centerPanel.add(new JScrollPane(tOutputE), BorderLayout.CENTER);
        
        workPanel.add(tLabelW1);
        workPanel.add(tOutputWorker1);
        tOutputWorker1.setSelectedIndex(1);
        tOutputWorker1.setFocusable(false);
        workPanel.add(new JScrollPane(tOutputWorker1), BorderLayout.CENTER);
    
        workPanel.add(tLabelW2);
        workPanel.add(tOutputWorker2);
        tOutputWorker2.setSelectedIndex(2);
        tOutputWorker2.setFocusable(false);
        workPanel.add(new JScrollPane(tOutputWorker2), BorderLayout.CENTER);
        
        workPanel.add(tLabelW3);
        workPanel.add(tOutputWorker3);
        tOutputWorker3.setSelectedIndex(3);
        tOutputWorker3.setFocusable(false);
        workPanel.add(new JScrollPane(tOutputWorker3), BorderLayout.CENTER);
        
        workPanel.add(tLabelCar);
        workPanel.add(tOutputCar);
        tOutputCar.setSelectedIndex(4);
        tOutputCar.setFocusable(false);
        workPanel.add(new JScrollPane(tOutputCar), BorderLayout.CENTER);
        
      
       // centerPanel.add(buttonExit);
        Container container = this.getContentPane();
        container.add(centerPanel, BorderLayout.NORTH);
        
        container.add(workPanel, BorderLayout.CENTER);
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
    
    public void carSetOutput(Car someCar) {

    	listModelCar.addElement(someCar);
    	int index = listModelCar.size() - 1;
    	tOutputCar.setSelectedIndex(index);
    	tOutputCar.ensureIndexIsVisible(index);
    }
    
    public void accessoriesSetOutput(¿ccessories some¿ccessories) {

    	listModelA.addElement(some¿ccessories);
    	int index = listModelA.size() - 1;
    	tOutputA.setSelectedIndex(index);
    	tOutputA.ensureIndexIsVisible(index);
    }
    
    public void engineSetOutput(Engine someEngine) {

    	listModelE.addElement(someEngine);
    	int index = listModelE.size() - 1;
    	tOutputE.setSelectedIndex(index);
    	tOutputE.ensureIndexIsVisible(index);
    }
    
    public void workerSetOutput(Worker worker, Object someObject) {
    	DefaultListModel<Object> listModel = new DefaultListModel<Object>();
    	JList<Object> tOutput = new JList<Object>();
    	if (worker.getID() == 1) {
    		listModel = listModelWorker1;
    		tOutput = tOutputWorker1;
    	}else if (worker.getID() == 2) {
    		listModel = listModelWorker2;
    		tOutput = tOutputWorker2;
    	}
    	else if (worker.getID() == 3) {
    		listModel = listModelWorker3;
    		tOutput = tOutputWorker3;
    	}
    	listModel.addElement(someObject);
    	int index = listModel.size() - 1;
    	tOutput.setSelectedIndex(index);
    	tOutput.ensureIndexIsVisible(index);
    }
    
    public void workerDeleteObject(Worker worker, Object someObject) {
    	DefaultListModel<Object> listModel = new DefaultListModel<Object>();
    	if (worker.getID() == 1) {
    		listModel = listModelWorker1;
    	}else if (worker.getID() == 2) {
    		listModel = listModelWorker2;
    	}
    	else if (worker.getID() == 3) {
    		listModel = listModelWorker3;
    	}
    	listModel.removeElement(someObject);
    }
    
    public void engineSetOutput(¿ccessories some¿ccessories) {

    	listModelA.addElement(some¿ccessories);
    	int index = listModelA.size() - 1;
    	tOutputA.setSelectedIndex(index);
    	tOutputA.ensureIndexIsVisible(index);
    }
  
    
    public void cabRemove(Cab someCab) {

    	listModelC.removeElement(someCab);
    }
    
    public void carRemove(Car someCar) {

    	listModelCar.removeElement(someCar);
    }
    
    public void accessoriesRemove(¿ccessories some¿ccessories) {

    	listModelA.removeElement(some¿ccessories);
    }
    
    public void engineRemove(Engine someEngine) {

    	listModelE.removeElement(someEngine);
    }


}
