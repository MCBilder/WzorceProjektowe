public class FabrykaFord extends FabrykaAut{

    @Override
    public Auto zrobAuto(){
        return new Ford();
    }
}
