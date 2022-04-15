package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        // hourlyRate, weeklyHours

        int hourlyRate = 65;
        int weeklyHours = 45;

        int salary = hourlyRate * weeklyHours * 52; // 52: Number of weeks. İf you want you can formula it as variable

        //System.out.println(salary);

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);


        int hourlyRate2 = 65;
        int weeklyHours2 = 45;
        int numberOfWeeks = 52;

        System.out.println("----------------------------------------------");

        int salary2 = hourlyRate * weeklyHours * numberOfWeeks;

        //System.out.println(salary);

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);

    }


}
