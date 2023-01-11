public class Payroll
{
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)

    public Payroll(int[] items)
    {
        itemsSold = items;
        wages = new double[items.length];
    }

    public double[] getWages() {
        return wages;
    }

    /*  Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold()
    {
        int most = 0;
        int least = 100;
        for (int num : itemsSold) {
            if (num > most) {
                most = num;
            }
            else if (num < least) {
                least = num;
            }
        }

        int sum = 0;
        for (int num : itemsSold) {
            sum += num;
        }

        return (double) (sum - most - least) / itemsSold.length - 2;

    }

    /* Computes employee wages as described in part (b) and stores
    them in wages. The parameter fixedWage represents the fixed
    amount each employee is paid per day. The parameter
    perItemWage represents the amount each employee is paid per
    item sold.
    */
    public void computeWages(double fixedWage, double perItemWage)
    {
        double bonusThreshold = computeBonusThreshold();
        for (int i = 0; i < wages.length; i++) {
            double wage = fixedWage + perItemWage * itemsSold[i];
            if (itemsSold[i] > bonusThreshold) {
                wage = wage * 1.1;
            }
            wages[i] = wage;
        }

    }
}
