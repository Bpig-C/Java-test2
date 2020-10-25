package Information;

public class Course extends People{
	private int num;
	private String name;
	private String add;
public Course(int number,String name,String add,int stuNo){
	setNo(number);
	setName(name);
	setAdd(add);
	setStuNo(stuNo);
	}

public int getNo(){
	return num;	
}
void setNo(int number) {
	this.num=number;	
}
public String getName(){
	return name;	
}
void setName(String name) {
	this.name = name;
}
public String getAdd(){
		return add;	
	}
void setAdd(String add) {
		this.add = add;	
}
public int getStuNo(){
	return super.stuNo;	
}
void setStuNo(int stuNo) {
	this.stuNo = stuNo;	
}
public void addStuNo(int stuNo) {
	super.stuNo = stuNo+1;
}
public void reduceStuNo(int stuNo) {
	super.stuNo = stuNo-1;
}

}
