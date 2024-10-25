import java.util.List;

/*
Создайте класс Student (String name, List<Integer> rates) имя, лист оценок.
 */
public class Student implements Comparable<Student>{
    private final String name;
    private List<Integer> rates;
    private double avg;

    public Student(String name, List<Integer> rates) {
        this.name = name;
        this.rates = rates;
        this.avg = avgRate();
    }

   /* public String getName() {
        return name;
    }

    public List<Integer> getRates() {
        return rates;
    }*/


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
                ", оцінки: " + rates + " (" + avg + ")"+
                System.lineSeparator();
    }

    public double avgRate(){
        if (rates==null || rates.size()==0){//priverka na null
            return 0;
        }//serednearufmetu4ne
        double sum =0.0;
        for (Integer i : rates){
            sum += i;
        }
        return sum/rates.size();
    }
    //metod dlja sortirovki
    @Override
    public int compareTo(Student otherStudent) {
        return Double.compare(avg, otherStudent.avg);//sravnit' 2 dabla
      /*  if (avg >otherStudent.avg){
            return 1;
        }else if (avg<otherStudent.avg){
            return -1;
        }else {
            return 0;
        }//dobavili avg dlja ekonomii vremeni podsweta*/
    }
}
