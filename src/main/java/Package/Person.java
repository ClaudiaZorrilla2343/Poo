package Package;

import java.util.Date;

/**
 *Esta clase es del objeto Persona.
 *
 * @autor Claudia Zorrilla Rojas
 */
public class Person {

    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Este método me muestra el atributo nombre de la clase persona.
     *
     * @return Valor del atributo nombre.
     */
    public String getName() {
        return name;
    }

    /**
     * Este método me ayuda a modificar el valor del atributo nombre de la clase persona.
     *
     * @param name atributo a modificar.
     */
    public void setName(String name) {
        this.name = name;
    }
}


