/*
 * Name: Tongwa Aka, Phuong Tran,  Emmanuel Pikounis,  Johan Milele,
 * Overview: Input the name and zip code of the shaved ice stand. Then enter the number of sales per size, 
  				performs the necessary computations, computes the 6% tax, and displays the billfor the cashier. 
 * Input: the name of shaved ice - location, the zipcode, and the number of small, medium, and large.
 * Output: the price, total, subtotal, the tax, and the subtotal with included taxes. it also outputs the 
 * Variables: location, zipcode, smallBall, meduimBall,LargeBall, small, medium, large, 
 			smallTotal, mediumTotal, largeTotal, subTotal, tax
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class ShavedIceStand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		String location;
		String zipCode;

		//Ask the user for the name of the shave ice stand, and the zip code
		System.out.print("Enter name of shaved ice stand:\t");
		location = scan.next();
		System.out.print("Enter zip code:\t");
		zipCode = scan.next();

		//Use the IceStand class to set the name and location values
		IceStand stand = new IceStand(location, zipCode);

		Snowball smallBall = new Snowball();
		Snowball mediumBall = new Snowball(); 
		Snowball largeBall = new Snowball();


		int small, medium, large;

		//The user enters the number of small, medium, and large snowballs sold in this	transaction
		System.out.print("\nEnter number of small (-1 to stop).....");
		small = scan.nextInt();

		while (small != -1)
		{
			System.out.print("Enter number of medium......");
			medium = scan.nextInt();

			System.out.print("Enter number of large.......");
			large = scan.nextInt();


			double smallTotal = smallBall.calculatePrice("Small", small, 1.25);
			double mediumTotal = mediumBall.calculatePrice("Medium", medium, 2.40);
			double largeTotal = largeBall.calculatePrice("Large", large, 3.55);

			System.out.println(stand);
			System.out.println("\n\t\t\tPrice\t Total");

			System.out.println(smallBall);
			System.out.println(mediumBall);
			System.out.println(largeBall);

			//Calculate and display the total of the bill, including the subtotal.
			double subTotal = smallTotal + mediumTotal + largeTotal;
			double tax = Snowball.calculateTax(smallTotal + mediumTotal + largeTotal);

			System.out.println("\nSub-total  \t\t\t\t" + fmt.format(subTotal));
			System.out.println("Tax (6%)   \t\t\t\t" + fmt.format(tax));
			System.out.println("\tTotal bill \t\t\t" + fmt.format(subTotal + tax));

			System.out.print("\nEnter number of small (-1 to stop).....");
			small = scan.nextInt();
		}
		scan.close();
	}
}
