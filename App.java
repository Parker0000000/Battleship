import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        string ship ="x";
        
        int[][] P1startboard;
        P1startboard = new int[10][10];
        int p1ships = 0;
        while (p1ships < 17) {
            int x = input.nextint();
            int y = input.nextint();
            P1startboard[x][y] = ship;
            system.out.println(P1startboard[x][y]);
            system.out.println(p1ships);
            p1ships++;
        }

    }
}
