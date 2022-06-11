import java.util.Scanner;

public class Portfolio {
    public static void stockDetails() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter how many share you want?");
        int num = obj.nextInt();
        int sharePrice = 0;
        int shareNum = 0;
        String shareName = null;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter share name: ");
            shareName = obj.next();
            System.out.print("Enter share price: ");
            sharePrice = obj.nextInt();
            System.out.print("Enter number of share you want to buy: ");
            shareNum = obj.nextInt();
            int totalPrice = sharePrice * shareNum;

            System.out.print("Share Name: "+shareName +","+"\tEach Share price: " + sharePrice+","+ "\tNumber of shares: " + shareNum+"\t");
            System.out.println("Total value of " + shareName + " shares: " + totalPrice);
        }
    }
    public static void main(String[] args) {
        stockDetails();
    }
}
