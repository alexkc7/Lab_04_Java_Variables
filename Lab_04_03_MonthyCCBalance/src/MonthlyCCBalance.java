public class MonthlyCCBalance {
    public static void main(String[] args)
    {
        double cardBalance = 5000.00;
        double monthlyInterest = 0.17;
        int months = 2;

        for (int i = 1; i <=months; i++) {
            double interest = cardBalance * monthlyInterest;
            cardBalance += interest;
            System.out.print("Interest after Month " + i + ": " + interest);
            System.out.print("\nBalance after Month " + i + ": " + cardBalance);
        }
    }
}