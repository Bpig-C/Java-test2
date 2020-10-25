package Information;

public class Student extends People {
	private String studentName;
	private String studentId;
		
public Student(int number,String name,String sex,String id,int course)
	{	setNo(number);
		setStudentName(name);
		setSex(sex);
		setStudentId(id);
		setCourses(course);
	}

public int getNo(){
	return num;	
}
void setNo(int number) {
	this.num=number;	
}
public String getStudentName(){
	return studentName;	
}
void setStudentName(String studentName) {
	this.studentName = studentName;	
}
void setSex(String sex) {
    super.sex=sex;	
}
public String getSex(){
	return sex;	
}
public String getStudentId(){
	return studentId;	
}
void setStudentId(String studentId) {
	this.studentId = studentId;	
}

public void setCourses(int courses) {
	super.courseNumber=courses;
}
public void addCourses(int courseNumber) {
	this.courseNumber = courseNumber+1;
}
public void reduceCourses(int courseNumber) {
	this.courseNumber = courseNumber-1;
}
public int getCourses() {
	return courseNumber;
}

}

