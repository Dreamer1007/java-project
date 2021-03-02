package tp2;

import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  
           DIP.Notification notification = new  DIP.Notification(new DIP.WebMail());
		 */

		EtudiantService serv=new EtudiantService();
		try {
			
			serv.inscription(7, "Randa", "randa", "meriem18@gmail.com","xxxxxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
