package tp2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantRepository implements IEtudiantRepository {
	
	 private IEtudiantRepository ietudrep;
	 
	 public EtudiantRepository (IEtudiantRepository ietudrep) {
		 this.ietudrep = ietudrep;
	 }
	 
		public EtudiantRepository() {
		// TODO Auto-generated constructor stub
	}

		public IEtudiantRepository getietudrep() {
			return  ietudrep;
		}


		public void Setietudrep(IEtudiantRepository ietudrep) {
			this.ietudrep = ietudrep;
		}
	 
	 
	public void add(Etudiant E) throws SQLException
	{

		DBConnection.setConnexion();
		Connection connect=DBConnection.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + E.getMatricule() + ",'" + E.getNom() + "','" + E.getPrenom() + "','" + E.getEmail()+ "','" + E.getPwd() + "'," +E.getNbLivreMensuel_Autorise() + "," +E.getNbLivreEmprunte() + "," +E.getId_universite()+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
				System.out.println("log : ajout dans la BD réussi de l'étudiant  du Matricule" + E.getMatricule());
			}else if (rs == 0){
				System.out.println("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + E.getMatricule());
			}
		connect.close();
	 }


	public boolean Exists(String email) throws SQLException
	{
		DBConnection.setConnexion();
		Connection connect=DBConnection.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		ResultSet rs = stmt.executeQuery(sql);
		
		if (rs.next()){
			System.out.println("logBD--- :email existe dans la BD  " + email);
			connect.close();
			return true;
			}
		System.out.println("logBD--- : email n'existe pas " + email);	
		connect.close();
		return false;
	}
	
	public boolean Exists(int mat) throws SQLException	
	{
		DBConnection.setConnexion();
		Connection connect=DBConnection.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		ResultSet rs = stmt.executeQuery(sql);
		
		if (rs.next()){
			System.out.println("logBD--- :etudiant avec cette matricule existe déja dans la BD  " + mat);
			
			return true;
			}
		System.out.println("logBD----: etudiant avec cette matricule n'existe pas " + mat);	
		
		return false;
	}

	
	
}
