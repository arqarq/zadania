package zadanieLista;

class Runner {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        lista.append("abc");
        lista.append("def");
        System.out.println(lista);
        lista.search("abc").ifPresent(n -> System.out.println(n.getValue()));
        lista.search("abc").ifPresent(System.out::println);
        lista.insert("Ola", 0);
        System.out.println(lista);
        lista.insert("psa", 2);
        System.out.println(lista);
        lista.insert("psa2", 2);
        System.out.println(lista);
        lista.insert("i chomika", 1000);
        System.out.println(lista);
        lista.delete(0);
        System.out.println(lista);
        lista.delete(1);
        System.out.println(lista);
        lista.delete(2);
        System.out.println(lista);
        lista.delete(1000);
        System.out.println(lista);
        lista.delete(1);
        System.out.println(lista);
        lista.delete(1000);
        System.out.println(lista);
    }
}