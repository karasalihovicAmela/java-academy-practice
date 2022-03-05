package com.company;

import java.util.Scanner;

public class MainIfStatement {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Unos brojeva 5 do 10");

        System.out.println("Prvi broj je:");
        int broj1 = scan.nextInt();
        System.out.println("Drugi broj je:");
        int broj2 = scan.nextInt();
        System.out.println("Treci broj");
        int broj3 = scan.nextInt();
        System.out.println("Cetvrti broj je:");
        int broj4 = scan.nextInt();
        System.out.println("Peti broj je:");
        int broj5 = scan.nextInt();

        int zbir = broj1 + broj2 + broj3 + broj4 + broj5;

        double prosjek = (zbir / 5);

        System.out.println("Prosjek je: " + prosjek);
        if (prosjek <= 5.0D) {
            System.out.println("Korisnik nije polozio. Potrudite se vise");
        } else if (prosjek >= 6.0D && prosjek < 7.0D) {
            System.out.println("Polozili ste, ali potrudite se mozes bolje");
        } else if (prosjek >= 7.0D && prosjek < 8.0D) {
            System.out.println("Polozili ste");
        } else if (prosjek >= 8.0D && prosjek < 9.0D) {
            System.out.println("Polzili ste, Vas trud se primjeti");
        } else if (prosjek >= 9.0D && prosjek < 10.0D) {
            System.out.println("Polozili ste, zadovoljni smo Vasim napretkom");
        } else {
            System.out.println("Polozili ste, odusevljeni smo Vasim radom");
        }

        scan.nextLine();
        System.out.println("Koja Vam je najdraza boja? Zelena ili Crna?");
        String boja = scan.next();
        String slovo = String.valueOf(boja.charAt(0));
        String odgovor = slovo.equalsIgnoreCase("Z") ? "Odabrali ste Zelena" : "Odabrali ste Crna";
        System.out.println(odgovor);
    }
}
