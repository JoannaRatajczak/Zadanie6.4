import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj X");
        point.x = scan.nextInt();
        System.out.println("Podaj Y");
        point.y = scan.nextInt();

        if (point.x > 0 && point.y > 0)
            System.out.println("Punkt (" + point.x + "," + point.y + ")" + "  znajduje się w I ćwiartce");
        if (point.x < 0 && point.y > 0)
            System.out.println("Punkt (" + point.x + "," + point.y + ")" + "  znajduje się w II ćwiartce");
        if (point.x < 0 && point.y < 0)
            System.out.println("Punkt (" + point.x + "," + point.y + ")" + "  znajduje się w III ćwiartce");
        if (point.x > 0 && point.y < 0)
            System.out.println("Punkt (" + point.x + "," + point.y + ")" + "  znajduje się w IV ćwiartce");

    }
}
