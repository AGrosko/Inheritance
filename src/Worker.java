public class Worker extends Person {

    double hourlyPayRate;


    public Worker(String id, String FirstName, String LastName, String Title, int YearOfBirth, double hourlyPayRate) {
        super(id, FirstName, LastName, Title, YearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

    //returns weekly pay with time and a half for overtime
    public double calculateWeeklyPay (double hoursWorked){
        double overtime;
        double weeklyPay;
        if (hoursWorked > 40){
            overtime = hoursWorked -40;
            weeklyPay = (hourlyPayRate *40) + (overtime * (hourlyPayRate * 1.5));
        }
        else{
            weeklyPay = hourlyPayRate * hoursWorked;
        }
        return weeklyPay;

    }

    public String displayWeeklyPay(double hoursWorked){
       double overtime;
       double overtimePay;
       double pay;
       double totalPay;

        if(hoursWorked > 40){
            overtime = hoursWorked - 40;
            overtimePay = overtime * (1.5 * hourlyPayRate);
            pay = 40 *hourlyPayRate;
            totalPay = pay +overtimePay;
            return this.formalName()+ ": Regular pay: 40 hours: $" + pay + " Overtime pay: " + overtime + " hours: $" +overtimePay + " Total pay: " + hoursWorked + " hours: $" + totalPay;


        }

        else{
            totalPay = hoursWorked * hourlyPayRate;

            return this.formalName() + ": Regular pay: " +hoursWorked + " hours: $" + totalPay + " No overtime";

        }


    }



}
