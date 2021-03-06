package tp2;

public interface IEtudiantFac {

	public Etudiant createEtu(int matricule, String nom, String prenom, String email,String pwd, int id_universite, TypePackage p) throws Exception;
}
