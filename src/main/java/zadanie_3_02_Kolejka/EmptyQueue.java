package zadanie_3_02_Kolejka;

class EmptyQueue extends Exception {
    EmptyQueue() {
        super("Pusta kolejka!");
    }
}