import jdk.internal.icu.text.UnicodeSet;

import java.util.*;

public class Main {
            /*   1. Создать список из 100 рандомных элементов от 1 до 100.
                 1.2. Найти максимальное число.
                 1.3. Найти минимальное число.
                 1.4. Найти число, которое чаще всего повторяется.
                 1.5. Отсортировать список.
                 1.6. Найти в этом списке числа 5, 7 и сколько раз они повторяются.
                 1.7. Создать список из 5 элементов с рандомными числами от 1 до 100.  Создать копию этого списка.
                         Перемешивать, пока не будет отсортирован по возрастанию
                 1. 8. Создать 2 списка из 10 элементов от 1 до 100. Проверить с какой попытки у вас получится
                     создать списки с уникальными значениями
              */
    public static void main(String[] args) {

        //1. Создать список из 100 рандомных элементов от 1 до 100

        List <Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            int num = (int)(( Math.random() * (100) + 1));
            numbers.add(num);
        }
        System.out.println("\n  Пункт 1. \n"+numbers);

        //1.2 Найти максимальное число.
        //1.3 Найти минимальное число.

        System.out.println("\n  Пункты 1.2 и 1.3\n Первый способ");
        System.out.println("Нахождение Min c помощью (Collections.min(numbers))): "+Collections.min(numbers));
        System.out.println("Нахождение Max c помощью (Collections.max(numbers))): "+Collections.max(numbers));

        System.out.println("\n  Пункты 1.2 и 1.3\n Второй способ");
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

        System.out.println("\n  Пункты 1.2 и 1.3\n Третий способ ");

       // с помощью sort : сортируем список по возрастанию и выводим первый элемент который будет min, и последний max.
       //  1.5 Отсортировать список.

        Collections.sort(numbers);
        System.out.println("Нахождение минимума с после сортировки: "+numbers.get(0));
        System.out.println("Нахождение минимума с после сортировки: "+numbers.get(numbers.size() - 1));

        System.out.println("\n  Пункт 1.5(отсортированный список):\n "+numbers);

        //1.4. Найти число, которое чаще всего повторяется

        int maxCount=0;
        int maxElement=0;
        for (Integer i: numbers) {
            int frResult = Collections.frequency(numbers,i);//выводит сколько раз каждый элемент повторяется в списке // System.out.println("frR: = "+frR);
            if (frResult > maxCount){
                maxCount = frResult;
                maxElement = i;
            }
        }
        System.out.println("\n  Пункт 1.4");
        System.out.println("maxCount="+maxCount+"; maxElement="+maxElement+";");
        System.out.println("Число "+maxElement+" повторяется в списке максимальное число раз равное: "+maxCount);

        //1.6. Найти в этом списке числа 5, 7 и сколько раз они повторяются.

        System.out.println("\n  Пункт 1.6 ");
        int countOfFive=0;
        int countOfSeven=0;
        for (Integer i: numbers) {
            if(i == 5)
              countOfFive++;
            if(i == 7)
                countOfSeven++;
        }
        System.out.println("Число 5 повторяется "+countOfFive+" раз");
        System.out.println("Число 7 повторяется "+countOfSeven+" раз");

        //1.7. Создать список из 5 элементов с рандомными числами от 1 до 100.  Создать копию этого списка.
        //   Перемешивать, пока не будет отсортирован по возрастанию
        System.out.println("\n  Пункт 1.7");
       List <Integer> nums = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            int num = (int)(( Math.random() * (100) + 1));
            nums.add(num);
        }
        List<Integer> copyNums = new ArrayList<>(nums);
        System.out.println("Первый список: "+nums);
        System.out.println("Копия первого списка "+copyNums);
        Collections.sort(nums);
        System.out.println("Первый список после сортировки: "+nums);

        int countOfShuffle = 0;
        while(!copyNums.equals(nums)){
            Collections.shuffle(copyNums);
            countOfShuffle++;
        }
        System.out.println("Копия первого списка после перемешивания: "+copyNums);
        System.out.println("Количество итераций перемешивания : "+countOfShuffle);


//       /*   1.8. Создать 2 списка из 10 элементов от 1 до 100.
//            Проверить с какой попытки у вас получится создать списки с уникальными значениями.*/
//        System.out.println("\n Пункт 1.8");
//        List <Integer> list1 = new ArrayList<>();
//        List <Integer> list2 = new ArrayList<>();
//        int chance = 0;
//        do {
//            for (int i = 1; i <= 4; i++) {
//            int num = (int) ((Math.random() * (100) + 1));
//            list1.add(num);
//        }
//            for (int j = 1; j <= 4; j++) {
//                int num = (int) ((Math.random() * (100) + 1));
//                list2.add(num);
//            }
//            chance++;
//
//        }while(!Collections.disjoint(list1,list2));
//            System.out.println("Список из 10 элементов: " + list1);
//            System.out.println("Список из 10 элементов: " + list2);
//            System.out.println("chance: " + chance);

    }

}