package launcher;

import entities.*;
import gui.*;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
            		Student estudiante = new Student(128796, "Lockhart", "Jano Axel", "janolockhart@gmail.com", "https://github.com/JanoALockhart", "../images/tdp.png");
            		SimplePresentationScreen interfaz = new SimplePresentationScreen(estudiante);
            		interfaz.setVisible(true);
            	}catch(Exception e) {
            		e.printStackTrace();
            	}
            }
        });
    }
}