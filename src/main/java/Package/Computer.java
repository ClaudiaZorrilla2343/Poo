package Package;

/**
 * Esta clase es del objeto Computadora
 *
 * @autor Claudia Zorrilla Rojas
 */
public class Computer {

    public int RAM;
    public int icore;
    public String brand;
    private long IdProduct;
    public String processor;
    protected String maker;
    public float operacionSuma;

    /**
     * Constructor por defecto
     */
    public Computer(){
    }

    /**
     * Este constructor me instancia todo los atributos de la clase Computadora.
     * @param RAM
     * @param icore
     * @param brand
     * @param idProduct
     * @param processor
     * @param maker
     */
    public Computer(int RAM, int icore, String brand, long idProduct, String processor, String maker){
        this.RAM = RAM;
        this.icore = icore;
        this.brand = brand;
        this.IdProduct = IdProduct;
        this.processor = processor;
        this.maker = maker;
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
     * @param operacionSuma atributo a modificar.
     */
    public void setOperacionSuma(int operacionSuma){
        this.operacionSuma = operacionSuma;
    }

    /**
     * Este método me permite sumar dos numeros y retornar su resultado.
     *
     * @param sumando1 primer número a sumar.
     * @param sumando2 segundo número a sumar.
     * @return resultado de los dos numeros sumados.
     */
    public Float getOperacionSuma(float sumando1, float sumando2){

        return operacionSuma = sumando1 + sumando2;
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
