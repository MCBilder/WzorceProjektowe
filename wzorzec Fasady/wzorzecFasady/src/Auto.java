public class Auto {
    private Zaplon zaplon = new Zaplon();
    private PompaPaliwa pompaPaliwa = new PompaPaliwa();
    private Silnik silnik = new Silnik();

    public void Uruchom(){
        zaplon.wlacz();
        pompaPaliwa.pompuj();
        silnik.odpal();
        System.out.println("-------------------------");
        System.out.println("Auto odpalone");
        System.out.println("-------------------------");

    }
}
