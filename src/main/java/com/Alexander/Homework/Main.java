package com.Alexander.Homework;

public class Main {
    public static void main(String[] args) {
        //1-е задание
        /*
        Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        Конструктор класса должен заполнять эти поля при создании объекта.
        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
         */
        //Проверка через вывод в консоль
        Person person = new Person("Иванов Иван Иванович", "Ведущий специалист", "ivanov_ivan@mail.com", "84994328015", 120000, 26);
        person.toOutput();

        System.out.println();

        //2-ое задание
        /*
        Создать массив из 5 сотрудников.
        Пример:
        // вначале объявляем массив объектов
        Person[] persArray = new Person[5];
        // потом для каждой ячейки массива задаем объект
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
        "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
         */
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Ivanov Petr", "Analyst", "ivpetr@mailbox.com", "892312313", 40000, 31);
        persArray[2] = new Person("Ivanov Dmitry", "Programmer", "ivdmitry@mailbox.com", "892312314", 50000, 32);
        persArray[3] = new Person("Ivanov Maxim", "Consultant", "ivmaxim@mailbox.com", "892312315", 60000, 33);
        persArray[4] = new Person("Ivanov Egor", "Notary", "ivegor@mailbox.com", "892312316", 70000, 34);

        //Проверка сохраненных значений через вывод в консоль:
        for (int i = 0; i < 5; i++) {
            System.out.println("A first name and a surname of the employee is " + persArray[i].getFio() + ". The employee is employed as \"" + persArray[i].getPosition() + "\". The employee`s email is " + persArray[i].getEmail() + ". The employee`s contact phone: " + persArray[i].getPhoneNumber() + ". The employee`s salary: " + persArray[i].getSalary() + " of rubles. The employee has " + persArray[i].getAge() + " years old.");
        }

        System.out.println();

        //3-е задание
        /*
        Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
         */
        Park park1 = new Park("Очаково", 2);
        park1.addAttractions(0, "карусель", "с 9 до 18:00", 101);
        park1.addAttractions(1, "горки", "с 10 до 18:00", 203);
        park1.getParkAttractions();
    }
}
