import java.util.Scanner;

public class Constants {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
    System.out.print("Введите number= ");
    int number = scanner.nextInt();
        int X=5;
        int Y=8;
        int Z=3;
    if (number==X || number==Y || number==Z) {
        System.out.print("Данное значение имеется в константах");
    }
    else {
        System.out.print("Такой константы нет!");
    }

    }

}
