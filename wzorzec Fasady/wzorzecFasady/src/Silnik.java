public class Silnik{
    private boolean status = false;

    public void odpal(){
        this.status = true;
        System.out.println("silnik: " + status);
    }
}
