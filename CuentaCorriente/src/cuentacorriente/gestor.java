/*jercicio3. Existen gestores que administran las cuentas bancarias y atienden a sus propietarios. Cada
cuenta, en caso de tenerlo, cuenta con un único gestor. Diseñar la clase Gestor del que interesa guardar
su nombre, teléfono y el importe máximo autorizado con el que pueden operar. Con respecto a los
gestores, existen las siguientes restricciones:
 Un gestor tendrá siempre un nombre y un teléfono.
 Si no se asigna, el importe máximo autorizado por operación será de 10000 euros.
 Un gestor, una vez asignado, no podrá cambiar su número de teléfono. Y todo el mundo podrá
consultarlo*/
package cuentacorriente;

public class gestor {
        
    private static String nombre;
    private int telefono;
    private double importeMaximo;
    
 gestor (String nombre, int telefono){
     this.nombre=nombre;
     this.telefono=telefono;
 }
 gestor (String nombre, int telefono,int importeMaximo){
     this.nombre=nombre;
     this.telefono=telefono;
     this.importeMaximo=10000;
 }   
 public int getTelefono(){
 return telefono;
    
}void sacarDineroGestor(double decremento, boolean x ){
    
    if (x==true){
        importeMaximo-=decremento;
   }
    if (x=false){
        if (decremento>10000){
            System.out.println("El importe máximo a sacar sin autorización es: 10,000 ");
            importeMaximo-=decremento;
         }
    }System.out.println("El saldo menos "+decremento+" es: "+importeMaximo);
    }
    void mostrarInformacion(){
        System.out.println(nombre+" \n "+telefono+"\n");
    }


    



    
}
