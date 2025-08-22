import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int ship = 1;
        int[][] P1startboard;
        P1startboard = new int[10][10];
        int[][] P2startboard;
        P2startboard = new int[10][10];

        //player ones ships
        int p1ships = 0;
        while (p1ships < 17) {
            System.out.println("Player one");
            
            int num = 0;
            System.out.print("    0   1   2   3   4   5   6   7   8   9");
            while (num < 10) {
                System.out.println();
                System.out.println("  |---|---|---|---|---|---|---|---|---|---|");
                int num2 = 0;
                
                System.out.print(num + " ");
                while (num2 < 10) {
                    System.out.print("| " + P1startboard[num][num2] + " ");
                    num2++;
                }
                    System.out.print("|");
                num++;
            }
            System.out.println();
            System.out.print("Enter the x axis: ");
            int x = input.nextInt();
            System.out.print("Enter the y axis: ");
            int y = input.nextInt();
            P1startboard[x][y] = ship;
            p1ships++;
        }
        
        //player twos ships
        int p2ships = 0;
        while (p2ships < 17) {
            System.out.println("Player two");
            
            int num = 0;
            System.out.print("    0   1   2   3   4   5   6   7   8   9");
            while (num < 10) {
                System.out.println();
                System.out.println("  |---|---|---|---|---|---|---|---|---|---|");
                int num2 = 0;
                
                System.out.print(num + " ");
                while (num2 < 10) {
                    System.out.print("| " + P2startboard[num][num2] + " ");
                    num2++;
                }
                    System.out.print("|");
                num++;
            }
            System.out.println();
            System.out.print("Enter the x axis: ");
            int x = input.nextInt();
            System.out.print("Enter the y axis: ");
            int y = input.nextInt();
            P2startboard[x][y] = ship;
            p2ships++;
        }
    }
}
