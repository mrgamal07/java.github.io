package STUDENT_MANAGEMENT_SYSTEM;
public class Student{
    private int id;
    private String name;
    private double gpa;
    private String city;
    private String university;

    //consturctor 
    public Student (int id,String name,double gpa,String city,String university){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
        this.city=city;
        this.university= university;
    }

    //getters and setters methods for access the private methods

    public int getId(){return id;}
    public void setId(int id){
        this.id= id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this .gpa=gpa;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this .city=city;
    }
    public String getUniversity(){
        return university;
    }
    public void setUniversity(String university){
        this .university=university;
    }

    //display students informations
    @Override
    public String toString(){
        return id +
        "\t" + name +
        "\t" + gpa +
        "\t" + city +
        "\t" + university;
    }
}