package Run;

import Information.Course;
import Information.Teacher;
import Information.Student;
import java.util.Scanner;
public abstract class Test_courseChooseSystem {
	
	static Student stu0 = new Student(1,"齐睿","男","S1001",0);
	static Student stu1 = new Student(2,"博淼","男","S1002",0);
	static Student stu2 = new Student(3,"家增","男","S1003",0);
	static Student stu3 = new Student(4,"振宇","男","S1004",0);
	static Teacher tea0 = new Teacher(1,"陈爽","女","T1001","线性代数");
	static Teacher tea1 = new Teacher(2,"游煦","男","T1001","高等数学");
	static Course cou0 = new Course(1,"线性代数","教104",0);
	static Course cou1 = new Course(2,"高等数学","教201",0);
	static int courseNo;
	static int stuNo;
	public static void main(String[] args) {
		
		a:for(;;) {
			System.out.println("\n************开始选课************");
			printStudentAll();
			System.out.println("请输入学生编号：");
			Scanner reader = new Scanner(System.in);//录入语法
			int x =reader.nextInt();//获取学生编号
			stuNo=x;//记录学生编号
			judgeStu(x);//选择学生
			System.out.println("1.结束选课\n2.继续选课");
			int m =reader.nextInt();
			if(m==1){
				break a;
			   
			    }
		}
	 printAll();
		
	}
	public static void judgeStu(int No) {//选择学生 判断是否退课
		Scanner reader = new Scanner(System.in);
		printStudent(stuNo);
		System.out.println("1.选课\n2.退课");
		int y =reader.nextInt();
		if(No==1)
			judgeChoose(y);
		else if(No==2)
			judgeChoose(y);
		else if(No==3)
			judgeChoose(y);
		else if(No==4)
			judgeChoose(y);
		else if(No>4 && No<1)
			System.out.println("学生编号不存在，请输入1~4");
	}
	public static void judgeChoose(int No) {//确认退课选课，选择课程编号
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		System.out.println("请输入选择课程编号：");
		int z =reader.nextInt();
		courseNo=z;//记录课程编号
		if(No==1){//选课
			courseChoose(z);
		    addWork(stuNo,courseNo);
		    }
		else if(No==2){//退课
			courseChoose(z);
		    reduceWork(stuNo,courseNo);
		    }
		else System.out.println("输入有误，请输入1~2");
		
	}
	public static void courseChoose(int No) {//选择课程并打印老师
		Scanner reader = new Scanner(System.in);
		if(No==1) {
			printTeacher(1);
		    }
		else if(No==2) {
			printTeacher(2);
			}
		else System.out.println("没有该课程信息，请输入1~2");
		
	}
	public static void addWork(int stuNo,int courseNo) {
		if (stuNo==1 && courseNo==1) {
		cou0.addStuNo(cou0.getStuNo());
		stu0.addCourses(stu0.getCourses());
		}
		else if (stuNo==1 && courseNo==2) {
		cou1.addStuNo(cou1.getStuNo());
		stu0.addCourses(stu0.getCourses());
		}
		else if (stuNo==2 && courseNo==1) {
		cou0.addStuNo(cou0.getStuNo());
		stu1.addCourses(stu1.getCourses());
		}
		else if (stuNo==2 && courseNo==2) {
			cou1.addStuNo(cou1.getStuNo());
			stu1.addCourses(stu1.getCourses());
			}
		else if (stuNo==3 && courseNo==1) {
			cou0.addStuNo(cou0.getStuNo());
			stu2.addCourses(stu2.getCourses());
			}
		else if (stuNo==3 && courseNo==2) {
			cou1.addStuNo(cou1.getStuNo());
			stu2.addCourses(stu2.getCourses());
			}
		else if (stuNo==4 && courseNo==1) {
			cou0.addStuNo(cou0.getStuNo());
			stu3.addCourses(stu3.getCourses());
			}
		else if (stuNo==4 && courseNo==2) {
			cou1.addStuNo(cou1.getStuNo());
			stu3.addCourses(stu3.getCourses());
			}
	}
	public static void reduceWork(int stuNo,int courseNo) {
		if (stuNo==1 && courseNo==1) {
			cou0.reduceStuNo(cou0.getStuNo());
			stu0.reduceCourses(stu0.getCourses());
			}
		else if (stuNo==1 && courseNo==2) {
			cou1.reduceStuNo(cou1.getStuNo());
			stu0.reduceCourses(stu0.getCourses());
			}
		else if (stuNo==2 && courseNo==1) {
			cou0.reduceStuNo(cou0.getStuNo());
			stu1.reduceCourses(stu1.getCourses());
			}
		else if (stuNo==2 && courseNo==2) {
				cou1.reduceStuNo(cou1.getStuNo());
				stu1.reduceCourses(stu1.getCourses());
				}
		else if (stuNo==3 && courseNo==1) {
				cou0.reduceStuNo(cou0.getStuNo());
				stu2.reduceCourses(stu2.getCourses());
				}
		else if (stuNo==3 && courseNo==2) {
				cou1.reduceStuNo(cou1.getStuNo());
				stu2.reduceCourses(stu2.getCourses());
				}
		else if (stuNo==4 && courseNo==1) {
				cou0.reduceStuNo(cou0.getStuNo());
				stu3.reduceCourses(stu3.getCourses());
				}
		else if (stuNo==4 && courseNo==2) {
				cou1.reduceStuNo(cou1.getStuNo());
				stu3.reduceCourses(stu3.getCourses());
				}
		
	}
	public static void printAll() {
		System.out.println("<学生选课系统信息表>");
		printStudentAll();
		printTeacherAll();
		printCourseAll();
		System.out.println("************选课结束************\n\n\n");
	}
	public static void printTeacher(int x) {//打印单条教师信息
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   性别   工号   授课");
		if (x==1) {
			System.out.println("  "+tea0.getNo()+"      "+tea0.getTeacherName()+"    "+tea0.getSex()+"     "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		    System.out.println("\n");
		}
		else if (x==2) {
			System.out.println("  "+tea1.getNo()+"      "+tea1.getTeacherName()+"    "+tea1.getSex()+"     "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		    System.out.println("\n");
		    }
	}
    public static void printTeacherAll() {//打印所有教师信息
		System.out.println("<教师信息>");
		System.out.println("编号   姓名   性别   工号   授课");
		System.out.println("  "+tea0.getNo()+"      "+tea0.getTeacherName()+"    "+tea0.getSex()+"     "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		System.out.println("  "+tea1.getNo()+"      "+tea1.getTeacherName()+"    "+tea1.getSex()+"     "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		
	}
    public static void printStudent(int x) {
    	System.out.println("<学生信息>");
    	System.out.println("编号   姓名   性别   学号   课数");
		if (x==1)
			System.out.println("  "+stu0.getNo()+"       "+stu0.getStudentName()+"   "+stu0.getSex()+"    "+stu0.getStudentId()+"   "+stu0.getCourses());
		else if (x==2)
			System.out.println("  "+stu1.getNo()+"        "+stu1.getStudentName()+"   "+stu1.getSex()+"    "+stu1.getStudentId()+"   "+stu1.getCourses());
		else if (x==3)
			System.out.println("  "+stu2.getNo()+"       "+stu2.getStudentName()+"   "+stu2.getSex()+"    "+stu2.getStudentId()+"   "+stu2.getCourses());
		else if (x==4)
			System.out.println("  "+stu3.getNo()+"       "+stu3.getStudentName()+"   "+stu3.getSex()+"    "+stu3.getStudentId()+"   "+stu2.getCourses());
    }
    public static void printStudentAll() {
    	System.out.println("<学生信息>");
    	System.out.println("编号   姓名   性别   学号   课数");
		System.out.println("  "+stu0.getNo()+"       "+stu0.getStudentName()+"   "+stu0.getSex()+"    "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println("  "+stu1.getNo()+"       "+stu1.getStudentName()+"   "+stu1.getSex()+"    "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println("  "+stu2.getNo()+"       "+stu2.getStudentName()+"   "+stu2.getSex()+"    "+stu2.getStudentId()+"   "+stu2.getCourses());
		System.out.println("  "+stu3.getNo()+"       "+stu3.getStudentName()+"   "+stu3.getSex()+"    "+stu3.getStudentId()+"   "+stu3.getCourses());
		
    }
    public static void printCourse(int x) {
    	System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		if(x==1)
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
		if(x==2)
		System.out.println("  "+cou1.getNo()+"      "+cou1.getName()+"     "+cou1.getAdd()+"           "+cou1.getStuNo());
    }
    public static void printCourseAll() {
    	System.out.println("<课程信息>");
		System.out.println("编号   课程名称   教学地点   选课人数");
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
		System.out.println("  "+cou1.getNo()+"      "+cou1.getName()+"     "+cou1.getAdd()+"           "+cou1.getStuNo());
		
    }
}
