public class PayrollRunner {
    public static void main(String[] args) {
        int[] items = {48, 50, 37, 62, 38, 70, 55, 37, 64, 60};
        Payroll payroll = new Payroll(items);

        // test computeBonusThreshold method
        System.out.println(payroll.computeBonusThreshold()); // should print 51.75

        // call the computeWages method (no return value)
        payroll.computeWages(10, 1.5);

        // use a getter method to obtain the updated wages and print it out to test
        double[] wages = payroll.getWages();
        System.out.println(wages[0]);  // should print 82.0
        System.out.println(wages[9]);  // should print 110.0

        // you could also just print ALL of the elements, and check
        // elements at index 0 and 9 to make sure they are 82.0 and 110.0
        for (double wage : wages)
        {
            System.out.print(wage + " ");
        }

    }
}
