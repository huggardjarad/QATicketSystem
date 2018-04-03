

public class Ticket {

	//Todays Day Wednesday = 1 Every other day = 0
	int day = 1;
	
	//Prices
	int standardticket = 8;
	int studentticket = 6;
	int oapticket = 6;
	int childticket = 4;
	
	//Discount
	int discount = -2;
	
      public void checkPrice() {
    	  System.out.println("Hello and Welcome to QA Cinemas, Here are our Ticket Prices:");
    	 
    	  if (day > 0) 
    		  {System.out.println (" Standard £" + (standardticket + discount) + 
    				  " Student £" +  (studentticket + discount) + 
    				  " OAP £" + (oapticket + discount) +" Child £" + (childticket + discount) );}
    	  else if (day == 0)
    	  {System.out.println(" Standard £" + standardticket + " Student £" + studentticket +
    			  " OAP £" + oapticket + " Child £" + childticket);}
    
      }
      //Total Ticket Amounts
      int studentTotal = 2;
      int standardTotal = 2;
      int oapTotal = 1;
      int childTotal = 1;
      
      
	  public void getTotal() {
		  System.out.println("Your Total Ticket Cost is £");
		  
		  if 
		  (day > 0)
		  {System.out.println(studentTotal * (studentticket + discount) + standardTotal * (standardticket + discount) + 
				  oapTotal * (oapticket + discount) + childTotal * (childticket + discount));}
		  else if 
		  (day == 0)
		  {System.out.println(studentTotal * studentticket + standardTotal * standardticket + 
				  oapTotal * oapticket + childTotal * childticket);}
		  
	  }
	  
	  
	
	public static void main(String[] args)
	{
		Ticket Intro = new Ticket();
		Intro.checkPrice();
		
		Student Ticket = new Student ();
		Ticket.purchase();
		
		Normal Ticket2  = new Normal();
		Ticket2.purchase();
		
		Oap Ticket3 = new Oap();
		Ticket3.purchase();
		
		Child Ticket4 = new Child();
		Ticket4.purchase();
		
		Ticket Total = new Ticket();
		Total.getTotal();
    
	  
	}
	
	

}

