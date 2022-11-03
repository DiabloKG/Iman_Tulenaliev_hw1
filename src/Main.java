import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String NewWorldGame;
        final int NUM = 50;
        String word = "Hello";
        System.out.println(NUM + " " + word);
        NewWorldGame = 50 + "Hello";
        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0 ) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.println("Введите ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Привет " + username);


    }
}