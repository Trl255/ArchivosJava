package ejercicios;

import java.io.File;
import java.io.InputStream;

public class Ej40 {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("java","ejercicios.Ej40_1");
		pb.directory(new File(".\\bin"));              // eclipse
		//pb.directory(new File(".\\build\\classes"));  //netbeans
		pb.redirectErrorStream(true);
		Process p = null;
		try {
			p=pb.start();
			p.waitFor();
			if(p.exitValue() !=0)
				System.out.println("Error "+ p.exitValue());
			InputStream is = p.getInputStream();
			//leemos carácter a caracter
			int c;
			while((c=is.read()) != -1)
				System.out.print((char)c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
