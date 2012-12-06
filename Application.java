/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author usb
 */
public final class Application extends JFrame{
    public JButton checkBtn;
    private BorderLayout layout;
    private Container container;
    public JLabel statusBar;
    private JButton HitBtn, DealBtn, StayBtn, DDBtn;
	
    public Application(){
        super("Black Jack"); //name of app
        statusBar = new JLabel("BlackJack");
        
        layout = new BorderLayout();  
        container = getContentPane();
        setLayout( layout ) ;
        
        JPanel bottomPanel = new JPanel();
        
        JMenu fileMenu = new JMenu("File"); //add File
        //add items inside File
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem exitItem = new JMenuItem("Exit");
        
        add(statusBar, BorderLayout.SOUTH);
        
        fileMenu.add(aboutItem);
        fileMenu.add(exitItem);
        
        //new menu bar
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(fileMenu);
        
        //add new button called Deal
        DealBtn = new JButton("Deal");
        DealBtn.addActionListener(
            new ActionListener() {
            @Override
                public void actionPerformed( ActionEvent event ) {
                    System.out.println("Deal");
                    statusBar.setText("dealing");
                }
            }//end anonymous class
        );//end addActionListener
        
        //add new button called Deal
        HitBtn = new JButton("Hit");
        HitBtn.addActionListener(
            new ActionListener() {
            @Override
                public void actionPerformed( ActionEvent event ) {
                    System.out.println("Hit");
                    statusBar.setText("clicked on hit");
                }
            }//end anonymous class
        );//end addActionListener
        
        //add new button called Deal
        JButton checkBtn = new JButton("check");
        
        JButton testBtn = buttonFactory("test","asdf");
        bottomPanel.add(testBtn);
        bottomPanel.add(DealBtn);
        bottomPanel.add(HitBtn);
        bottomPanel.add(checkBtn);
       
        JButton east = new JButton("eastasdfasdfasdf");
        JButton west = new JButton("westasdfasdfasdf");
        add(bottomPanel, BorderLayout.NORTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void showButton() {
        
    }
        
    
    public JButton buttonFactory(final String btnName, final String test) {
        JButton tmp = new JButton(btnName);
        tmp.addActionListener(new ActionListener() {
            private String Status = test;
            private String Name = btnName;
            @Override
                public void actionPerformed( ActionEvent event) {
                    System.out.println(Name);
                    statusBar.setText(Status);
                }
            }//end anonymous class
        );
        return tmp;
    }

    void addComponentListener(JButton checkBtn) {
        statusBar.setText("Herro!");
        System.out.println("herro clicked");
    }
	
}
