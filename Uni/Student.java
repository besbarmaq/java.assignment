package Uni;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double avgMark;

    public Student(String firstName,String lastName,String group,double averageMark){
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
        this.avgMark=avgMark;
    }
    public static void main(String[] args){
        Student first=new Student("Fedya", "Solom", "IT", 4);
        Aspirant second=new Aspirant("Alex", "Morocco", "IT", 5, "JKO");
        first.getScholarship(first.avgMark);
        second.getScholarship(second.avgMark);
    }
    public void getScholarship(double avgMark){
        if(avgMark==5){
            System.out.println(100);
        }
        else
            System.out.println(80);
    }

}

