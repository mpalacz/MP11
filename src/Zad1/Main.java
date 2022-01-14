package Zad1;

enum Geometria {
    kwadrat, prostokat, kolo, trapez, romb, trojkat, owal, szesciokat;
}

public class Main {
    public static void main(String[] args) {
        Geometria allGeometria[] = Geometria.values();

        System.out.println("Stałe typu geormetria:");

        for (Geometria g : allGeometria)
            System.out.println(g + ", wartość porządkowa: " + g.ordinal());
    }
}