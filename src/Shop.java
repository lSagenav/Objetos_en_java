
public class Shop {
    /*
    Aquí se inicia con las variables y los atributos que se requerían para cada variable de la clase tienda
     */
    public String name;
    public String adress;
    protected String money;
    private int adressEmployee;
    public int numberPhone;

    /*
    Aquí se inicia con el contructor de  las variables de la clase
     */
    public Shop(String name, String adress, String money, int adressEmployee, int numberPhone) {
        this.name = name;
        this.adress = adress;
        this.money = money;
        this.adressEmployee = adressEmployee;
        this.numberPhone = numberPhone;
    }

    /*
    quí se inicia con los get y set de las variables implementadas en la clase
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public int getAdressEmployee() {
        return adressEmployee;
    }

    public void setAdressEmployee(int adressEmployee) {
        this.adressEmployee = adressEmployee;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }
}
