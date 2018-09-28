package _rozwiązania;

import java.util.Scanner;

public class Easy2 {
    /**
     * Metoda oblicza rekurencyjnie silnię z podanej liczby
     *
     * @param n liczba, z której liczona jest silnia
     * @return silnia podanej liczby
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Liczba nie może być mniejsza od 0!");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();
        System.out.println("Silnia z podanej liczby: " + factorial(n));
    }
}