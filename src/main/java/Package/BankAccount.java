package Package;

/**
 *Esta clase es del objeto Cuenta Bancaria
 *
 * @autor Claudia Zorrilla Rojas
 */
public class BankAccount {

    private int accounNumber;
    protected boolean activate;

    /**
     * Este método me ayuda a modificar el valor del atributo activar
     * de la clase Cuanta Bancaria
     * @param activate
     */
    public void setActivate(boolean activate){
        this.activate = activate;
    }

    /**
     * Este método muestra el atributo activar de la clase Cuenta Bancaria
     * @return el valor del atributo activar
     */
    public Boolean getActivate(){
        return activate;
    }
}
