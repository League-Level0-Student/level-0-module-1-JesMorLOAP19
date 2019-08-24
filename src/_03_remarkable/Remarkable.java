package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String jessica= "has brown eyes";
String pinkfact="is tall";
String maristar="has wavy hair";
String input=JOptionPane.showInputDialog("whose name is shorter");
// 2. Ask the user to enter a name. Store their answer in a variable.
if(input.equals("jessica")){
JOptionPane.showMessageDialog(null,"jessica thingis"+jessica );
}

if (input.equals("pink fact")) {
JOptionPane.showMessageDialog(null,"pink fact thing is"+pinkfact);	
}
		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

