package tp2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	
	public boolean inscription (int matricule, String nom, String prénom, String email,String pwd, int id_universite) throws Exception	
	{
		EtudiantRepository StudRep= new EtudiantRepository();
	    UniversiteRepository UnivRep= new UniversiteRepository();
	    
	    // Etudiant stud = new Etudiant(matricule, nom, prénom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    EtudiantFactory etf = new EtudiantFactory();
	    Etudiant stud = etf.createEtu(matricule, prénom, nom, email, pwd, id_universite, TypePackage.Standard);
	    
	    
	    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	    
	    if(VerifierEmail.VerifierEmailNull(email) ||VerifierEmail.VerifierEmailEmpty(email))
	    {
	    	return false;
	    }
	    
	    if (StudRep.Exists(matricule))
	    {
	        return false;
	    }
	    
		if (StudRep.Exists(email))
	    {
	        return false;
	    } 
		
		 if(VerifierPackage.VerifierPack(univ.getPack()))
		 {
			 stud.setNbLivreMensuel_Autorise(10);
			 System.out.println("hello");

		 }
		 else
	     {
	    	 stud.setNbLivreMensuel_Autorise(10*2);
	     }
	     
		 StudRep.add(stud);
		 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 return true;
	    
		
	}

	
	void nombrelivremensuel(Etudiant stud,Universite univ) {
		// TODO Auto-generated method stub
		if(VerifierPackage.VerifierPack(univ.getPack())) {
			 stud.setNbLivreMensuel_Autorise(10);
		}
		else{
			 stud.setNbLivreMensuel_Autorise(10*2);
		}
		
	}

	void AjouterBonus(ArrayList<Etudiant> e, int id_universite ,UniversiteRepository univrep, Universite univ) {
		// TODO Auto-generated method stub
		  for(int i =0; i< e.size();i++) {
		    	 if(VerifierPackage.VerifierPack(univ.getPack())) {
		    		 e.get(i).ajouterBonus(5);
		    	 }else {
		    		 e.get(i).ajouterBonus(10);
		    	 }
		     }
	}


public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}


}