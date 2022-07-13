import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of your electricity units: ");
		int units=sc.nextInt();
		double electricityBill=0;
		double standardPrice=1.20;
		if(units<100) {
			electricityBill=units*standardPrice;
		}else if(units>100 && units<=300) {
			electricityBill=(units-100)*(standardPrice+2)+(100*standardPrice);
		}else if(units>300) {
			electricityBill=(units-300)*(standardPrice+3)+200*(standardPrice+2)+ 100*(standardPrice);
		}
		System.out.println(electricityBill);
	}

}
