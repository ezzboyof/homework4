package homework4.task_1;

public class Main {
    public static void main(String[] args) {
        // имена переменных с маленькой буквы
        // Student_1 -> archi
        Person Student_1 = new Person("Archi", 16);
        // vlad
        Person Student_2 = new Person("Vlad", 15);
        // noName
        Person Student_3 = new Person();

        Student_1.show();
        System.out.println(Student_1.getName()); // метод show() выводит все эти данные, зачем вызывать их повторно?
        System.out.println(Student_1.getAge());

        Student_2.show();
        System.out.println(Student_2.getName()); // метод show() выводит все эти данные, зачем вызывать их повторно?
        System.out.println(Student_2.getAge());
    }
}
