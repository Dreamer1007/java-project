package tp2;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		EtudiantService service=new EtudiantService();
	
		try {
			
			service.inscription(605, "rannda", "randa", "rannda@gmail.com","xxxxxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
		

}
