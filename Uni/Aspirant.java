package Uni;

public class Aspirant extends Student{
    public String work;
    public Aspirant(String firstName,String lastName,String group,double averageMark, String work){
        super(firstName,lastName,group,averageMark);
        this.work=work;
    }
    public void getScholarship(double averageMark){
        if(averageMark==5){
            System.out.println(200);
        }
        else
            System.out.println(180);
    }
}