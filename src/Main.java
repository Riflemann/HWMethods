import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int year = 2022;
        checkingYear(year);

        System.out.println("Задание №2");
        int yearOfPhone = 2022;
        int userOS = 1;
        checkingOS(userOS, yearOfPhone);

        System.out.println("Задание №3");
        int deliveryDistance = 95;
        int timeDelivery = calcDeliveryTime(deliveryDistance);
        if (timeDelivery == 1) {
            System.out.println("Потребуется дней для доствки: " + timeDelivery);
        } else if (timeDelivery <= 2) {
            System.out.println("Потребуется дней для доствки: " + timeDelivery);
        } else {
            System.out.println("Потребуется дней для доствки: " + timeDelivery);
        }


    }

    public static void checkingYear(int checkYear) {
        int calc = checkYear % 400 % 100 % 4;
        if (calc == 0) {
            System.out.println(checkYear + " год является високосным");
        } else {
            System.out.println(checkYear + " год не является високосным");
        }
    }

    public static void checkingOS(int oS, int yearOS) {
        int currentYear = LocalDate.now().getYear();
        if (oS == 0 && yearOS <= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (oS == 0 && yearOS > currentYear) {
            System.out.println("Установите 'lite' версию приложения для iOS по ссылке");
        } else if (oS == 1 && yearOS <= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (oS == 1 && yearOS > currentYear) {
            System.out.println("Установите 'lite' версию приложения для Android по ссылке");
        }
    }

    public static int calcDeliveryTime(int distance) {
        int deliveryTime = 0;
        if (distance <= 20) {
            deliveryTime = 1;
            return deliveryTime;
        } else if (distance <= 60) {
            deliveryTime = 2;
            return deliveryTime;
        } else {
            deliveryTime = 3;
            return deliveryTime;
        }
    }
}

