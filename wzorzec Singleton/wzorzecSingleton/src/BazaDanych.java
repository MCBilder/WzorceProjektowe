public class BazaDanych {
    private static BazaDanych bazaDanych;

    private BazaDanych(){
        System.out.println("Pierwsze polaczenie z baza");
    }

    public static BazaDanych getBazaDanych() {
        if(bazaDanych == null){
            bazaDanych = new BazaDanych();
        }
        return bazaDanych;
    }
}
