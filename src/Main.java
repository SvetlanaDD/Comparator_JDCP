import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
         Comparator<Person> comparator = (o1, o2) -> {
            int o1SurnameWordCount;
            int o2SurnameWordCount;
            int MaxSurnameWordCount = 3;

            // Количество слов в фамилии
            o1SurnameWordCount = o1.getSurname().split("[- ]+").length;
            o2SurnameWordCount = o2.getSurname().split("[- ]+").length;
            if (o1SurnameWordCount > MaxSurnameWordCount) {
                o1SurnameWordCount = MaxSurnameWordCount;
            }
            if (o2SurnameWordCount > MaxSurnameWordCount) {
                o2SurnameWordCount = MaxSurnameWordCount;
            }
            int num = o2SurnameWordCount - o1SurnameWordCount;

            // Если количество слов в фамилии одинаковое, сравниваем по возрасту
            int num2 = num == 0 ? o2.getAge() - o1.getAge() : num;
            return num2;
        };

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
