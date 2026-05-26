public class AplikacjaBankowa {
    public void Connect(){
        BazaDanych db = BazaDanych.getBazaDanych();
        System.out.println("Aplikacja polaczona z BazaDanych");
    }
}
