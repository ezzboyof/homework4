package homework4.task_3;
import homework4.task_1.Person;
public class Task_3 {
    public static void main(String[] args) {
        int count = 0;
        Person[] apprentice = new Person[7];

        apprentice[0] = new Person("Archi", 16);
        apprentice[1] = apprentice[0];
        apprentice[2] = new Person("Vlad", 15);
        apprentice[3] = new Person();
        apprentice[4] = apprentice[2];
        apprentice[5] = apprentice[3];
        apprentice[6] = new Person("Matvey", 16);

        for (int i = 1; i < apprentice.length; i++) {
            if (apprentice[0].equals(apprentice[i])) {
                count++;
            }
        }
        System.out.println("Кол-во одинаковых объектов в массиве: " + count);
    }
}