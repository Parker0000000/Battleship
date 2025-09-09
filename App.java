// tester h 0 0 v 0 1 h 1 1 h 1 2 v 8 8
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
        String[][] P1gameboard = {
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
        String[][] P2gameboard = {
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

            //Aircraft Carrier
            int num3 = 0;
            System.out.println("Select the direction of your aircraft carrier");
            System.out.println("H = horizontal V = vertical");
            String V = input.next();
            System.out.println("Select the back tile (5 spots)");
            System.out.print("Enter the x axis: ");
            int x = input.nextInt();
            System.out.print("Enter the y axis: ");
            int y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 5) {
                    P1startboard[y][x] = "A";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 5) {
                    P1startboard[y][x] = "A";
                    y++;
                    num3++;
                    }
                }
            }

        num = 0;
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


            //Battleship
            num3 = 0;
            System.out.println("Select the direction of your battleship");
            System.out.println("H = horizontal V = vertical");
            V = input.next();
            System.out.println("Select the back tile (4 spots)");
            System.out.print("Enter the x axis: ");
            x = input.nextInt();
            System.out.print("Enter the y axis: ");
            y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 4) {
                    P1startboard[y][x] = "B";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 4) {
                    P1startboard[y][x] = "B";
                    y++;
                    num3++;
                    }
                }
            }
            num = 0;
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

            //Cruiser
            num3 = 0;
            System.out.println("Select the direction of your cruiser");
            System.out.println("H = horizontal V = vertical");
            V = input.next();
            System.out.println("Select the back tile (3 spots)");
            System.out.print("Enter the x axis: ");
            x = input.nextInt();
            System.out.print("Enter the y axis: ");
            y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 3) {
                    P1startboard[y][x] = "C";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 3) {
                    P1startboard[y][x] = "C";
                    y++;
                    num3++;
                    }
                }
            }
            num = 0;
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

            //Submarine
            num3 = 0;
            System.out.println("Select the direction of your submarine");
            System.out.println("H = horizontal V = vertical");
            V = input.next();
            System.out.println("Select the back tile (3 spots)");
            System.out.print("Enter the x axis: ");
            x = input.nextInt();
            System.out.print("Enter the y axis: ");
            y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 3) {
                    P1startboard[y][x] = "S";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 3) {
                    P1startboard[y][x] = "S";
                    y++;
                    num3++;
                    }
                }
            }
            num = 0;
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

            //Destroyer
            num3 = 0;
            System.out.println("Select the direction of your destroyer");
            System.out.println("H = horizontal V = vertical");
            V = input.next();
            System.out.println("Select the back tile (2 spots)");
            System.out.print("Enter the x axis: ");
            x = input.nextInt();
            System.out.print("Enter the y axis: ");
            y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 2) {
                    P1startboard[y][x] = "D";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 2) {
                    P1startboard[y][x] = "D";
                    y++;
                    num3++;
                    }
                }
            }
            num = 0;
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


            
        

        //P2 ships
        int p2ships = 0;
        
            System.out.println("Player two");
            
            num = 0;
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
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|");

            //P1 ships

            //Aircraft Carrier
             num3 = 0;
            System.out.println("Select the direction of your aircraft carrier");
            System.out.println("H = horizontal V = vertical");
             V = input.next();
            System.out.println("Select the back tile (5 spots)");
            System.out.print("Enter the x axis: ");
             x = input.nextInt();
            System.out.print("Enter the y axis: ");
             y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 5) {
                    P2startboard[y][x] = "A";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 5) {
                    P2startboard[y][x] = "A";
                    y++;
                    num3++;
                    }
                }
            }

        num = 0;
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
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|");


            //Battleship
            num3 = 0;
            System.out.println("Select the direction of your battleship");
            System.out.println("H = horizontal V = vertical");
            V = input.next();
            System.out.println("Select the back tile (4 spots)");
            System.out.print("Enter the x axis: ");
            x = input.nextInt();
            System.out.print("Enter the y axis: ");
            y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 4) {
                    P2startboard[y][x] = "B";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 4) {
                    P2startboard[y][x] = "B";
                    y++;
                    num3++;
                    }
                }
            }
            num = 0;
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
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|");

            //Cruiser
            num3 = 0;
            System.out.println("Select the direction of your cruiser");
            System.out.println("H = horizontal V = vertical");
            V = input.next();
            System.out.println("Select the back tile (3 spots)");
            System.out.print("Enter the x axis: ");
            x = input.nextInt();
            System.out.print("Enter the y axis: ");
            y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 3) {
                    P2startboard[y][x] = "C";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 3) {
                    P2startboard[y][x] = "C";
                    y++;
                    num3++;
                    }
                }
            }
            num = 0;
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
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|");

            //Submarine
            num3 = 0;
            System.out.println("Select the direction of your submarine");
            System.out.println("H = horizontal V = vertical");
            V = input.next();
            System.out.println("Select the back tile (3 spots)");
            System.out.print("Enter the x axis: ");
            x = input.nextInt();
            System.out.print("Enter the y axis: ");
            y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 3) {
                    P2startboard[y][x] = "S";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 3) {
                    P2startboard[y][x] = "S";
                    y++;
                    num3++;
                    }
                }
            }
            num = 0;
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
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|");

            //Destroyer
            num3 = 0;
            System.out.println("Select the direction of your destroyer");
            System.out.println("H = horizontal V = vertical");
            V = input.next();
            System.out.println("Select the back tile (2 spots)");
            System.out.print("Enter the x axis: ");
            x = input.nextInt();
            System.out.print("Enter the y axis: ");
            y = input.nextInt();
            if (V.equalsIgnoreCase("H")) {
                while (num3 < 2) {
                    P2startboard[y][x] = "D";
                    x++;
                    num3++;
                }
            }
            else {
                if (V.equalsIgnoreCase("V")){
                while (num3 < 2) {
                    P2startboard[y][x] = "D";
                    y++;
                    num3++;
                    }
                }
            }
            num = 0;
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
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|");


            
        
        
        //Actuall game
        int num4 = 0;
        int counter = 0;
        int counter2 = 0;
        //player one

        while (counter <= 17 || counter2 <= 17) {

            num = 0;
            System.out.print("    0   1   2   3   4   5   6   7   8   9");
            while (num < 10) {
                System.out.println();
                System.out.println("  |---|---|---|---|---|---|---|---|---|---|");
                int num2 = 0;
                
                System.out.print(num + " ");
                while (num2 < 10) {
                    System.out.print("| " + P1gameboard[num][num2] + " ");
                    num2++;
                }
                    System.out.print("|");
                num++;
            }
            System.out.println();
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|");
        
            System.out.println("Enter the x value for where you want to hit");
            int hitx = input.nextInt();
            System.out.println("Enter the y value for where you want to hit");
            int hity = input.nextInt();
            if (P2startboard[hity][hitx] == " ") {
                P1gameboard[hity][hity] = "o";
            }
            else {
                P1gameboard[hity][hitx] = "x";
                counter++;
            }
            num = 0;
            System.out.print("    0   1   2   3   4   5   6   7   8   9");
            while (num < 10) {
                System.out.println();
                System.out.println("  |---|---|---|---|---|---|---|---|---|---|");
                int num2 = 0;
                
                System.out.print(num + " ");
                while (num2 < 10) {
                    System.out.print("| " + P1gameboard[num][num2] + " ");
                    num2++;
                }
                    System.out.print("|");
                num++;
            }
            System.out.println();
            System.out.println("  |---|---|---|---|---|---|---|---|---|---|");

            //pause
           // Thread.sleep(10000);
    

         //player two
        
            num = 0;
            System.out.print("    0   1   2   3   4   5   6   7   8   9");
            while (num < 10) {
                System.out.println();
                System.out.println("  |---|---|---|---|---|---|---|---|---|---|");
                int num2 = 0;
                
                System.out.print(num + " ");
                while (num2 < 10) {
                    System.out.print("| " + P2gameboard[num][num2] + " ");
                    num2++;
                }
                    System.out.print("|");
                num++;
                 }
                System.out.println();
                System.out.println("  |---|---|---|---|---|---|---|---|---|---|");
                System.out.println("Enter the x value for where you want to hit");
                hitx = input.nextInt();
                System.out.println("Enter the y value for where you want to hit");
                hity = input.nextInt();
                if (P1startboard[hitx][hitx] == " ") {
                    P2gameboard[hity][hitx] = "o";
                }
                else {
                    P2gameboard[hity][hitx] = "x";
                    counter2++;
                }
                num = 0;
            System.out.print("    0   1   2   3   4   5   6   7   8   9");
            while (num < 10) {
                System.out.println();
                System.out.println("  |---|---|---|---|---|---|---|---|---|---|");
                int num2 = 0;
                
                System.out.print(num + " ");
                while (num2 < 10) {
                    System.out.print("| " + P2gameboard[num][num2] + " ");
                    num2++;
                }
                    System.out.print("|");
                num++;
                 }
                System.out.println();
                System.out.println("  |---|---|---|---|---|---|---|---|---|---|");
            

            //pause two
            //Thread.sleep(10000);

            //victory screen
            if (counter == 17 || counter2 ==17) {
                System.out.println("Player one wins");
            }
            else {
                System.out.println("Player two wins");
            }
        }
    }
}
