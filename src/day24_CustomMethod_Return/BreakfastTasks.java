package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("Bahri", "Altıntaş"); // B.A

        System.out.println("--------------------------------------------");

        domain("bahrialtintas@gmail.com");

        System.out.println("--------------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email: emails) {
            domain(email);
        }

        System.out.println("--------------------------------------------");

        nameOfMonth(3);

        System.out.println("--------------------------------------------");

        nameOfDay(5);

        System.out.println("--------------------------------------------");

        daysInMont(3);

        System.out.println("--------------------------------------------");

        ageGroups(33);

    }

    //1. Create a method that can display the initials of the person,  initials(String firstName, lastName)
    public static void initials(String firstname, String lastname){

        String initial = firstname.charAt(0)+"."+lastname.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //2. Create a method that can display the domain of the email,  domain(String email)
    public static void domain(String email){  //bahrialtintas@gmail.com

        String domain = email.substring( email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

    String name = "";

    if (number >= 1 && number <= 12){

        name = (number == 1)? "Jan" :(number == 2)? "Feb" :(number == 3)? "Mar" :(number == 4)? "Apr"
                :(number == 5)? "May" :(number == 6)? "Jun" :(number == 7)? "July" :(number == 8)? "Aug"
                :(number == 9)? "Sep" :(number == 10)? "Oct" :(number == 11)? "Nov" : "Dec";

    }else {
        name = "Invalid";
    }

        System.out.println("Month name = "+name);

    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String name = "";

        if (number >= 1 && number <= 7){

            name = (number == 1)? "Monday" :(number == 2)? "Tuesday" :(number == 3)? "Wednesday" :(number == 4)? "Thursday"
                    :(number == 5)? "Friday" :(number == 6)? "Saturday" : "Sunday";

        }else {
            name = "Invalid";
        }

        System.out.println("Day name = "+name);

    }


    //5. Create a method that can print how many days a month has
    public static void daysInMont(int number){

        boolean has28Days = number == 2; // for the month that has 28 days
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11; // for the month that has 30 days
        boolean has31Days = !has28Days && !has30Days; // if the month does not have 28 days and does not have 30 days

        if (has28Days) { //if the months has 28 days
            System.out.println(number + ". Mont Has 28 Days");
        }
        if (has30Days) { //if the months has 30 days
            System.out.println(number + ". Mont Has 30 Days");
        }
        if (has31Days) { //if the months has 31 days
            System.out.println(number + ". Mont Has 31 Days");
        }
    }

    //6. ageGroups(int age)
    public static void ageGroups(int age){
        String result = "";

        result = (age>=1 && age<=2)? "Infant": (age>=3 && age<=5)? "Toddler": (age>=6 && age<=9)? "Kid": (age>=10 && age<=13)?
        "Pre-Teen": (age>=14 && age<=17)? "Teen": (age>=18 && age<=20)? "Young Adult": (age>=21 && age<=39)? "Adult":
        (age>=40 && age<=49)? "Young Middle-Aged Adult": (age>=50 && age<=54)? "Middle-Aged Adult": (age>=55 && age<=64)?
        "Very Young Senior Citizen": (age>=65 && age<=74)? "Young Senior Citizen": (age>=75 && age<=84)? "Senior Citizen":
        "Old Senior Citizen";

        System.out.println("Age group is = " + result);
    }


}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
	3. Create a method that can display the name of the month based on the given number to the method
	4. Create a method that can print the name of the day based on the given number to the method
	5. Create a method that can print how many days a month has
    6. ageGroups
                age groups are:
                        infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
                        */
