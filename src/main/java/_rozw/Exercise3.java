package _rozw;

import java.util.Scanner;

public class Exercise3 {
    /**
     * Metoda sprawdzająca czy dana liczba jest pierwsza
     * @param n - liczba wejściowa
     * @return - informacja czy liczba n jest pierwsza
     */
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();
        System.out.println("Czy jest pierwsza? " + isPrime(n));
    }
}