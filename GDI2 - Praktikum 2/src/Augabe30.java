import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Augabe30 {
	
	public static void main(String [] args) {
		try {
			SequenceInputStream sis = new SequenceInputStream(new FileInputStream("data\\input1.txt"), new FileInputStream("data\\input2.txt"));
			FileOutputStream fos = new FileOutputStream("data\\testoutput.txt");
			
			int read;
			while ((read = sis.read()) != -1) {
				fos.write(read);
				System.out.print((char)read);
			}
			fos.close();
			sis.close();
			
			System.out.println("\nDaten übertragen!"); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
