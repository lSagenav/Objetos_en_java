public class Car {

    /*
     justo aquí iniciamos creando las variables  de la clase
     */
    public String name;
    public int weight;
    private String Serial;
    protected String key;
    private int grossPrice;

    /*
    justo aquí iniciamos creando el constructor  de la clase
     */
    public Car(String name, int weight, String serial, String key, int grossPrice) {
        this.name = name;
        this.weight = weight;
        Serial = serial;
        this.key = key;
        this.grossPrice = grossPrice;
    }

    /*
    A partir de esta linea estaremos construyendo los set y get de las variables implementadas
    en la clase carro
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(int grossPrice) {
        this.grossPrice = grossPrice;
    }
}
