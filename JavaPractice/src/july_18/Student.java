package july_18;

//Compartator usage
import java.util.Comparator;

public class Student  {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
	this.studentname = studentname;
    }
    public int getRollno() {
	return rollno;
    }
    public void setRollno(int rollno) {
	this.rollno = rollno;
    }
    public int getStudentage() {
	return studentage;
    }
    public void setStudentage(int studentage) {
 	this.studentage = studentage;
    }
    
    public static Comparator<Student> stName = new Comparator<Student>(){
    	
    	public int compare(Student s1, Student s2){
    		String stuName1 = s1.getStudentname().toUpperCase();
    		String stuName2 = s2.getStudentname().toUpperCase();
    		
    		//ascending order
    		return stuName1.compareTo(stuName2);
    	}
    };
    
public static Comparator<Student> stRollno = new Comparator<Student>(){
    	
    	public int compare(Student s1, Student s2){
    		int stuRollno1 = s1.getRollno();
    		int stuRollno2 = s2.getRollno();
    		
    		//ascending order
    		return stuRollno1 - stuRollno2;
    	}
    };
    
    
    public String toString(){
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
}
