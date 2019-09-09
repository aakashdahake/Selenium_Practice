package Selenium1;

public class Caller {
	
		public static void main(String[] args) {
			System.out.println("Initiating Web Automation");
			
			//Wake Firefox
			//WakeFirefox m=new WakeFirefox();
			//m.WakeFirefox();
			
			//Wake Chrome
			WakeChrome m1 = new WakeChrome();
			m1.WakeChrome();
					
			
		}
}
