
public class Normal extends Ticket {
	
	//Todays Day Wednesday = 1 Every other day = 0
			int day = 1;
			
		//Ticket Price
		int standardPrice = 8; 
		int ticketAmount = 2;
		//Ticket Total
		int ticketTotal = standardPrice * ticketAmount;
		
		public void purchase() {
			
			if (day > 0) 
				System.out.println("You have Purchased " + ticketAmount + " Standard Ticket(s) for £ " +
			(ticketTotal - 2 * ticketAmount));
			
			else if (day < 0)
		System.out.println("You have Purchased " + ticketAmount + " Standard Ticket(s) for £ " + ticketTotal);
		}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
}
}