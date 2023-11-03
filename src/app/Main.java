package app;

//імпортуємо бібліотеки з JDK : Scanner та Locale :
import java.util.Scanner;
import java.util.Locale;

//Домашнє завдання
//
//        Operators Logical
//        --------------------
//
//        Доходи оподатковуются за прогресивною шкалою оподаткування:
//        - від 0 до 10000, включно, за ставкою 2,5%.
//        - від 10000, виключно, до 25000, включно, за ставкою 4,3%.
//        - більше 25000, за ставкою 6,7%.
//
//        Необхідно розрахувати суму податку від певної суми доходу.
//        Сума податку дорівнює відсотку від суми доходу.
//        Забезпечте виведення результату розрахунків з двома знаками
//        після десяткового роздільника.

public class Main {

    //Створюємо змінні :
    static double salaryRate;
    static double coefficient;
    static double taxAmount;
    public static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        //Інтегруємо наш сканер та локейл :
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        System.out.println("Please, tell me your Salary Rate : ");
        salaryRate = input.nextDouble();

        //Створюємо умови для salaryRate та наслідки для coefficient :
        if (salaryRate > 0 && salaryRate <= 10000){
            coefficient = 2.5;
        } else if (salaryRate > 10000 && salaryRate <= 25000) {
            coefficient = 4.3;
        } else if (salaryRate > 25000) {
            coefficient = 6.7;
        } else {
            System.out.println("Your input is wrong, please try again");
            System.exit(0);
        }

        //Проводимо розрахунок суми податку :
        taxAmount = salaryRate * coefficient / 100;

        //Виводимо результат :
        System.out.printf("Your Tax Amount equal : %s %.2f%n", CURRENCY, taxAmount);

    }
}
