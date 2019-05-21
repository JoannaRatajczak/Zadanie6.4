import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj X");
        int x = scan.nextInt();
        point.setX(x);
        System.out.println("Podaj Y");
        int y = scan.nextInt();
        point.setY(y);

        Chceck chceck = new Chceck();
        chceck.check(point.getX(), point.getY());



    }
}