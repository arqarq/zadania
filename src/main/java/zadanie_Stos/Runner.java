package zadanie_Stos;

class Runner {
    public static void main(String[] args) {
        IntStack stack = new IntStack(10);

        System.out.println("Stos pusty: " + stack.isEmpty());
        for (int i = 0; i < 20; i++) {
            stack.push(i + 1);
        }
        System.out.println("Stos pełny: " + stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println("Stos pełny: " + stack.isFull());
        System.out.println(stack);
    }
}