package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("Hello World");
	System.out.println("Welcome");
	System.out.println();
	System.out.println("Good Bye");
	String input = JOptionPane.showInputDialog("What is your name?");
	System.out.println(input);
	JOptionPane.showMessageDialog(null,"Hello "+input+ " Have a good day");
}
}
