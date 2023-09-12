package homeWork2;


public class Task3 {

    public static void main(String[] args) // throws Exception или обрабатываем или выкидываем
    {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
            /**
             * в дааном коде нет объектов ссылочного типа
             * NullPointerException возникнуть не может
             */
       // } catch (NullPointerException ex) {
         //   System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {  // не уверен что это тоже надо. я бы не писал
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) // throws FileNotFoundException возникает при работе с файлами.
                                                        // здесь этого нет
     {
        System.out.println(a + b);
    }

}
