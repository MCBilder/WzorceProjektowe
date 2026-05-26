public class Bankomat {
    public void connect(){
        BazaDanych db = BazaDanych.getBazaDanych();
        System.out.println("Bankomat polaczony z BazaDanych");
    }
}
