package Affichage;

import Interface.IJournal;

public class AfficherEcran  implements IJournal {
	@Override
	public void outPut_msg(String message) {
		
		System.out.println(message);
		
		
	}
	
}
