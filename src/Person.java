import java.util.Date;

public class Person {
    /*
     en esta parte estamos creando las variables nativas de la clase
     */
    public String name;
    public String lasName1;
    public String lasName2;
    public Date dateBirth;
    public float height;

    /*
    Aquí se inicia con el constructor junto a las variables que se crearon para la case
     */
    public Person(String name, String lasName1, String lasName2, Date dateBirth, float height) {
        this.name = name;
        this.lasName1 = lasName1;
        this.lasName2 = lasName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /*
    Aquí se inicia con los set y get de las variables implementadas en la clase
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName1() {
        return lasName1;
    }

    public void setLasName1(String lasName1) {
        this.lasName1 = lasName1;
    }

    public String getLasName2() {
        return lasName2;
    }

    public void setLasName2(String lasName2) {
        this.lasName2 = lasName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
