package homeWork2;

import java.util.Scanner;

public class Task {
    /**
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     * вместо этого, необходимо повторно запросить у пользователя ввод данных.
     * <p>
     * Если необходимо, исправьте данный код
     * (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
     * <p>
     * Дан следующий код, исправьте его там, где требуется
     * (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
     * <p>
     * Разработайте программу, которая выбросит Exception,
     * когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
     * что пустые строки вводить нельзя.
     */

    public float aFloat() {
        float f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число типа float");
        try {
            String temp = scanner.nextLine();
            f = Float.parseFloat(temp);
            return f;
        } catch (NumberFormatException e) {
            System.out.println("Введнное не является числом типа float");
            f = aFloat();
        }finally {
            scanner.close();
        }

        return f;
    }

    public void task2(int... intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            /**Если написать так
             * double catchedRes1 = (double) intArray[8] / d;
             * что правильнее (на мой взгляд) то ArithmeticException не нужен результат будет infinity
             */
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public void task3 (String str) {
        try {
            if (str.isEmpty())
                throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println(e);
            System.out.println("Пустые строки вводить нельзя");
        }

    }
}
