package tp2;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		EtudiantService service=new EtudiantService();
		
		try {
            final ViewInscription v = new ViewInscription();
            v.Show_Inscription();
        }
	    catch (Exception e) {
            e.printStackTrace();
            
        }
		
		try {
			
			service.inscription(605, "rannda", "randa", "rannda@gmail.com","xxxxxxx", 1);
			
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
