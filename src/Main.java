import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        findYear(2022);
        deviceInfo(0,2023);
        findDeliveryTime(99);
    }

    public static void findYear(int year){
        if(((year % 4==0) || (year % 400 ==0)) && (year % 100 !=0)){
            System.out.println(year+" год является високосным");
        }
        else {
            System.out.println(year+" год не является високосным");
        }
    }

    public static void deviceInfo(int clientOS,int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1){
            if (clientDeviceYear>=currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        else {
            if (clientDeviceYear>=currentYear) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }
    }

    public static void findDeliveryTime(int distance){
        long k =1;
        if(distance>20){
            int t =distance-20;
            k = k+Math.round(Math.floor(t/40))+1;
            System.out.println("Потребуется дней: "+k);
        }
        else{
            System.out.println("Потребуется дней: "+k);
        }
    }
}