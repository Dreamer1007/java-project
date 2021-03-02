package tp2;

public class VerifierPackage {
	public static boolean VerifierPackStandard(TypePackage s) {
		 
		if(s == TypePackage.Standard) {
			return true;
		}
		
		return false;
	}
	
	public static boolean VerifierPackPremium(TypePackage s) {
		 
		if(s == TypePackage.Premium) {
			return true;
		}
		
		return false;
	}

}
