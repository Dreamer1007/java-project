package tp2;

public abstract class EtudiantIllimite extends Etudiant {

	public abstract void AddBonusAl();

	public EtudiantIllimite(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		super(matricule,nom,prenom,email,pwd,id_universite);
		this.nbLivreMensuel_Autorise = 0;

	}
}
