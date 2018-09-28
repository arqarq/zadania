package homework;

import java.util.*;
import java.util.stream.Collectors;

class Streams {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "C++", "Python", "Delphi", "Pascal", "C#", "Erlang", "Scala");

        // 1) Napisz stream, który przekształci wszystkie litery w napisach na wielkie, odrzuci napisy, których długość
        // jest nieparzysta i zbierze wyniki do listy.
        List<String> list1 = strings.stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list1);

        // 2) Przy pomocy streamów wypisz na ekran pierwszy napis, który zaczyna się na literę "P".
        List<String> nowa = strings.stream()
                .filter(s -> s.startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(nowa);
        Optional<String> nowa2 = nowa.stream()
                .findFirst();
        System.out.println(nowa2.orElse("brak!"));
//                .findFirst()
//                .ifPresent(System.out::println);

        // 3) Używając streamów scal wszystkie napisy w jeden String w taki sposób, aby każdy napis zaczynał się
        // i kończył znakiem "#". Tak zmodyfikowane napisy w wynikowym Stringu powinny być przedzielone przecinkami.
        String allLangs = strings.stream()
                .collect(Collectors.joining("#,#", "#", "#"));
        System.out.println(allLangs);


        List<Integer> numbers = Arrays.asList(1, 5, 1, 4, 2, 2, 3, 8, 1, 2, 8, 5, 4, 3, 10);

        // 4) Przy pomocy streamów policz ilość unikalnych liczb.
        List count = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        long count2 = count.stream()
                .count();
//        int count2 = count.size();
        System.out.print(count);
        System.out.println(" " + count2);

        // 5) Używając streamów zamień każdą liczbę na jej kwadrat, pozostaw liczby mniejsze od 10, ogranicz ich liczbę
        // do trzech i zbierz wynik do listy.
        List<Integer> list2 = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n < 10)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list2);

        // 6) Wypisz na ekran informację czy na oryginalnej liście znajduje się przynajmniej jedna liczba, która
        // podzielna zarówno przez 2, jak i przez 5. Użyj streamów.
        System.out.println(numbers.stream()
                .anyMatch(n -> n % 2 == 0 && n % 5 == 0));


        Map<Integer, String> map = new HashMap<>(1);
        map.put(1, "Katarzyna");
        map.put(2, "Anna");
        map.put(3, "Jan");
        map.put(4, "Andrzej");

        // 7) Przy pomocy streamów stwórz set, który będzie zawierał tylko damskie imiona (damskie imiona kończą się na
        // literę "a"), z zamienionymi wszystkimi literami na wielkie.
        Set<String> womenSet = map.entrySet().stream()
                .filter(s -> s.getValue().endsWith("a"))
                .map(x -> x.getValue().toUpperCase())
                .collect(Collectors.toSet());
        System.out.println(womenSet);

        // 8) Używając streamów stwórz mapę, w której będą tylko te pary klucz-wartość, w których wartość jest imieniem
        // męskim.
        Map<Integer, String> menMap = map.entrySet().stream()
                .filter(s -> !s.getValue().endsWith("a"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(menMap);

        // Zadanie bonus: Użyj streamów, aby policzyć średnią dla 5 randomowych liczb. Zwróć uwagę w API Javy jakie
        // metody oferuje klasa Random.
        OptionalDouble random = new Random().ints(5)
                .average();
//                .ifPresent(System.out::println);
        System.out.println(random.orElse(0.0E0));
    }
}