package homework4.task_4;

import homework4.task_1.Person;

public class Task_4 {
    public static void main(String[] args) {
        // people_1 -> noNamePerson
        Person people_1 = new Person();
        // pasha
        Person people_2 = new Person("Pasha", 17);
        people_1.setText("Hello, Dmitriy");

        people_1.printText();
        people_2.printText();
    }
}
