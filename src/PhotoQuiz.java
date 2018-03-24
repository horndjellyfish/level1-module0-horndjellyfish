/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String image = "https://static1.squarespace.com/static/552dd168e4b0e28fdcecdbcf/57bb7c0a3e00be03ee97fb38/57bb7c2615d5dbc1c52fb350/1471904807951/Rhett+and+Link.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component comp;
		// 3. use the "createImage()" method below to initialize your Component
		comp = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("Which one is taller, Rhett or Link?");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans.equalsIgnoreCase("Rhett")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line of code)
		String secimage = "http://images.amcnetworks.com/bbcamerica.com/wp-content/uploads/2014/04/davidtennant-1600x720.jpg";
		comp = createImage(secimage);
		// 11. add the second image to the quiz window
		quizWindow.add(comp);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answ = JOptionPane.showInputDialog("Which Doctor is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answ.equals("10")|| answ.equalsIgnoreCase("Tenth")|| answ.equalsIgnoreCase("Ten")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





