package es.iesmz.utils;

public class Numeros {
    public static int sonIguales(int a, int b, int c) {
        if (b == c && a == c) {
            return 0;
        } else if (a == b || a == c || b == c) {
            return 1;
        } else {
            return 2;
        }
    }
}
