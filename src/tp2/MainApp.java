package tp2;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		EtudiantService serv=new EtudiantService();
		try {
			
			serv.inscription(8, "batata", "batata", "batata@gmail.com","xxxxxxx", 1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Question 9-10 Tester les classes:
		IJournal afficherfichier = new AfficherFichier();
		IJournal test = new AfficherType(afficherfichier);
		test.outPut_msg("Test");
		
	
	
	}

}
