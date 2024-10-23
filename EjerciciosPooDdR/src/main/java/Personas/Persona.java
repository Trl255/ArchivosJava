/* Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.
Se implantaran varios constructores:
Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.
Los métodos que se implementaran son:
calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0  y 
si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
toString(): devuelve toda la información del objeto.
generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
Métodos set de cada parámetro, excepto de DNI.
Ahora, crea una clase ejecutable que haga lo siguiente:

Pide por teclado el nombre, la edad, sexo, peso y altura.
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por último, mostrar la información de cada objeto.
Puedes usar métodos en la clase ejecutable, para que os sea mas fácil.*/
package Personas;

/**
 *
 * @author josea
 */
public class Persona {

    private final static char defecto = 'H';
    public final static int pesoMenor = -1;
    public final static int pesoIdeal = 0;
    public final static int sobrePeso = 1;

    
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this("", 0,defecto, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        
        this(nombre,edad, sexo, 0,0);
    }
 public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDNI();
        this.sexo = sexo;
        comprobarSexo();
    }
 
    private void generarDNI() {
        final int divisor = 23;

        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);

        //Pasamos el DNI a String
        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];

    }

    void comprobarSexo() {

        if (sexo != 'H' || sexo != 'M') {
            sexo = defecto;
        }

    }

    private static char getDefecto() {
        return defecto;
    }

    private static int getPesoMenor() {
        return pesoMenor;
    }

    private static int getPesoIdeal() {
        return pesoIdeal;
    }

    private static int getSobrePeso() {
        return sobrePeso;
    }

    private void setDNI(String DNI) {
        this.DNI = DNI;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setEdad(int edad) {
        this.edad = edad;
    }

    void setSexo(char sexo) {
        this.sexo = sexo;
    }

    void setPeso(double peso) {
        this.peso = peso;
    }

    void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double pesoActual = 0;

        pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("Se encuentra en peso ideal ");
            return pesoIdeal;

        } else if (pesoActual < 20) {
            System.out.println("Se encuentra debajo del peso recomendado");
            return pesoMenor;

        } else {
            System.out.println("Se encuentra por enciam del peso recomendado");
            return sobrePeso;
        }
        }
    public boolean mayorEdad(){
        boolean MayorEdad=false;
            if (edad>=18){
                System.out.println("Eres mayor de edad");
                return MayorEdad=true;
                
        }else{
                System.out.println("Aún te quedán "+(18-edad)+", año para ser mayor de edad");
        return false;
            }
            
}

    @Override
    public String toString() {
        return "La persona con DNI " + DNI + "\nNombre = " + nombre + "\nEdad : " + edad + "\nsexo=" + sexo + "\n peso=" + peso + "\naltura=" + altura ;
    }
}
