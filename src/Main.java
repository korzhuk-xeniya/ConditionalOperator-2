import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        byte coefficientEach4 = 4;
        byte coefficientEach100 = 100;
        short coefficientEach400 = 400;
        if (year % coefficientEach4 == 0 && year % coefficientEach100 != 0 || year % coefficientEach100 == 0 && year % coefficientEach400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние от офиса до адреса доставки в км");
        int deliveryDistance = scanner.nextInt();
        int daysOfDelivery = 1;
        byte k1 = 20;
        byte k2 = 60;
        byte k3 = 100;
        if (deliveryDistance < k1) {
            daysOfDelivery = daysOfDelivery + 0;
            System.out.println("Потребуется дней: " + daysOfDelivery);
        } else if (deliveryDistance < k2) {
            daysOfDelivery = daysOfDelivery + 1;
            System.out.println("Потребуется дней: " + daysOfDelivery);
        } else if (deliveryDistance <= k3) {
            daysOfDelivery = daysOfDelivery + 2;
            System.out.println("Потребуется дней: " + daysOfDelivery);
        } else {
            System.out.println("Доставка не осуществляется");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца в году");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}