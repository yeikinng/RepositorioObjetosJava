package principal;
    // importamos la libreria Date para el atributo Date
import java.util.Date;
    // creamos la clase invoice
public class invoice {
    // creamos los atributos correspondientes indicando el tipo de modificador y tipo de dato al que pertenecen
    private int invoiceCode;
    public Date dateInvoice;
    private int totalValue;
    // generamos los metodos getter y setter del aributo al que queremos acceder
    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }
}
