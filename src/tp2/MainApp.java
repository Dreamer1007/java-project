package tp2;

import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		
		EtudiantService serv=new EtudiantService();
		try {
			
			serv.inscription(8, "Randa", "randa", "meriem1855@gmail.com","xxxxxxx", 1);
			
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
