public class SalaryWorker extends Worker{

    double annualSalary;

    public SalaryWorker(String id, String FirstName, String LastName, String Title, int YearOfBirth, double annualSalary){
        super(id,FirstName,LastName,Title,YearOfBirth,0);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary/52;
    }

    public String displayWeeklyPay(double hoursWorked){

        return this.formalName() +": Salary pay per week: " + String.format("%.2f",annualSalary/52);
    }
}
