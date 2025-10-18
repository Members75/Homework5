//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание №1 ");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (clientOS == 0) {
            System.out.println(" Установите версию приложения для IOS по ссылке ");

        }
        int clientOs = 1;
        int clientDeviceYears = 2015;
        if (clientOs == 0 && clientDeviceYears >= 2015){
            System.out.println(" Установите версию приложения для IOS по ссылке ");
        } else if (clientOS == 0 && clientDeviceYears < 2015){
            System.out.println(" Установите облегченную версию для IOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYears >= 2015){
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (clientOS == 1 && clientDeviceYears < 2015) {
            System.out.println(" Установите облегченную версию для Android по ссылке ");

        }
        System.out.println(" Задание №4 ");
        int deliveryDistance = 95;
        int timeDeliveryOne = 1;
        int timeDeliveryTwo = timeDeliveryOne + 1;
        int timeDeliveryThree = timeDeliveryTwo + 1;
        if (deliveryDistance > 100){
            System.out.println(" Доставки нет ");
        }
        if (deliveryDistance <= 20){
            System.out.println(" Потребуется дней: " + timeDeliveryOne);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println(" Потребуется дней: " + timeDeliveryTwo);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println(" Потребуется дней: " + timeDeliveryThree);
        }


        System.out.println(" Задание №5 ");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println(" Зимний период ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весенний период ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Летний период ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осенний период ");
                break;
            default:
                System.out.println(" Такого месяца нет ");
        }


        System.out.println(" Задание №3 ");
        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(" Год: " + year + " является високосным ");
        } else if (year % 100 == 0){
            System.out.println(" Год: " + year + " не является високосным ");

        }
        if (year < 1584){
            System.out.println(" Данный год входит в период, когда високосный год не был введен ");
        }
        if (year % 2 != 0){
            System.out.println(" Год является нечетным. ");
        }
    }
}