package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String q1 = JOptionPane.showInputDialog("What is 1 + 1?");
		if (q1.equals ("2") ){
			score = score + 1;
		}
		else {
			score = score - 1;
		}
		String q2 = JOptionPane.showInputDialog("What is 2 + 2?");
		if (q2.equals ("4") ) {
			score = score + 1;
		}
		else
			score = score - 1;
		String q3 = JOptionPane.showInputDialog("What is 3 + 3?");
		if (q3.equals ("6") ) {
			score = score + 1;
		}
		else {
			score = score - 1;
		}
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		JOptionPane.showMessageDialog(null, "This is your final score: " + score);
		// After all the questions have been asked, tell the user their final score 
		
	}
}
