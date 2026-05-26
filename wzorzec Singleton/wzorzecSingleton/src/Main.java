//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        AplikacjaBankowa aplikacja = new AplikacjaBankowa();
        bankomat.connect();
        aplikacja.Connect();
    }
}