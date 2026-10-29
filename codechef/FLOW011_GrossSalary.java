import java.util.*;

// CodeChef FLOW011 - Enter the Gross Salary (Easy)
// Idea: basic < 1500 -> HRA 10%, DA 90%; otherwise HRA 500, DA 98%. Gross = basic + HRA + DA.
// When submitting on CodeChef, rename the class to Main.
public class FLOW011_GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double basic = sc.nextDouble(), hra, da;
            if (basic < 1500) {
                hra = basic * 0.10;
                da = basic * 0.90;
            } else {
                hra = 500;
                da = basic * 0.98;
            }
            System.out.printf("%.2f%n", basic + hra + da);
        }
    }
}
