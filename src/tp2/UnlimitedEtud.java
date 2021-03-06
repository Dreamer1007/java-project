package tp2;

public abstract class UnlimitedEtud extends LimitedEtud {

	
	public abstract void AddBonusAl();

	public UnlimitedEtud(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		super(matricule,nom,prenom,email,pwd,id_universite);
	}
}
