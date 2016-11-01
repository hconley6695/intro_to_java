import java.util.Scanner; 


//executes sequentially
public class GuessMyNumber { 
	//this method will not be run until it's called later in the main code
	public static void doSomething() {
		System.out.println("I'm doing something.");
	}
	//need to use main method for it to run.  
    public static void main(String[] args) { 
        System.out.println("GuessMyNumber is running!"); 


        //will now run method doSomething from above
        doSomething();
        // Ask the user for their number 
        // and store it in an int variable
        System.out.println("Please enter a number between 0 and 10"); 
        //System.in is how we read from the console
        Scanner inputScanner = new Scanner(System.in); 
        //nextInt method on class Scanner (is waiting for user to input the number)
        int userNumber = inputScanner.nextInt(); 
        System.out.println("You entered: " + userNumber); 

        // Generate a random number between 0 and 10
        // and store it in another int variable
        //Math.random gives you number between 0 and 1, then multiply by 10 to give higher number
        // you cast it to an (int)
        int computerNumber = (int) (Math.random() * 10); 
        System.out.println("Computer generated: " + computerNumber); 

        // Compare the two and display who won
        if (userNumber > computerNumber) { 
            System.out.println("You win!"); 
        } else { 
            System.out.println("I win!"); 
        }

        System.out.println("Thank you for playing!"); 
    }
}

