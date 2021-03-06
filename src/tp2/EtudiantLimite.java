package tp2;

import java.sql.SQLException;


public abstract class EtudiantLimite extends Etudiant {
	
	public abstract void AddBonusAl() throws SQLException;

	public EtudiantLimite(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		super(matricule,nom,prenom,email,pwd,id_universite);
	}
}
