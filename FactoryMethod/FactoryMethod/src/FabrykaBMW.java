public class FabrykaBMW  extends FabrykaAut{
    @Override
    public Auto zrobAuto() {
        return new BMW();
    }
}
