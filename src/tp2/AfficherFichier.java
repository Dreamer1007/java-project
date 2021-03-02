package tp2;
import java.io.FileOutputStream;
public class AfficherFichier  implements IJournal{
	@Override
	public void outPut_msg(String message) {
		try {  
            // Recevoir le fichier 
		        FileOutputStream fos = new FileOutputStream("C:\\java\\example.txt");
	            String fileData = message;
	            fos.write(fileData.getBytes());
	            fos.flush();
	            fos.close();
          System.out.println("Text ajouté avec succés, check your file");
        }
        catch (Exception e) {
            System.err.println(e);
        }

	}

}
