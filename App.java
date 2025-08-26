import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //starting boards
        String[][] P1startboard = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
        };
        String[][] P2startboard = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
        };

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
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|");

            //P1 ships
            int num3 = 0;
            System.out.println("Select the direction of your aircraft carrier");
            System.out.println("H = horizontal V = vertical");
            String AC = input.nextLine();
            Char AR = AC.charAt(0);
            System.out.println("Select the back tile");
            System.out.print("Enter the x axis: ");
            int x = input.nextInt();
            System.out.print("Enter the y axis: ");
            int y = input.nextInt();
            String V = "V";
            if (AR == V) {
                while (num3 < 4) {
                    P1startboard[y][x] = "A";
                    x++;
                    num3++;
                }
            }
            else {
                while (num3 < 4) {
                    P1startboard[y][x] = "A";
                    y++;
                    num3++;
                }
            }
            
            p1ships++;
        }
    }
}
