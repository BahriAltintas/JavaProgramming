package day39_Recap.cydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age <= 0 || age >150){
            System.err.println("Invalid Age: " + age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if( !(gender == 'F' || gender == 'M') ){
            System.err.println("Gender should not be set to any character other than: 'M' and 'F'");
            System.exit(1);
        }

        this.gender = gender;
    }


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }


    public void eat(){
        System.out.println(name + " eating");
    }

    public void drink(){
        System.out.println(name + " drinking");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named Person:
            Variables:
                name, age, gender
            Encapsulate all the fields
            Add a constructor to set all the fields
            Methods:
                eat()
                drink()
                sleep()
                toString()
 */
