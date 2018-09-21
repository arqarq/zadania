package zadanie_Kolejka;

class EmptyQueue extends Exception {
    EmptyQueue() {
        super("Pusta kolejka!");
    }
}