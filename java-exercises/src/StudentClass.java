
/*Te krijohen 3 objekte ne klasen student, perkatesisht st1, st2,st3, 
 * ti jepen te dhenat ketyre objekteve
 * keto te dhena te ruhen ne tabelen object studentJava*/
import java.util.ArrayList;
public class StudentClass {
	private String studentname;
    private int rollno;
    private int studentage;
    
    public StudentClass(int rollno, String studentname, int studentage) {
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
	    public static void main(String[] args) {
	   
			StudentClass s1 = new StudentClass( 4,"eriseld",44);
			StudentClass s2 = new StudentClass( 4,"miri",44);
			StudentClass s3 = new StudentClass( 4,"beni",44);
			
			ArrayList<String> studentList = new ArrayList<String>();
			studentList.add("rollNo: "+s1.rollno +" name: "+ s1.getStudentname() +" age: "+ s1.studentage);
			studentList.add("rollNo: "+s2.rollno+ " name: "+s2.getStudentname() +" age: "+ s2.studentage);
			studentList.add("rollNo: "+s3.rollno+" name: "+ s3.getStudentname() + " age: "+s3.studentage);
			System.out.print(studentList);
			

	}}


