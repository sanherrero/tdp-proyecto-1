package launcher;

import entities.Student;
import gui.SimplePresentationScreen;


public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student estudiante = new Student (64205, "Herrero", "Santiago", "sgoherrero@gmail.com", "https://github.com/sanherrero", "/images\fotoSantiago.jpg" );
            	
            	SimplePresentationScreen simplePresentationScreen = new SimplePresentationScreen(estudiante);
				simplePresentationScreen.setVisible(true);
            	
            }
        });
    }
}