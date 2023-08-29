import jdk.internal.icu.text.UnicodeSet;

import java.util.*;

public class Main {
    /*   1. Создать список из 100 рандомных элементов от 1 до 100
         1.2. Найти максимальное число
         1.3. Найти минимальное число
         1.4. Найти число, которое чаще всего повторяется
         1. 5. Отсортировать список
         1. 6. Найти в этом списке числа 5, 7 и сколько раз они повторяются
         1.7. Создать список из 5 элементов с рандомными числами от 1 до 100.  Создать копию этого списка.
                 Перемешивать, пока не будет отсортирован по возрастанию.
         */
    public static void main(String[] args) {

        List <Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            int num = (int)(( Math.random() * (100) + 1));
            numbers.add(num);
        }

        System.out.println("numbers: "+numbers);
        System.out.println("Размер ="+numbers.size());
        System.out.println("\n Первый способ");

        System.out.println("Нахождение Max c помощью (Collections.max(numbers))): "+Collections.max(numbers));//
        System.out.println("Нахождение Min c помощью (Collections.min(numbers))): "+Collections.min(numbers));

        int maxCount=0;
        int maxElement=0;

        for (Integer ints: numbers) {
           int frR = Collections.frequency(numbers,ints);
            System.out.println("frR: = "+frR);
           if (frR> maxCount){
               maxCount =frR;
               maxElement=ints;
           }
        }
        System.out.println(maxCount);
        System.out.println(maxElement);




        System.out.println("\n Второй способ");
        int min = numbers.get(0);
        int max = numbers.get(0);

        for (Integer i: numbers) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }

        System.out.println("Нахождение min c помощью цикла: " + min);
        System.out.println("Нахождение max c помощью цикла: " + max);

        System.out.println("\n Третий способ");
        //с помощью sort : сортируем список по возрастанию и выводим первый элемент который будет min, и последний max.

        Collections.sort(numbers);
        System.out.println("Нахождение минимума с после сортировки: "+numbers.get(0));
        System.out.println("Нахождение минимума с после сортировки:"+numbers.get(numbers.size() - 1));

        System.out.println(numbers);

        // 1. 6. Найти в этом списке числа 5, 7 и сколько раз они повторяются
        int countOfFive=0;
        int countOfSeven=0;
        for (Integer i: numbers) {
            if(i == 5)
              countOfFive = countOfFive+1;
            if(i == 7)
                countOfSeven = countOfSeven+1;
        }
        System.out.println("Число 5 повторяется "+countOfFive+" раз");
        System.out.println("Число 7 повторяется "+countOfSeven+" раз");



            //1.8
        ArrayList <Integer> numbers2 = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            int num = (int)(( Math.random() * (100) + 1));
            numbers2.add(num);
        }

        //System.out.println(numbers.containsAll(numbers2));

        System.out.println("numbers2: "+numbers2);

       /* 1. 8. Создать 2 списка из 10 элементов от 1 до 100. Проверить с какой попытки у вас получится
        создать списки с уникальными значениями.
                numbers: [79, 84, 64, 55, 9, 32, 49, 71, 96, 39]
                number2: [19, 39, 7, 27, 78, 24, 95, 54, 38, 63]
       c третьей попытки
        */

        //1.4










    }

}