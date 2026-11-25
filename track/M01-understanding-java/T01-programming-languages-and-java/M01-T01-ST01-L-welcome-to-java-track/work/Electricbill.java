
public class Electricbill {

    public static void main(String[] args) {
        String customerName = "Rahul";
        int unitsConsumed = 350;

        if (unitsConsumed <= 0) {
            System.out.println("Invalid Units");
        } else {
            double electricityBill = 0;

            if (unitsConsumed <= 100) {
                electricityBill = unitsConsumed * 2;
            } else if (unitsConsumed <= 200) {
                electricityBill = (100 * 2) + ((unitsConsumed - 100) * 3);
            } else if (unitsConsumed <= 300) {
                electricityBill = (100 * 2) + (100 * 3) + ((unitsConsumed - 200) * 5);
            } else {
                electricityBill = (100 * 2) + (100 * 3) + (100 * 5) + ((unitsConsumed - 300) * 7);
            }

            double surcharge = 0;
            if (electricityBill > 1000) {
                surcharge = electricityBill * 0.05;
            }

            double totalBill = electricityBill + surcharge;

            System.out.println("Customer Name: " + customerName);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("Electricity Bill: ₹" + electricityBill);
            System.out.println("Surcharge: ₹" + surcharge);
            System.out.println("Total Bill: ₹" + totalBill);
        }
    }

}
