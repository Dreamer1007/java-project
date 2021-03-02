package tp2;

public class VerifierEmail {
	public static boolean VerifierEmailNull(String email) {
		boolean verif = false;
		if(email == null) {
		  verif = true;
		}
		return verif;
	}
	
	public static boolean VerifierEmailEmpty(String email) {
		boolean verif = false;
		if(email.length() == 0) {
		  verif = true;
		}
		return verif;
	}

}
