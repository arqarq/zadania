package zadanie10_Izomorfizm;

import static zadanie10_Izomorfizm.Klasa.isIzomorf;

class Runner {
    public static void main(String[] args) {
        String str1 = "egggu";
        String str2 = "adddt";

        System.out.println(str1);
        System.out.println(str2);
        if (isIzomorf(str1, str2)) {
            System.out.println("Są izomorficzne.");
        } else {
            System.out.println("Nie są izomorficzne.");
        }
    }
}