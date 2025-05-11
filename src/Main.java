public class Main {
    public static void main(String[] args) {
        // Declare and initialize seasonal maintenance costs
        double springCost = 250.00;
        double summerCost = 300.00;
        double fallCost = 200.00;
        double winterCost = 275.00;

        // Calculate total yearly cost
        double totalCost = springCost + summerCost + fallCost + winterCost;

        // Display the seasonal costs and total
        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + totalCost);
    }
}