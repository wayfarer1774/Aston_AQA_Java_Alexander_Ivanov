package com.Alexander.Homework;

//3-е задание
/*
Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
*/
public class Park {

    private String pName;
    private Attraction[] attractions;

    public Park(String pName, int attractionQuantity) {
        this.pName = pName;
        this.attractions = new Attraction[attractionQuantity];
    }

    public class Attraction {
        private String aName;
        private String workHours;
        private int cost;

        public Attraction(String aName, String workHours, int cost) {
            this.aName = aName;
            this.workHours = workHours;
            this.cost = cost;
        }

        public void getInfo() {
            System.out.println("Название аттрациона: " + aName + "\n" + "Время работы: " + workHours + "\n" + "Стоимость билета: " + cost);
        }
    }

    public void addAttractions(int index, String aName, String workHours, int cost) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(aName, workHours, cost);
        } else
            System.out.println("Неверный index аттракциона, пожалуйста, введите index от 0 до " + attractions.length);
    }

    public void getParkAttractions() {
        System.out.println("Аттракционы парка " + pName + ":");
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.getInfo();
                System.out.println();
            }
        }
    }
}