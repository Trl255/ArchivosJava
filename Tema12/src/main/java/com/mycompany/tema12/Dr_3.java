package com.mycompany.tema12;

import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author josea
 */
public class Dr_3 {

    public static void main(String[] args) {
        String ruta = JOptionPane.showInputDialog(null, "Inserta la ruta"
                + "del fichero", " Insercion", JOptionPane.INFORMATION_MESSAGE);

        int contVocales = 0, contConsonantes = 0, contNumero = 0;
        int []vocales = {65,69,73,79,85};
        boolean esVocal= false;

        try ( FileReader fr = new FileReader(ruta+".txt")) {
            int c = 0;

            while ((c = fr.read()) != -1) {

                if (c >= 48 && c <= 57) {
                    contNumero++;

                } else if ((c >= 65 && c <= 90) || 
                    (c>=97  && c<=122)) {
                    
                    esVocal=false;
                    for (int i=0; i<vocales.length && !esVocal; i++){
                        if ( (c== vocales [i]) || (c==vocales[i]+32)){
                            esVocal=true;
                        }
                        }
                    if (esVocal){
                        contVocales++;
                    }else{
                        contConsonantes++;
                    }

                }

            }

        } catch (IOException e) {
            System.out.println("Error "+e);

        }
        System.out.println("Hay "+contVocales+" vocales"+"\nHay "+contConsonantes+
                " consonante "+"\nHay "+contNumero+" numeros ");
    }

}
