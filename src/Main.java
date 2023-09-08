import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Worker hourlyWorkerA = new Worker("001","Dave", "Wheeler", "Mr." , 2000,20);

        Worker hourlyWorkerB = new Worker("002","Andrew", "Grosko", "Mr." , 2003,22);

        Worker hourlyWorkerC = new Worker("003","Noah", "Regala", "Mr." , 2004,19);

        SalaryWorker salaryWorkerA = new SalaryWorker("004","Ireland" , "Castle", "Ms.",2003,40000 );

        SalaryWorker salaryWorkerB = new SalaryWorker("005","Josh" , "Scott", "Mr.",1984, 80000 );

        SalaryWorker salaryWorkerC = new SalaryWorker("006","Jane" , "Doe", "Ms.",1997,90000 );

        ArrayList<Worker> workerData = new ArrayList<Worker>();

        workerData.add(hourlyWorkerA);
        workerData.add(hourlyWorkerB);
        workerData.add(hourlyWorkerC);

        workerData.add(salaryWorkerA);
        workerData.add(salaryWorkerB);
        workerData.add(salaryWorkerC);


        System.out.println("Week 1: 40 hour work week");
        System.out.println();
        int index = 0;
         while (index < 6){

             System.out.println(workerData.get(index).displayWeeklyPay(40));

             index++;
         }
        System.out.println();
        System.out.println("Week 2: 50 hour work week");
        System.out.println();
         index = 0;
        while (index < 6){

            System.out.println(workerData.get(index).displayWeeklyPay(50));

            index++;
        }
        System.out.println();
        System.out.println("Week 3: 40 hour work week");
        System.out.println();
        index = 0;
        while (index < 6){

            System.out.println(workerData.get(index).displayWeeklyPay(40));

            index++;
        }

    }
}