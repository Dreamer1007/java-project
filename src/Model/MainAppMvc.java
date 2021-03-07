package Model;

import Views.ViewInscription;

public class MainAppMvc {

	
	
	
	public static void main(String[] args) {
	
		
	try {
        final ViewInscription v = new ViewInscription();
        v.Show_Inscription();
    }
    catch (Exception e) {
        e.printStackTrace();
        
    }
}
	
}
