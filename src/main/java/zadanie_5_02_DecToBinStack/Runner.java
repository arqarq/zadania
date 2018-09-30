package zadanie_5_02_DecToBinStack;

class Runner {
    public static void main(String[] args) {
        IntStack stack = new IntStack(10);
        int c = 100;
        int temp;
        int i = 0;

        while (c != 0) {
            temp = c % 2;
            stack.push(temp);
            i++;
            c = c / 2;
        }
        while (i != 0) {
            System.out.print(stack.pop());
            i--;
        }
        System.out.println();
    }
}