package Run;

import Information.Course;
import Information.Teacher;
import Information.Student;
import java.util.Scanner;
public abstract class Test_courseChooseSystem {
	
	static Student stu0 = new Student(1,"Lily","Ů","S1001",0);
	static Teacher tea1 = new Teacher(1,"Sua","T1001","���Դ���");
	static Course cou0 = new Course(1,"���Դ���","��104",0);
	static int courseNo;
	static int stuNo;
	public static void main(String[] args) {
		
		for(;;) {
			printStudentAll();
			Scanner reader = new Scanner(System.in);//¼���﷨
			int x =reader.nextInt();//��ȡѧ�����
			stuNo=x;//��¼ѧ�����
			judgeStu(x);//ѡ��ѧ��
			printAll();
		}
	
		
	}
	public static void judgeStu(int No) {//ѡ��ѧ�� �ж��Ƿ��˿�
		Scanner reader = new Scanner(System.in);
		System.out.println("1.ѡ��\n2.�˿�");
		int y =reader.nextInt();
		if(No==1)
			judgeChoose(y);
		if(No==2)
			judgeChoose(y);
		if(No==3)
			judgeChoose(y);
		if(No==4)
			judgeChoose(y);
		else System.out.println("û�и�ͬѧ��Ϣ��������1~4");
	}
	public static void judgeChoose(int No) {//ȷ���˿�ѡ�Σ�ѡ��γ̱��
		Scanner reader = new Scanner(System.in);
		printCourseAll();
		int z =reader.nextInt();
		courseNo=z;//��¼�γ̱��
		if(No==1){//ѡ��
			courseChoose(z);
		    addWork(stuNo,courseNo);
		    }
		if(No==2){//�˿�
			courseChoose(z);
		    reduceWork(stuNo,courseNo);
		    }
		else System.out.println("��������������1~2");
	}
	public static void courseChoose(int No) {//ѡ��γ̲���ӡ��ʦ
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
		else System.out.println("û�иÿγ���Ϣ��������1~2");
		
	}
	public static void informationSure(int No) {
		System.out.println("1.ȷ��\n2.����");
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
		System.out.println("<ѧ��ѡ��ϵͳ>");
		System.out.println("<ѧ����Ϣ>");
		System.out.println("���   ����   ѧ��   ����");
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����   ѧ��   �ڿ�");
		System.out.println("ѡ������"+cou0.getStuNo()+"ѡ����"+stu0.getCourses());
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		System.out.println("<�γ���Ϣ>");
		System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
	}
	public static void printTeacher(int x) {//��ӡ������ʦ��Ϣ
		
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����   ѧ��   �ڿ�");
		if (x==1){
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		}
	}
    public static void printTeacherAll() {//��ӡ���н�ʦ��Ϣ
		
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����   ѧ��   �ڿ�");
		System.out.println("ѡ������"+cou0.getStuNo()+"ѡ����"+stu0.getCourses());
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
		
	}
    public static void printStudent(int x) {
    	System.out.println("<ѧ����Ϣ>");
		System.out.println("���   ����   ѧ��   ����");
		if (x==1)
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		//System.out.println("Name:"+stu1.getStudentName()+"ID:"+stu1.getStudentId());
    }
    public static void printStudentAll() {
    	System.out.println("<ѧ����Ϣ>");
		System.out.println("���   ����   ѧ��   ����");
		System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
		//System.out.println("Name:"+stu1.getStudentName()+"ID:"+stu1.getStudentId());
		System.out.println("������ѧ����ţ�");
    }
    public static void printCourse(int x) {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
		if(x==1)
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
    }
    public static void printCourseAll() {
    	System.out.println("<�γ���Ϣ>");
		System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
		System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
		System.out.println("������ѡ��γ̱�ţ�");
    }
}
// People peo0= new People();ÿ�ζ���Ϊһ���ˣ��ٷ�ѧ����ʦ

//Students stu1 = new Students("S1002","Bob");


/*for(;;) {
System.out.println("<ѧ��ѡ��ϵͳ>");
System.out.println("<ѧ����Ϣ>");
System.out.println("���   ����   ѧ��   ����");
System.out.println("  "+stu0.getNo()+"  "+stu0.getStudentName()+" "+stu0.getStudentId()+"   "+stu0.getCourses());
//System.out.println("Name:"+stu1.getStudentName()+"ID:"+stu1.getStudentId());
Scanner reader = new Scanner(System.in);
System.out.println("������ѧ����ţ�");
int x =reader.nextInt();
if(x==1) {//1��ѧ��
	System.out.println("ѡ�Σ�������1");
	System.out.println("�˿Σ�������2");
	int y =reader.nextInt();
    
if(y==1){//1Ϊѡ��
	System.out.println("<�γ���Ϣ>");
	System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
	System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
	System.out.println("������ѡ��γ̱�ţ�");
	int z =reader.nextInt();
	if(z==1) {
		cou0.addStuNo(cou0.getStuNo());
		stu0.addCourses(stu0.getCourses());
		System.out.println("ѡ������"+cou0.getStuNo()+"ѡ����"+stu0.getCourses());
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����   ѧ��   �ڿ�");
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
				}
	else {
		System.out.println("�޴˿γ���Ϣ��������ѡ��");
	}
}
else if(y==2) {//2Ϊ�˿�
	System.out.println("<�γ���Ϣ>");
	System.out.println("���   �γ�����   ��ѧ�ص�   ѡ������");
	System.out.println("  "+cou0.getNo()+"      "+cou0.getName()+"     "+cou0.getAdd()+"           "+cou0.getStuNo());
	System.out.println("������ѡ��γ̱�ţ�");
	int z =reader.nextInt();
	if(z==1) {
		cou0.reduceStuNo(cou0.getStuNo());
		stu0.reduceCourses(stu0.getCourses());
		System.out.println("ѡ������"+cou0.getStuNo()+"ѡ����"+stu0.getCourses());
		System.out.println("<��ʦ��Ϣ>");
		System.out.println("���   ����   ѧ��   �ڿ�");
		System.out.println("  "+tea1.getNo()+"  "+tea1.getTeacherName()+" "+tea1.getTeacherId()+" "+tea1.getTeaCourse());
				}
	else {
		System.out.println("�޴˿γ���Ϣ��������ѡ��");
	}
}
else System.out.println("��������������1~2");
}
else System.out.println("û�����ѧ����Ϣ");
}*/