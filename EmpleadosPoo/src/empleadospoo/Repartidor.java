package empleadospoo;

/**
 * Clase Repartidor, hija de empleado
 * @author DiscoDurodeRoer
 */
public class Repartidor extends Empleado {

    //Atributos
    private String zona;

    //Constructores
    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    //Metodos
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        if (this.plus()){
        return super.toString() + " zona=" + zona+", y no recibe plus";
    }else if(!this.plusAntiguedad()){
        return super.toString()+ "zona: "+zona+", y no recibe plus de antiguedad";
    }else if(this.plusAntiguedad()){
        return super.toString()+ "zona: "+zona+", y Si recibe plus de antiguedad";
    }else{
        return super.toString() + " zona=" + zona;
    }
    }

    /**
     * Si tiene menos de 25 años y la zona es "zona 3",
     * aumentamos el sueldo al empleado
     * @return 
     */
    @Override
    public boolean plus() {

        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            //Con super. llamo a un metodo de la clase padre
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadido el plus, al empleado "+super.getNombre());
            return true;
        }

        return false;
    }

    @Override
    public boolean plusAntiguedad() {
        if (super.getEdad()>30){
            double plusAntiguedad=super.getSalario()+50;
            
            return true;
        }else{
            return false;
        }
        
    }

    /**
     *
     * @return
     */
    @Override
    public boolean descuento() {
        if (super.getEdad()>50 && this.zona.equalsIgnoreCase("zona 4")){
            double descuento=super.getSalario()*1.05;
        return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean edadMedia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
