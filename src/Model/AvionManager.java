package Model;

import java.util.*;
import java.text.ParseException;


public class AvionManager {
    private static int numarUnicAvion = 0;

    public static void cresteNumarUnicAvion(int i) {

        AvionManager.numarUnicAvion += i;
    }

    public Avion creareAvion(Scanner in) throws ParseException {
        cresteNumarUnicAvion(1);
        Avion avion = new Avion(numarUnicAvion, in);
        AvionSingleton.getInstance().addAvion(avion); // Adăugare avion în lista de avioane
        return avion;
    }
}