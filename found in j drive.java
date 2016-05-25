
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MyEditorFrame extends JFrame
{
    private final int WIDTH = 750;
    private final int HEIGHT = 410;
    private int row = 10;
    private int col = 20;
    private int counter=0;
    private JTextArea conversionTA;
    private JButton exitB;
    private ButtonEventHandler eventHandler;
    private JScrollPane scroll;

    public MyEditorFrame() throws Exception {

     setTitle("My Editor...");
     setSize(WIDTH,HEIGHT);

     Scanner scan = new Scanner(new File("H:\\info.txt"));

     Container pane=getContentPane();

     MyEditorFrame.setBackground(Color.BLUE);

     conversionTA=new JTextArea();
     scroll = new JScrollPane(conversionTA);
     scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


     exitB=new JButton("Exit and Save");
     exitB=new JButton("Exit");

     eventHandler=new ButtonEventHandler();
     exitB.addActionListener(eventHandler);


      //set the layout of the pane to null
      pane.setLayout(null);

      //set the locations of the GUI components
      conversionTA.setLocation(10, 10);
      exitB.setLocation(240, 320);


      //set the sizes of the GUI components
      conversionTA.setSize(725, 300);
      exitB.setSize(200, 30);

      conversionTA.setWrapStyleWord(true);

      //add components to the pane
      pane.add(scroll);
      //pane.add(conversionTA);
      pane.add(exitB);

      scroll.setBounds(10,10,720,300);
      scroll.setVisible(true);

      setVisible(true);
      conversionTA.setLineWrap(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      String theStr="";
      while(scan.hasNextLine()) {
			theStr=theStr + scan.nextLine();
			theStr=theStr + "\n";
		}
		scan.close(); // close the file....
		conversionTA.setText(theStr);

    } //end of the constructor


    private class ButtonEventHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {


            if (e.getActionCommand().equals("Exit and Save")) {
                  try {
                  	doSave();
                  }
                  catch (FileNotFoundException x) {
    				 System.err.println("FileNotFoundException: " + x.getMessage());
    			   }
    			   catch (IOException x) {
    				 System.err.println("Caught IOException: " + x.getMessage());
					}
                  System.exit(0);
            }

        }
    }

 public void doSave() throws IOException {
 	 	String temp=conversionTA.getText();
        FileWriter outFile = new FileWriter("H:\\info.txt",false); //open file to write with append off
        PrintWriter out = new PrintWriter(outFile);
        out.println(temp); // Write text to file
        out.close(); // close the file....
 }
}



?????????????????????????????????????????????????????????????????????????



/**
 * @(#)MyWindow.java
 *
 * JFC MyWindow application
 *
 * @author
 * @version 1.00 2015/2/18
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyWindow {

    public static void main(String[] args) throws Exception {

        // Create application frame.
        MyEditorFrame frame = new MyEditorFrame();

        // Show frame.
        frame.setVisible(true);
    }
}