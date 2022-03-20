package Package;

/**
 * Esta clase es del objeto Libros
 *
 * @autor Claudia Zorrilla Rojas.
 */
public class Books {

    public String category;
    public int pages;
    protected  String origin;
    public String writer;
    public  String component;
    public int yearPublication;

    /**
     * Constructor con el atributo category asignando valor
     */
    public Books(){
        this.category = "Comedia";
    }

    /**
     * Este método hace posible la modificación del valor del atributo
     * categoria de las clase Libros.
     *
     * @param category
     */
    public void setCategory(String category){
        this.category = category;
    }

    /**
     * Este método muestra el atributo categoria de la clase Libros
     * @return el valor del atributo categoria.
     */
    public String getCategory(){
        return category;
    }


    public static void main(String[] args) {

        /**
         * Ensayo
         */
        Books gender = new Books();
        String  knowCategory = gender.getCategory();
        System.out.println(knowCategory);
    }

}
