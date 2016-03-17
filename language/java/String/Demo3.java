import java.util.*;

public class Demo3{
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle(){
		f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
		f.format("%-15s %5s %10s\n", "---------------", "-----", "----------");
	}
	public void print(String name, int qty, double price){
		f.format("%-15s %5d %10.2f\n", name, qty, price);
		total += price;
	}
	public void printTotal(){
		f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
		f.format("%-15s %5s %10s\n", "---------------", "-----", "----------");
		f.format("%-15s %5s %10.2f\n", "Total", "", total*1.06);
	}
	
	public static void main(String[] args){
		Demo3 d = new Demo3();
		d.printTitle();
		d.print("Bear", 3, 10.5);
		d.print("Apple", 5, 7.5);
		d.print("Notebook", 1, 999.99);
		d.printTotal();
	}
}