package mainPackage;
//CISC181 Lab #1
//Gregory Lort
//9/11/15

import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class Annuinty {
	
	public static void main(String[] args){
		//Input variables
		double rate;
		double years;
		double monthlyIncome;
		boolean t;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter annual return rate on investment during retirement.");
		rate = input.nextDouble();
		
		System.out.println("Enter expected number of years retired.");
		years = input.nextDouble();
		
		System.out.println("Enter required monthly income in retirement.");
		monthlyIncome = input.nextDouble();
		
		//PV calculation variables
		double PV;
		double r = rate/12;
		double n = years*12;
		double y = monthlyIncome - 2642;
		double f = 0;
		t = false;
		
		PV = FinanceLib.pv(r,n,y,f,t);
		
		System.out.println("Required retirement savings: "+ PV);
		
		
		System.out.println("Enter expected rate of return on investment before retirement.");
		rate = input.nextDouble();
		
		System.out.println("Enter number or years working.");
		years = input.nextDouble();
		
		//PMT calculation variables
		double PMT;
		r = rate/12;
		n = years*12;
		double p = 0;
		f = PV;
		t = false;
		
		PMT = FinanceLib.pmt(r,n,p,f,t);
		System.out.println("Required investment per month: "+PMT);
		
		
	}
	

}
