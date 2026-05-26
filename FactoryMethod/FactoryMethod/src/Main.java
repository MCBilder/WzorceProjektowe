//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabrykaAut fabrykaAut;

        fabrykaAut = new FabrykaAudi();
        Auto auto = fabrykaAut.zrobAuto();
        System.out.println("Audu: " + auto.moc());

        fabrykaAut = new FabrykaBMW();
        auto = fabrykaAut.zrobAuto();
        System.out.println("BMW: " + auto.moc());

        fabrykaAut = new FabrykaFord();
        auto = fabrykaAut.zrobAuto();
        System.out.println("Ford: " + auto.moc());

    }
}