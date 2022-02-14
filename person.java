package principal;
  // importamos la libreria Date para el atributo de date
import java.util.Date;
  // creamos la clase person
public class person {
  // creamos los respectivos atributos de esta clase definiendo el tipo de modificador de acceso y tipo de dato al que pertenece
  private String name;
  public String lastname1;
  public String lastname2;
  public Date dateBirth;
  public float height;
  // generamos los metodos getter y setter del atributo al que queremos acceder
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
