
package almacen;

public class BebidaAzucarada extends Bebida{
    
    private double porcentajeAzucar;
    private boolean promocion;

    public BebidaAzucarada(double porcentajeAzucar, boolean promocion, double cantidad, double precio, String marca) {
        super(cantidad, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromocion() {
        return promocion;
    }

    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }
    public double getPrecio(){
        if (isPromocion()){
            return super.getPrecio()*0.9;
        }
        else {
            return super.getPrecio();
        }
    
    }
    
    
    
    
    @Override
    public String toString() {
        return super.toString()+"BebidaAzucarada: " + "porcentajeAzucar= " + porcentajeAzucar + ", promocion=" + promocion;
    }
    
     
}
