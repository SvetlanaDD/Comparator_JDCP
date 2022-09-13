import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyComparator comparator = new MyComparator(3);

        List<Person> persons = Arrays.asList(
                new Person("Богдан", "Фон Кроннинг Белл", 82),
                new Person("Николай", "Римский-Корсаков", 50),
                new Person("Адель", "Принц Аль-Рейми-Шувейх", 18),
                new Person("Иван", "Иванов", 48));

        Collections.sort(persons, comparator);

        for (Person s : persons) {
            System.out.println(s);
        }
    }
}
