public class AccountBank {

    /*
     aqui iniciamos creando las variables nativas de la clase
     */
    private int accountNumber;
    protected boolean activated;

    /*
    Aquí estamos creando el constructor de las variables implementadas en la case cuenta bancaria a
     */
    public AccountBank(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /*
    aqui en adelante estaremos contruyendo los set y get de las variables
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
