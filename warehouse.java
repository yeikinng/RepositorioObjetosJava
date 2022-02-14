package principal;
    // creamos la clase warehouse
public class warehouse {
    // creamos los atributos correspondientes indicando su tipo de modificador y tipo de dato al que pertenecen
    public String nameW;
    public String address;
    private int phone;
    protected int nit;
    // generamos los metodos getter y setter del atributo al que queremos acceder

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }
    }
