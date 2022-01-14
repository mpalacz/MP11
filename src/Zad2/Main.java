package Zad2;

enum Swiatla {
    RED, YELLOW, GREEN;
}

class Symulator {
    Swiatla kolor = Swiatla.RED;

    void changeColor() {
        switch (kolor) {
            case RED:
                kolor = Swiatla.GREEN;
                break;
            case GREEN:
                kolor = Swiatla.YELLOW;
                break;
            case YELLOW:
                kolor = Swiatla.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return kolor.name();
    }
}

public class Main {
    public static void main(String[] args) {
        Symulator s = new Symulator();

        for (int i = 0; i < 10; i++) {
            System.out.println(s.toString());
            s.changeColor();
        }
    }
}
