import java.util.List;

/*
Создайте класс Student (String name, List<Integer> rates) имя, лист оценок.
 */
public class Student {
    private final String name;
    List<Integer> rates;

    public Student(String name, List<Integer> rates) {
        this.name = name;
        this.rates = rates;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getRates() {
        return rates;
    }


    // Метод для обчислення середньоарифметичного значення оцінок
    public double getAverageRate() {
        int sum = 0;
        for (int rate : rates) {
            sum += rate;
        }
        double average = sum / (double) rates.size();
        // Додаємо виведення середнього значення для перевірки
        System.out.println(name + " середнє значення: " + average);

        return average;
    }


    @Override
    public String toString() {
        return "Студент " +
                "по імені: " + name  +
                ", оцінки: " + rates +
                System.lineSeparator();
    }
}
