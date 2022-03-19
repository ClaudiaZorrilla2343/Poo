package Package;

import java.util.ArrayList;
/**
 *Esta clase es del objeto Fruta
 *
 * @autor Claudia Zorrilla Rojas
 */
public class Fruit {

    public String name;
    private float averageWeihgt;
    public ArrayList<String> colors;

    /**
     * Este método muestra el atributo colores de la clase Fruta
     * @return Valor del atributo colores
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Este método me ayuda a modificar el valor del atributo colores
     * de la clase Fruta
     *
     * @param colors atributo a modificar
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
