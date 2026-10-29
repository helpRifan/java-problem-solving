// Practice - Armstrong number check (Easy)
// Idea: sum of each digit raised to the number of digits equals the number itself.
public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int digits = String.valueOf(n).length(), temp = n, sum = 0;
        while (temp > 0) {
            sum += (int) Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // true
        System.out.println(isArmstrong(154)); // false
    }
}
