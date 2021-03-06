package tp2;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class EtudiantIllimite extends Etudiant {

	


	public EtudiantIllimite(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		super(matricule,nom,prenom,email,pwd,id_universite);
		
		this.nbLivreMensuel_Autorise = 0;
=======
public abstract class EtudiantIllimite extends Etudiant {

	public abstract void AddBonusAl();

	public EtudiantIllimite(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		super(matricule,nom,prenom,email,pwd,id_universite);
		this.nbLivreMensuel_Autorise = 0;

>>>>>>> 497ee42c13b0a82325f10ae4e14594ef62638054
	}


}
