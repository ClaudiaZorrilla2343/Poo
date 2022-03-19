package Package;

import java.util.Date;

/**
 *Esta clase es del objeto persona
 *
 * @autor Claudia Zorrilla Rojas
 */
public class Person {

    String name;
    String lastName1;
    String lastName2;
    Date dateBirth;
    float height;

    /**
     * Este método me muestra el atributo nombre de la clase persona
     *
     * @return Valor del atributo nombre
     */
    public String getName() {
        return name;
    }

    /**
     * Este método me ayuda a modificar el valor del atributo nombre de la clase persona
     *
     * @param name atributo a modificar
     */
    public void setName(String name) {
        this.name = name;
    }
}


