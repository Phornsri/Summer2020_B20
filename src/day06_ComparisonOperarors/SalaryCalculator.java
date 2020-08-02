package day06_ComparisonOperarors;

public class SalaryCalculator {

    public static void main(String[] args) {
        double rate=55;
        double stateTaxRate=0.04;
        double federalTaxRate=0.22;
        byte weeklyHours=40;
        // salary: rate * weeklyHours * 48
        // totalTax: salary * (stateTaxRate + federalTaxRate)
        // salaryAfterTax: salary - totalTax
        double salary= rate*weeklyHours*48;
        double totalTax = salary*(stateTaxRate+federalTaxRate);
        double salaryAfterTax = salary - totalTax;
        System.out.println(salary);
        System.out.println(totalTax);
        System.out.println(salaryAfterTax);
        System.out.println("your salary is: "+salary+" USD");
        System.out.println("your total tax is: "+totalTax+" USD");
        System.out.println("your income after tax is: "+salaryAfterTax+" USD");






    }

}
