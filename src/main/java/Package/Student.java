package Package;

import java.util.Date;

/**
 * Esta clase es del objeto Estudiante.
 *
 * @autor Claudia Zorrilla Rojas
 */
public class Student {

    private long ID;
    private String name;
    private String lastName;
    public String dateBirth;
    public int degree;


    /**
     * Constructor que intancia los atributos.
     */
    public Student(){
        this.ID = 1;
        this.name = "Claudia";
        this.lastName = "Zorrilla";
        this.degree = 11;
        this.dateBirth = "2004/05/20";
    }

    /**
     * Este método muestra el atributo nombre de la clase Estudiante
     * @return el valor del atributo nombre.
     */
    public String getName() {
        return name;
    }

    /**
     * Este método hace posible la modificación del valor del atributo
     * nombre de las clase Estudiante.
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Este método muestra el atributo apellido de la clase Estudiante
     * @return el valor del atributo apellido.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Este método hace posible la modificación del valor del atributo
     * apellido de las clase Estudiante.
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
