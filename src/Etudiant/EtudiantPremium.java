package Etudiant;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import DB.DBConnection;


public  class EtudiantPremium extends EtudiantLimite {
	
	public EtudiantPremium(int matricule, String nom, String prenom, String email,String pwd, int id_universite) {
		super(matricule,nom,prenom,email,pwd,id_universite);
	}
	
	@Override
	public  void AddBonusAl() throws SQLException
    {
		int m=10;
		DBConnection.setConnexion();
		Connection connect=DBConnection.getConn();
		
		Statement stat = connect.createStatement();
		String sql = "UPDATE etudiant SET nbLivreMensuel_Autorise =nbLivreMensuel_Autorise+"+m+" + WHERE 1";
		
		int rs = stat.executeUpdate(sql);
		System.out.println(rs);
		if (rs == 1){
			
				System.out.println("log :  update livre mensuel autorise " + this.getMatricule());
			}else if (rs == 0){
				System.out.println("log : Echec de update livre mensuel autorise " + this.getMatricule());
			}
		
		connect.close();
    
    }

}
