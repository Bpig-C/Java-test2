package Run;

import Information.Course;
import Information.Teacher;
import Information.Student;
import java.util.Scanner;
public abstract class Test_courseChooseSystem {
	
	static Student stu0 = new Student(1,"���","��","S1001",0);
	static Student stu1 = new Student(2,"���","��","S1002",0);
	static Student stu2 = new Student(3,"����","��","S1003",0);
	static Student stu3 = new Student(4,"����","��","S1004",0);
	static Teacher tea0 = new Teacher(1,"��ˬ","Ů","T1001","���Դ���");
	static Teacher tea1 = new Teacher(2,"����","��","T1001","�ߵ���ѧ");
	static Course cou0 = new Course(1,"���Դ���","��104",0);
	static Course cou1 = new Course(2,"�ߵ���ѧ","��201",0);
	static int courseNo;
	static int stuNo;
	public static void main(String[] args) {
		
		a:for(;;) {
			System.out.println("\n************��ʼѡ��************");
			printStudentAll();
			System.out.println("������ѧ����ţ�");
			Scanner reader = new Scanner(System.in);//¼���﷨
			int x =reader.nextInt();//��ȡѧ�����
			stuNo=x;//��¼ѧ�����
			judgeStu(x);//ѡ��ѧ��
			System.out.println("1.����ѡ��\n2.����ѡ��");
			int m =reader.nextInt();
			if(m==1){
				break a;
			   
			    }
		}
	 printAll();
		
	}
	public static void judgeStu(int No) {//ѡ��ѧ�� �ж��Ƿ��˿�
		Scanner reader = new Scanner(System.in);
		printStudent(stuNo);
		System.out.println("1.ѡ��\n2.�˿�");
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
			System.out.println("ѧ����Ų����ڣ�������1~4");
	}
	public static void judgeChoose(int No) {//ȷ���˿�ѡ�Σ�ѡ��γ̱��
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		System.out.println("������ѡ��γ̱�ţ�");
		int z =reader.nextInt();
		courseNo=z;//��¼�γ̱��
		if(No==1){//ѡ��
			courseChoose(z);
		    addWork(stuNo,courseNo);
		    }
		else if(No==2){//�˿�
			courseChoose(z);
		    reduceWork(stuNo,courseNo);
		    }
		else System.out.println("��������������1~2");
		
	}
	public static void courseChoose(int No) {//ѡ��γ̲���ӡ��ʦ
		Scanner reader = new Scanner(System.in);
		if(No==1) {
			printTeacher(1);
		    }
		else if(No==2) {
			printTeacher(2);
			}
		else System.out.println("û�иÿγ���Ϣ��������1~2");
		
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
		System.out.println("<ѧ��ѡ��ϵͳ��Ϣ��>");
		printStudentAll();
		printTeacherAll();
		printCourseAll();
		System.out.println("************ѡ�ν���************\n\n\n");
	}
	public static void printTeacher(int x) {//��ӡ������ʦ��Ϣ
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����   �Ա�   ����   �ڿ�");
		if (x==1) {
			System.out.println("  "+tea0.getNo()+"      "+tea0.getTeacherName()+"    "+tea0.getSex()+"     "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		    System.out.println("\n");
		}
		else if (x==2) {
			System.out.println("  "+tea1.getNo()+"      "+tea1.getTeacherName()+"    "+tea1.getSex()+"     "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		    System.out.println("\n");
		    }
	}
    public static void printTeacherAll() {//��ӡ���н�ʦ��Ϣ
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����   �Ա�   ����   �ڿ�");
		System.out.println("  "+tea0.getNo()+"      "+tea0.getTeacherName()+"    "+tea0.getSex()+"     "+tea0.getTeacherId()+" "+tea0.getTeaCourse());
		System.out.println("  "+tea1.getNo()+"      "+tea1.getTeacherName()+"    "+tea1.getSex()+"     "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		
	}
    public static void printStudent(int x) {
    	System.out.println("<ѧ����Ϣ>");
    	System.out.println("���   ����   �Ա�   ѧ��   ����");
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
    	System.out.println("<ѧ����Ϣ>");
    	System.out.println("���   ����   �Ա�   ѧ��   ����");
		System.out.println("  "+stu0.getNo()+"       "+stu0.getStudentName()+"   "+stu0.getSex()+"    "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println("  "+stu1.getNo()+"       "+stu1.getStudentName()+"   "+stu1.getSex()+"    "+stu1.getStudentId()+"   "+stu1.getCourses());
		System.out.println("  "+stu2.getNo()+"       "+stu2.getStudentName()+"   "+stu2.getSex()+"    "+stu2.getStudentId()+"   "+stu2.getCourses());
		System.out.println("  "+stu3.getNo()+"       "+stu3.getStudentName()+"   "+stu3.getSex()+"    "+stu3.getStudentId()+"   "+stu3.getCourses());
		
    }
    public static void printCourse(int x) {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
		if(x==1)
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
		if(x==2)
		System.out.println("  "+cou1.getNo()+"      "+cou1.getName()+"     "+cou1.getAdd()+"           "+cou1.getStuNo());
    }
    public static void printCourseAll() {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
		System.out.println("  "+cou1.getNo()+"      "+cou1.getName()+"     "+cou1.getAdd()+"           "+cou1.getStuNo());
		
    }
}
