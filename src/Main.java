import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Богдан", "Фон Кроннинг Белл", 82));
        persons.add(new Person("Николай", "Римский-Корсаков", 50));
        persons.add(new Person("Петр", "Краснов", 12));
        persons.add(new Person("Адель", "Принц Аль-Рейми-Шувейх", 18));
        persons.add(new Person("Алекс", "Штерн", 14));
        persons.add(new Person("Иван", "Иванов", 48));

        Predicate<Person> isAdult = person -> person.getAge() < 18;
        persons.removeIf(isAdult);

        for (Person s : persons) {
            System.out.println(s);
        }
    }
}
