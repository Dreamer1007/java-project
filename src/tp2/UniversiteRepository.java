package tp2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversiteRepository  implements IUniversiteRepository{		 
	
		public Universite GetById(int universityId) throws SQLException {
		
		DBConnection.setConnexion();
		Connection connect=DBConnection.getConn();
		Statement stat = connect.createStatement();
		System.out.println("LogBD : debut recherche de id universit� dans la base de donn�e");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stat.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new Universite (rs.getInt(1),rs.getString(2),p);
			
		System.out.println("LogBD : universite recuperee");
		
		connect.close();
		return u;	
	
		
	}
	
}
