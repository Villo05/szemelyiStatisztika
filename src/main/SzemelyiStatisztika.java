package main;

public class SzemelyiStatisztika {

    public static void main(String[] args) {
        String nev = "Villő";
        int szulEv = 2005;
        
        /* metódusok: 
        köszöntés
        életkor: 2026 - 
        nyugdíjig hátralévő évek száma: 44*/
        try{
            String adat = "Szia %s!".formatted(nev);
            adat += "\nÉletkor: %d év".formatted(eletkor(szulEv));
            adat += "\nNyugdíjig hátralévő évek száma: %d év".formatted(nyugdijig(szulEv));
            megjelenites(adat);
        }catch(IllegalArgumentException e) {
            megjelenites("Hiba: " + e.getMessage());
        }
        
    }
    
    public static void megjelenites(String adat) {
        System.out.println(adat); 
    }
    
     public static void koszontes(String nev) {
        System.out.println("Szia, " + nev + "!");
    }

    public static int eletkor(int szulEv) {
        if (szulEv < 1900) {
            throw new IllegalArgumentException(
                    "A születési év nem lehet 1900 előtti!"
            );
        }
        return 2026 - szulEv;
    }

    public static int nyugdijig(int szulEv) {
        return 65 - eletkor(szulEv);
    }
}
