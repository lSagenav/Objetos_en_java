public class Home {

    /*
     desde este punto de la clase creamos lo que son las variables  de la clase Home
    */
    public int numberPhone;
    private String rooms;
    protected String bathrooms;
    public int adress;
    public String color;
    private double zise;

    /*
    Aquí se inicia con el constructor de la clase junto a sus variables requeridas
     */
    public Home(int numberPhone, String rooms, String bathrooms, int adress, String color, double zise) {
        this.numberPhone = numberPhone;
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.adress = adress;
        this.color = color;
        this.zise = zise;
    }

    /*
    Aquí se inicia con los set y get de las variables implementadas en la clase
     */
    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getAdress() {
        return adress;
    }

    public void setAdress(int adress) {
        this.adress = adress;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getZise() {
        return zise;
    }

    public void setZise(double zise) {
        this.zise = zise;
    }
}
