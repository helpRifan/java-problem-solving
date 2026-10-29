import java.util.*;

// CodeChef FLOW010 - ID and Rank (Easy)
// Idea: map the class ID letter (case-insensitive) to a ship name with a switch.
// When submitting on CodeChef, rename the class to Main.
public class FLOW010_IDAndRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char c = Character.toUpperCase(sc.next().charAt(0));
            switch (c) {
                case 'B': System.out.println("BattleShip"); break;
                case 'C': System.out.println("Cruiser"); break;
                case 'D': System.out.println("Destroyer"); break;
                case 'F': System.out.println("Frigate"); break;
            }
        }
    }
}
