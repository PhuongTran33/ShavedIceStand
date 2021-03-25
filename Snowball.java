/*
 * Name: Tongwa Aka, Phuong Tran,  Emmanuel Pikounis,  Johan Milele,
 * Overview: Calculate the total price, includng tax and subtotal
 * Input: N/A
 * Output: N/A
 * Variables: size , quantity, unitPrice, totalPrice, TAX_RATE = 0.06
 */
import java.text.NumberFormat;
public class Snowball {

	private String size;
	private int quantity;
	private double unitPrice;
	private double totalPrice;
	private final static double TAX_RATE = 0.06;
	
	//Constructor
	public Snowball ()
	{
		size = null;
		quantity = 0;
		unitPrice = 0;
		totalPrice = 0;
	}
	
	//CalculatePrice Method
	public double calculatePrice(String itemSize, int itemQuantity, double itemUnitPrice)
	{
		size = itemSize;
		quantity = itemQuantity;
		unitPrice = itemUnitPrice;
		totalPrice = (quantity * unitPrice);
		return totalPrice;
	}
	
	//toString Method
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return size + "\t\t " + quantity + "\t" + fmt.format(unitPrice) +"\t" + fmt.format(totalPrice);
	}
	
	//CalculateTax Method
	public static double calculateTax(double total)
	{
		return TAX_RATE * total;
	}
}