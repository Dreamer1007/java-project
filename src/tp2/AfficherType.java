package tp2;

public class AfficherType implements IJournal {
	
	IJournal journal;
	public AfficherType(IJournal journal) {
		this.journal=journal;
	}
	
	
	IJournal afficherecran = new AfficherEcran();
	IJournal afficherfichier = new AfficherFichier();
	IJournal afficherdetail = new AfficherDetail(afficherfichier);
	
	
	@Override
	public void outPut_msg(String message) {
	
		switch(this.journal.getClass().getName()) {
		case "tp2.AfficherEcran":
			afficherecran.outPut_msg(message);
		break;
		case "tp2.AfficherFichier":
			afficherfichier.outPut_msg(message);
		break;
		case "tp2.AfficherDetail":
			journal.outPut_msg(message);
		break;
		}
		
	}
	
}
