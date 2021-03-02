package tp2;

public class VerifierPackage {
	public static boolean VerifierPackStandard(TypePackage s) {
		 
		if(s == TypePackage.Standard) {
			return true;
		}
		
		return false;
	}
	
	public static boolean VerifierPackPremium(TypePackage p) {
		 
		if(p == TypePackage.Premium) {
			return true;
		}
		
		return false;
	}

}
