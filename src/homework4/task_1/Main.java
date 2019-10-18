package homework4.task_1;

public class Main {
    public static void main(String[] args) {
        Person Student_1 = new Person("Archi", 16);
        Person Student_2 = new Person("Vlad", 15);
        Person Student_3 = new Person();

        Student_1.show();
        System.out.println(Student_1.getName());
        System.out.println(Student_1.getAge());

        Student_2.show();
        System.out.println(Student_2.getName());
        System.out.println(Student_2.getAge());
    }
}
