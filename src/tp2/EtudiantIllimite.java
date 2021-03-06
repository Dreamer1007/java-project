package tp2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class EtudiantIllimite extends Etudiant {

	


	public EtudiantIllimite(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		super(matricule,nom,prenom,email,pwd,id_universite);
		
		this.nbLivreMensuel_Autorise = 0;
	}


}
