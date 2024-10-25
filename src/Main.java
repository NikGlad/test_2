import java.util.Arrays;
import java.util.Scanner;


/*
Task1
 */
//public class Main {
//    public static void main(String[] args) {
//    String name;
//    int age;
//    String city;
//    }
//}

/*
Task2
 */

//public class Main {
//    public static void main(String[] args) {
//    System.out.println("3118");
//    }
//}

/*
Task3
 */

//public class Main {
//    public static void main(String[] args) {
//        int intValue = 2;
//        int numericValue = 3;
//        int size = 4;
//        int number = 5;
//    }
//}

/*
Task4  Полнометражная картина
*/

//public class Main {
//    public static void main(String[] args) {
//        int centimeters  = 500;
//        int meters  = centimeters/100;
//        System.out.println(meters);
//    }
//}

/*
Task5    Последняя цифра числа
 */

//public class Main {
//    public static void main(String[] args) {
//        int number   = 523254;
//        int lastDigit   = number % 10;
//        System.out.println(lastDigit );
//    }
//}

/*
Task6   9-ка это перевернутая 6-ка
 */

//public class Main {
//    public static void main(String[] args) {
//        int six   = 6;
//        six ++;
//        six ++;
//        six ++;
//        System.out.println(six );
//    }
//}

/*
Task14    Причешем резюме (перевод заглавных букв в строчные)
 */
//public class Main {
//    public static void main(String[] args) {
//    String title = "MY NAME";
//    String degree  = "IS NICK";
//    String career = "I AM PROGRAMMER";
//        System.out.println(title.toLowerCase());
//        System.out.println(degree.toLowerCase());
//        System.out.println(career.toLowerCase());
//    }
//}

/*
Task15   Попрошу регистр на меня не повышать!
 */

//public class Main {
//    public static void main(String[] args) {
//        String title = "my name";
//        String degree  = "is nick";
//        String career = "i am programmer";
//        System.out.println(title.toUpperCase());
//        System.out.println(degree.toUpperCase());
//        System.out.println(career.toUpperCase());
//    }
//}


/*
Task16     Чтение и преобразование строк
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String result = scanner2.nextLine();
        String result1 = scanner.nextLine();
        String result2 = scanner1.nextLine();

        System.out.println(result);
        System.out.println(result1.toUpperCase());
        System.out.println(result2.toLowerCase());

    }
}