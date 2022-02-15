package principal;
    /** creamos la clase owner */
public class owner {
    /** creamos los respectivos atributos para esta clase indicando
     *  su tipo de modificador y tipo de dato al que pertenecen */
    private String name;
    public String lastname1;
    private int idNumber;

    /** generamos los metodos getter y setter del atributo al que queremos acceder */

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(int idNumber) {
            this.idNumber = idNumber;
        }
    }
