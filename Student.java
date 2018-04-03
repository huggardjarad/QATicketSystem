
public class Student extends Ticket {
	
	//Todays Day Wednesday = 1 Every other day = 0
		int day = 1;
		
	//Ticket Price
	int studentPrice = 6; 
	int ticketAmount = 2;
	//Ticket Total
	int ticketTotal = studentPrice * ticketAmount;
	
	public void purchase() {
		
		if (day > 0) 
			System.out.println("You have Purchased " + ticketAmount + " Student Ticket(s) for £ " +
		(ticketTotal - 2 * ticketAmount));
		
		else if (day<0)
	System.out.println("You have Purchased " + ticketAmount + " Student Ticket(s) for £ " + ticketTotal);
	}

	public static void main(String[] args) {

		
		
		
		
		
	}

}
