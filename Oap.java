
public class Oap extends Ticket {
	
	//Todays Day Wednesday = 1 Every other day = 0
			int day = 1;
			
		//Ticket Price
		int oapPrice = 6; 
		//How many Tickets you wish to buy
		int ticketAmount = 1;
		//Ticket Total
		int ticketTotal = oapPrice * ticketAmount;
		
		public void purchase() {
			
			if (day > 0) 
				System.out.println("You have Purchased " + ticketAmount + " OAP Ticket(s) for £ " +
			(ticketTotal - 2 * ticketAmount));
			
			else if (day < 0)
		System.out.println("You have Purchased " + ticketAmount + " OAP Ticket(s) for £ " + ticketTotal);
		}
	
	

	public static void main(String[] args) {

		
	
		
		
		
	}

}
