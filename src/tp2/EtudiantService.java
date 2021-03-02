package tp2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class EtudiantService {
	
	
	boolean inscription (int matricule, String nom, String pr�nom, String email,String pwd, int id_universite) throws SQLException	
	{
		EtudiantRepository StudRep= new EtudiantRepository();
	    UniversiteRepository UnivRep= new UniversiteRepository();
	    Etudiant stud = new Etudiant(matricule, nom, pr�nom, email,pwd,id_universite);
	    Universite univ=UnivRep.GetById(id_universite);
	    
	    System.out.println("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
	    
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
		       
	     
		 StudRep.add(stud);
		 System.out.println("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
		 return true;
	    
		
	}

	
	void nombrelivremensuel(Etudiant stud,Universite univ) {
		// TODO Auto-generated method stub
		if(VerifierPackage.VerifierPackStandard(univ.getPack())) {
			 stud.setNbLivreMensuel_Autorise(10);
		}
		else if(VerifierPackage.VerifierPackPremium(univ.getPack())) {
			 stud.setNbLivreMensuel_Autorise(10*2);
		}
		
	}

	void AjouterBonus(ArrayList<Etudiant> e, int id_universite ,UniversiteRepository univrep, Universite univ) {
		// TODO Auto-generated method stub
		  for(int i =0; i< e.size();i++) {
		    	 if(VerifierPackage.VerifierPackStandard(univ.getPack())) {
		    		 e.get(i).addBonus(5);
		    	 }else if(VerifierPackage.VerifierPackPremium(univ.getPack())) {
		    		 e.get(i).addBonus(10);
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
