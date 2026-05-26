public class PompaPaliwa {
    private boolean status = false;

    public void pompuj(){
        this.status = true;
        System.out.println("pompa: " + status);
    }
}
