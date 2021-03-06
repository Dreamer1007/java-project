package tp2;

import java.sql.SQLException;

public class ControleurInscription {
	
	public void inscriptionControl (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws SQLException
	{
		EtudiantService serv=new EtudiantService();
	
	try {
		
		serv.inscription(899, "batata", "batata", "merbatata@gmail.com","xxxxxxx", 1);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
	}
