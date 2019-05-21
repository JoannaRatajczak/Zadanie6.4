public class Chceck {

    void check (int x, int y) {

        if (x >0 && y >0)
        System.out.println("Punkt (" + x + "," + y + ")" + "  znajduje się w I ćwiartce");
        if (x < 0 && y > 0)
            System.out.println("Punkt (" + x + "," + y + ")" + "  znajduje się w II ćwiartce");
        if (x < 0 && y < 0)
            System.out.println("Punkt (" + x + "," + y + ")" + "  znajduje się w III ćwiartce");
        if (x > 0 && y < 0)
            System.out.println("Punkt (" + x + "," + y + ")" + "  znajduje się w IV ćwiartce");
    }
}
