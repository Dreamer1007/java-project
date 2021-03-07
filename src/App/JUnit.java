package App;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Etudiant.EtudiantService;

class JUnit {

	@Test
	public void test() throws Exception {
	    
		EtudiantService service = new EtudiantService();
		boolean b = service.inscription(004, "user4" , "user4", "user4@gmail.com", "motdepasse", 1);
		assertEquals(true,b);
		
		boolean b1 = service.inscription(002, "user1" , "user1", "user1@gmail.com", "motdepasse1", 5);
		assertEquals(false,b1);
		
	}

}
