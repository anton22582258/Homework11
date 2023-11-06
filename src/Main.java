public class Main {
    public static void main(String[] args) {
        isLeapYear(2021);
        determinateApplicationVersion(2015, 0);
        calcDeliveryDay(67 );
    }

    public static void isLeapYear(int year) {
        System.out.println(" Задача 1 ");
        if ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) {
            System.out.println(year + " год яляется високосным. ");
        } else {
            System.out.println(year + " год не яляется високосным. ");
        }
    }

    public static void determinateApplicationVersion(int clientDeviceYear, int clientDeviceOs) {
        System.out.println(" Задача 2 ");
        clientDeviceYear = 2015;
        clientDeviceOs = 0;
        if (clientDeviceYear < 2015 && clientDeviceOs == 0) {
            System.out.print(" Установите облегченную версию приложения iOS по ссылке. ");
        } else if (clientDeviceYear < 2015 && clientDeviceOs == 1) {
            System.out.print(" Установите облегченную версию приложения Android по ссылке. ");
        } else if (clientDeviceYear >= 2015 && clientDeviceOs == 0) {
            System.out.print(" Установите обычную версию приложения iOS по ссылке. ");
        } else if (clientDeviceYear >= 2015 && clientDeviceOs == 1) {
            System.out.print(" Установите обычную версию приложения Android по ссылке. ");
        }
    }

    public static int calcDeliveryDay(int deliveryDistance) {
        System.out.println(" Задача 3 ");
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println(" Потребуется дней: " + deliveryDay);
        } else if ( 20  <= deliveryDistance && deliveryDistance < 60 ) {
            deliveryDay++;
            System.out.println(" Потребуется дней: " + deliveryDay);
        } else if ( 60 <= deliveryDistance && deliveryDistance <= 100) {
            deliveryDay = deliveryDay + 2;
            System.out.println(" Потребуется дней: " + deliveryDay);
        } else
            System.out.println(" Доставки нет ");
        return deliveryDay;
    }
}



