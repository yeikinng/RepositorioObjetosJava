package principal;
    /** importamos la libreria ArrayList para el atributo colors */
import java.util.ArrayList;
    /** creamos la clase fruit */
public class fruit {
    /** creamos los atributos para esta clase indicando su tipo de modificador y tipo de dato al que pertenece */
    public String name;
    private float avergeWeight;
    public ArrayList colors;
    public int unitValue;
    /** generamos los metodos getter y setter del atributo al que queremos acceder */
    public ArrayList getColors() {
        return colors;
    }

    public void setColors(ArrayList colors) {
        this.colors = colors;
    }
}
