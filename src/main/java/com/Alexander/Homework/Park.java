package com.Alexander.Homework;

//3-е задание
/*
Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
*/
public class Park {
    public int parkId;

    public class MainInfo {
        public String attraction;
        public String workTime;
        public int cost;
    }
}