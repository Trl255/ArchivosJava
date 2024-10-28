package ejercicios;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

public class Ej47 {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("java","ejercicios.Ej47_1");
		pb.directory(new File(".\\bin"));              // eclipse
		//pb.directory(new File(".\\build\\classes"));  //netbeans
		pb.redirectErrorStream(true);
		Process p = null;
		try {
			p=pb.start();
			OutputStream os = p.getOutputStream();
			//el método write recibe un array de bytes
			os.write("Elena".getBytes());
			os.close();

			p.waitFor();
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
