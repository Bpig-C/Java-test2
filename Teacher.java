package Information;

public class Teacher extends People {
	private String teacherName;
	private String teacherId;
public Teacher(int number,String name,String sex,String id,String course){
	setNo(number);
	setTeacherName(name);
	setSex(sex);
	setTeacherId(id);
	setTeaCourse(course);
}
public String toString() {
	return num+teacherName+sex+teacherId+course;
}
public int getNo(){
	return num;	
}
void setNo(int number) {
	this.num=number;	
}
public String getTeacherName(){
	return teacherName;	
}
void setTeacherName(String teacherName) {
	this.teacherName = teacherName;	
}
void setSex(String sex) {
    super.sex=sex;	
}
public String getSex(){
	return sex;	
}
public String getTeacherId(){
	return teacherId;	
}
void setTeacherId(String teacherId) {
	this.teacherId = teacherId;	
}
public void setTeaCourse(String course) {
	super.course=course;
	}
public String getTeaCourse() {
	return super.course;
	}

}
