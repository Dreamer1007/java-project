package Affichage;
import java.util.*;

import Interface.IJournal;

public class AfficherDetail  implements IJournal {
	IJournal journal;
	public AfficherDetail (IJournal journal) {
		this.journal=journal;
	}
	
	@Override
	public void outPut_msg(String message) {
		System.out.println(message);
		System.out.println(new Date());
		System.out.println("La classe qui a g�n�r� ce message est: "+this.journal.getClass().getName());
}
}
