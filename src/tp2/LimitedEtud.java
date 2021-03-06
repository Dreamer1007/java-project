package tp2;

import java.sql.SQLException;


public abstract class LimitedEtud extends Etudiant {
	
	public abstract void AddBonusAl() throws SQLException;

	public LimitedEtud(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		super(matricule,nom,prenom,email,pwd,id_universite);
	}
}
