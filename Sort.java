import java.io.*;
import java.util.*;
class Student{
    private int Id;
    private String name;
    private double cgpa;
    Student(int Id,String name,double cgpa){
        this.Id=Id;
        this.name=name;
        this.cgpa=cgpa;
    }
    public int getId(){return Id;}
    public String getName(){return name;}
    public double getCgpa(){return cgpa;}
    public void setId(int Id){this.Id=Id;}
    public void setName(String name){this.name=name;}
    public void setCgpa(double cgpa){this.cgpa=cgpa;}
}
class StudentComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(Double.compare(s2.getCgpa(),s1.getCgpa())!=0){
            return Double.compare(s2.getCgpa(),s1.getCgpa());
        }
        int sortbyName=s1.getName().compareTo(s2.getName());
        if(sortbyName!=0){
            return sortbyName;
        }
        return Integer.compare(s1.getId(),s2.getId());
        
    }
}
public class Sort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.nextLine();
            List<Student> stlist=new ArrayList<>();
            for(int i=0;i<n;i++){
                String[] line=sc.nextLine().split(" ");
                int id=Integer.parseInt(line[0]);
                String name=line[1];
                double cgpa=Double.parseDouble(line[2]);
                Student obj=new Student(id,name,cgpa);
                stlist.add(obj);
            }
            Collections.sort(stlist,new StudentComparator());
            for(Student student:stlist){
                System.out.println(student.getName());
            }
            
             }
}
