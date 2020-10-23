package Run;

import Information.Course;
import Information.Teacher;
import Information.Student;
import java.util.Scanner;
public abstract class Test_courseChooseSystem {
	
	static Student stu0 = new Student(1,"Lily","女","S1001",0);
	static Teacher tea1 = new Teacher(1,"Sua","T1001","线性代数");
	static Course cou0 = new Course(1,"线性代数","教104",0);
	static int courseNo;
	static int stuNo;
	public static void main(String[] args) {
		
		for(;;) {
			printStudentAll();
			Scanner reader = new Scanner(System.in);//录入语法
			int x =reader.nextInt();//获取学生编号
			stuNo=x;//记录学生编号
			judgeStu(x);//选择学生
			printAll();
		}
	
		
	}
	public static void judgeStu(int No) {//选择学生 判断是否退课
		Scanner reader = new Scanner(System.in);
		System.out.println("1.选课\n2.退课");
		int y =reader.nextInt();
		if(No==1)
			judgeChoose(y);
		if(No==2)
			judgeChoose(y);
		if(No==3)
			judgeChoose(y);
		if(No==4)
			judgeChoose(y);
		else System.out.println("没有该同学信息，请输入1~4");
	}
	public static void judgeChoose(int No) {//确认退课选课，选择课程编号
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		int z =reader.nextInt();
		courseNo=z;//记录课程编号
		if(No==1){//选课
			courseChoose(z);
		    addWork(stuNo,courseNo);
		    }
		if(No==2){//退课
			courseChoose(z);
		    reduceWork(stuNo,courseNo);
		    }
		else System.out.println("输入有误，请输入1~2");
	}
	public static void courseChoose(int No) {//选择课程并打印老师
		Scanner reader = new Scanner(System.in);
		if(No==1) {
			printTeacher(1);
		    int m =reader.nextInt();
		    
		}
		if(No==2) {
			printTeacher(2);
			int n =reader.nextInt();
			addWork(stuNo,courseNo);
		}
		else System.out.println("没有该课程信息，请输入1~2");
		
	}
	public static void informationSure(int No) {
		System.out.println("1.确认\n2.返回");
		if(No==1) {
			
		}
		else if(No==2) {};
	}
	/*public void printTeacher(int No) {
		if(No==1)
			;
		if(No==2)
			;
	}*/
	public static void addWork(int stuNo,int courseNo) {
		if (stuNo==1 && courseNo==1) {
		cou0.addStuNo(cou0.getStuNo());
		stu0.addCourses(stu0.getCourses());
		}
	}
	public static void reduceWork(int stuNo,int courseNo) {
		if (stuNo==1 && courseNo==1) {
		cou0.reduceStuNo(cou0.getStuNo());
		stu0.reduceCourses(stu0.getCourses());
		}
	}
	public static void printAll() {
		System.out.println("<学生选课系统>");
		System.out.println("<学生信息>");
		System.out.println("编号   姓名   学号   课数");
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   学号   授课");
		System.out.println("选课人数"+cou0.getStuNo()+"选课数"+stu0.getCourses());
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
	}
	public static void printTeacher(int x) {//打印单条教师信息
		
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   学号   授课");
		if (x==1){
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		}
	}
    public static void printTeacherAll() {//打印所有教师信息
		
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   学号   授课");
		System.out.println("选课人数"+cou0.getStuNo()+"选课数"+stu0.getCourses());
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		
	}
    public static void printStudent(int x) {
    	System.out.println("<学生信息>");
		System.out.println("编号   姓名   学号   课数");
		if (x==1)
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		//System.out.println("Name:"+stu1.getStudentName()+"ID:"+stu1.getStudentId());
    }
    public static void printStudentAll() {
    	System.out.println("<学生信息>");
		System.out.println("编号   姓名   学号   课数");
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		//System.out.println("Name:"+stu1.getStudentName()+"ID:"+stu1.getStudentId());
		System.out.println("请输入学生编号：");
    }
    public static void printCourse(int x) {
    	System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		if(x==1)
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
    }
    public static void printCourseAll() {
    	System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
		System.out.println("请输入选择课程编号：");
    }
}
// People peo0= new People();每次定义为一个人，再分学生老师

//Students stu1 = new Students("S1002","Bob");


/*for(;;) {
System.out.println("<学生选课系统>");
System.out.println("<学生信息>");
System.out.println("编号   姓名   学号   课数");
System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
//System.out.println("Name:"+stu1.getStudentName()+"ID:"+stu1.getStudentId());
Scanner reader = new Scanner(System.in);
System.out.println("请输入学生编号：");
int x =reader.nextInt();
if(x==1) {//1号学生
	System.out.println("选课：请输入1");
	System.out.println("退课：请输入2");
	int y =reader.nextInt();
    
if(y==1){//1为选课
	System.out.println("<课程信息>");
	System.out.println("编号   课程名称   教学地点   选课人数");
	System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
	System.out.println("请输入选择课程编号：");
	int z =reader.nextInt();
	if(z==1) {
		cou0.addStuNo(cou0.getStuNo());
		stu0.addCourses(stu0.getCourses());
		System.out.println("选课人数"+cou0.getStuNo()+"选课数"+stu0.getCourses());
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   学号   授课");
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
				}
	else {
		System.out.println("无此课程信息，请重新选择！");
	}
}
else if(y==2) {//2为退课
	System.out.println("<课程信息>");
	System.out.println("编号   课程名称   教学地点   选课人数");
	System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
	System.out.println("请输入选择课程编号：");
	int z =reader.nextInt();
	if(z==1) {
		cou0.reduceStuNo(cou0.getStuNo());
		stu0.reduceCourses(stu0.getCourses());
		System.out.println("选课人数"+cou0.getStuNo()+"选课数"+stu0.getCourses());
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   学号   授课");
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
				}
	else {
		System.out.println("无此课程信息，请重新选择！");
	}
}
else System.out.println("输入有误，请输入1~2");
}
else System.out.println("没有相关学生信息");
}*/