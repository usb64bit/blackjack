/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author usb
 */
public class Application extends JFrame{
	
	public Application(){
        super("Black Jack");
        JMenu fileMenu = new JMenu("File");
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem startItem = new JMenuItem("Start");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(startItem);
        fileMenu.add(aboutItem);
        fileMenu.add(exitItem);
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        bar.add(fileMenu);
		  this.setSize(500, 700);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setVisible(true);
    }
	
}
