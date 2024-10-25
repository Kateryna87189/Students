import java.util.ArrayList;
import java.util.List;

/*
# 2 чуть сложнее
Создайте класс Student (String name, List<Integer> rates) имя, лист оценок.
Ваша задача создать массив
Student и отсортировать его по среднеарифметическоиу значению оценок.
(Напомню, чтобы получить среднеарифметическое значение оценок студента,
нужно сумму всех оценок поделить на их количество)
*/
public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        // Додавання студентів до списку
        students.add(new Student("Аліса", List.of(83, 78, 70)));
        students.add(new Student("Іван", List.of(67, 86, 81)));
        students.add(new Student("Богдан", List.of(92, 90, 91)));


        // Сортування студентів за середньоарифметичним значенням оцінок
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).getAverageRate() > students.get(j + 1).getAverageRate()) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
        // Виведення відсортованого списку студентів
        System.out.println();
        for (Student student : students) System.out.println(student);
    }
}