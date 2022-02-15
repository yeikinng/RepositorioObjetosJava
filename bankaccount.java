package principal;
    /** creamos la clase bankaccount */
public class bankaccount {
    /** creamos los respectivos atributos definiendo el tipo de modificador y tipo de dato al que pertenecen */
    private int acountNumber;
    protected boolean activated;
    /**generamos los metodos getter y setter del atributo al que queremos acceder */
    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
