import java.util.Comparator;

public class MyComparator implements Comparator<Person> {
    private int MaxSurnameWordCount;

    public MyComparator(int MaxSurnameWordCount) {
        this.MaxSurnameWordCount = MaxSurnameWordCount;
    }

    @Override
    public int compare(Person o1, Person o2) {

        int o1SurnameWordCount;
        int o2SurnameWordCount;

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
    }
}
