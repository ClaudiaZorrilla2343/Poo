package Package;

/**
 * Esta clase es del objeto Computadora
 *
 * @autor Claudia Zorrilla Rojas
 */
public class Computer {

    private int RAM;
    private int icore;
    public String brand;
    private long IdProduct;
    protected String maker;
    public float sumOperation;

    /**
     * Constructor por defecto.
     */

    public Computer(){
    }

    /**
     * Modifica el atributo RAM.
     * @param RAM atributo a modificar.
     */
    public void setRAM(int RAM){
        this.RAM = RAM;
    }

    /**
     * Este metodo permite visualizar el atributo RAM.
     * @return el valor del atributo RAM.
     */
    public Integer getRAM(){
        return RAM;
    }

    /**
     * Me permite modificar el atributo operacionSuma.
     * @param sumOperation atributo a modificar.
     */
    public void setSumOperation(int sumOperation){
        this.sumOperation = sumOperation;
    }

    /**
     * Este método me permite sumar dos numeros y retornar su resultado.
     *
     * @param sumando1 primer número a sumar.
     * @param sumando2 segundo número a sumar.
     * @return resultado de los dos numeros sumados.
     */
    public Float getOperacionSuma(float sumando1, float sumando2){

        return sumOperation = sumando1 + sumando2;
    }

    /**
     * Ejecución de la clase Computadora con el método operacionSuma.
     */
    public static void main(String[] args) {

        Computer a = new Computer();

        float s = a.getOperacionSuma(5,8);

        System.out.println(s);
    }

}
