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

        //Добавление в консоль пустой строки для удобного чтения вывода работы программы
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
            System.out.println("A first name and a surname of the employee is " + persArray[i].fio + ". The employee is employed as \"" + persArray[i].position + "\". The employee`s email is " + persArray[i].email + ". The employee`s contact phone: " + persArray[i].phoneNumber + ". The employee`s salary: " + persArray[i].salary + " of rubles. The employee has " + persArray[i].age + " years old.");
        }

        //Добавление в консоль пустой строки для удобного чтения вывода работы программы
        System.out.println();

        //3-е задание
        /*
        Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
         */
        //Проверка через создание объекта, заполнение его полей и вывод хранимой информации в консоль
        Park.MainInfo info = new Park().new MainInfo();
        info.attraction = "\"Американские горки\"";
        info.workTime = "с 10:00 до 15:00";
        info.cost = 1000;
        System.out.println("Название карусели: " + info.attraction + ". Она открыта " + info.workTime + " часов дня. " +
                "Стоимость 1 билета составляет: " + info.cost + " рублей.");
    }
}
