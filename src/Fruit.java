import java.util.ArrayList;

public class Fruit {

    /*
     Variables nativas de la clase
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> colors = new ArrayList();

    /*
    Aquí se inicia con el constructor de la clase
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /*
    Aquí se inicia con los set y get de las variables creadas para esta clase Fruta
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
