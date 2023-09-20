package payroll;
import java.util.Scanner;

public class payslip {

	public static void main(String[] args) {
	int EmpNo;
	String Name;
	String Designation;
	int DaysWorked;
	int payRate;
	String GenDate;
	int BasicPay;
	int GrossEarn;
	int P;
	Scanner emp= new Scanner(System.in);
	System.out.println("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP : ");
	EmpNo = emp.nextInt();
	
	Scanner Nam = new Scanner(System.in);
	System.out.println("Enter employee name :");
	Name = Nam.nextLine();
	
	Scanner pay = new Scanner(System.in);
	System.out.print("enter the payrate : ");
	payRate = pay.nextInt();
	
	Scanner des = new Scanner(System.in);
	System.out.println("enter designation :");
	Designation = des.nextLine();
	
	Scanner day = new Scanner(System.in);
	System.out.println("Enter the number of days worked :");
	DaysWorked = day.nextInt();
	
	Scanner in = new Scanner(System.in);
	System.out.println("enter the generation date: ");
	GenDate = in.nextLine();
	
	BasicPay = DaysWorked * payRate;
	GrossEarn = BasicPay;
	P = BasicPay / 10;
	final int ProfTax = (int) (0.2 *BasicPay);
	int Total = P + ProfTax;
	int Net = GrossEarn - Total;
	System.out.println(" Enter THE EMPLOYEE NO TO GENERATE PAYSLIP : " +EmpNo);
	System.out.println("");
	System.out.println("                           SHREE KRISHNA CHEMISTS AND DRUGGIST");
	System.out.println("                                      SALARY MONTH 9 2013");
	System.out.println("     EMP.NO.: " +EmpNo+"	          EMP.NAME: "+Name+"           DESIGNATION: "+Designation);
	System.out.println("     DAYS WORKED: "+DaysWorked+"      PAY RATE: "+payRate+"        GEN.DATE:"+GenDate);
	System.out.println("     __________________________________________________________________________");
	System.out.println("     EARNINGS      AMOUNT(RS.)      DEDUCTIONS      AMOUNT(RS.)");
	System.out.println("     __________________________________________________________________________");
	System.out.println("     BASIC PAY      " +BasicPay+"               P.F.              "+P);
	System.out.println("                                    PROF.TAX          "+ProfTax);
	System.out.println("     __________________________________________________________________________");
	System.out.println("     GROSS EARN.    "+GrossEarn+"               TOTAL DEDUCT.     "+Total);
	System.out.println("                                    NET PAY           "+Net);
	System.out.println("     __________________________________________________________________________");
	
	

	}

}
