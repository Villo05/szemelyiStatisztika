package main;

public class SzemelyiStatisztika {

    public static void main(String[] args) {
        String nev = "Villő";
        int szulEv = 2005;
        
        /* metódusok: 
        köszöntés
        életkor: 2026 - 
        nyugdíjig hátralévő évek száma: 44*/
        
        String adat = "Szia %s!".formatted(nev);
        adat += "\nÉletkor: %d év".formatted(eletkor(szulEv));
        adat += "\nNyugdíjig hátralévő évek száma: %d év".formatted(nyugdijig(szulEv));
        megjelenites(adat);
    }
    
    public static void megjelenites(String adat) {
        System.out.println(adat); 
    }
    
     public static void koszontes(String nev) {
        System.out.println("Szia, " + nev + "!");
    }

    public static int eletkor(int szulEv) {
        return 2026 - szulEv;
    }

    public static int nyugdijig(int szulEv) {
        return 65 - eletkor(szulEv);
    }
}
