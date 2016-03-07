import java.util.ArrayList; 
import java.util.Scanner; 


public class HW11_16 {
	public static void main(String[] args) { 
		int number1 = (int)(Math.random() * 10); 
         	int number2 = (int)(Math.random() * 10); 
 
         	Scanner input = new Scanner(System.in); 
         	ArrayList<Integer> repeatedAnswers = new ArrayList<>(); 
 
         	System.out.print( "What is " + number1 + " + " + number2 + "? "); 
         	int answer = input.nextInt(); 
 
        	while (number1 + number2 != answer) { 
         		if (repeatedAnswers.contains(answer)) { 
                		System.out.println("You already answered " + answer); 
             		} 
             	System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? "); 
             	repeatedAnswers.add(answer); 
             	answer = input.nextInt(); 
         	} 
 
 		System.out.println("You got it!"); 
     	} 
} 