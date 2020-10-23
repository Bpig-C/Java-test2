# Java-test2
# 计192 2019310191 齐睿
# Java 实验
Java课程作业项目仓库
# 阅读程序
## 实验目的
1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
2.掌握面向对象的类设计方法（属性、方法）；  
3.掌握类的继承用法，通过构造方法实例化对象；  
4.学会使用super()，用于实例化子类；  
5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。  
### 业务要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
			学生（编号、姓名、性别、所选课程、……）
			课程（编号、课程名称、上课地点、时间、授课教师、……）
## 实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。  
3.编写实验报告。  
## 实验过程
**1.首先创建两个package：Information 和 Run。  
2.在Information 包中实例化四个类：Teacher、student、course 和 people，并在Run 包中实例化一个类：Test。  
3.people类中：**  
*作为一个父类，主要为其他三个同包子类提供变量*    
**4.HardDisk类中：**  
*(a)在HardDisk类中创建两个private属性：amount和readSpeed分别表示硬盘的容量和读写速度。    
(b)并为两个属性定义两组方法（set-get）。   
(c)创建一个默认构造方法（用来显示原来看不见的默认构造方法）。  
(d)和一个新的构造方法用以调用两个属性的set方法。*    
**5.PC中：**  
*(a)PC类中调用CPU类和HardDisk类，并分别建立新的属性cpu和HD。    
(b)然后创建show（）函数来展示所获取的信息。*    
**6.最后在Test 创建主方法来为CPU和HardDisk中五个属性赋值，并调用PC类中show（）函数来输出信息。**  
## 流程图  
## 核心方法  

***1.方法（processor赋值方法，setcentre和sethertz赋值方法与此类似）***
```
public void setProcessor(String m) {
	if(m=="Intel" || m=="AMD")
		processor=m;
	    else 
	    	{System.out.println("The CPU processor was wrong!");
	    	processor="404000";
	    	}
	}
``` 
***2.方法（CPU类中两个构造方法）***  
```
public CPU(int centre) {
	setCentre(centre);	
}

public CPU(String processor,double hertz) {
	setProcessor(processor);
	setHertz(hertz);
}

``` 
***3.方法（setamount赋值方法，setreadspeed赋值方法与此类似）***
```
public void setAmount(int amount) {
	if(amount>160 && amount<1024)
        this.amount = amount;
	else {System.out.println("The HardDisk amount was wrong!");
	this.amount=404000;
	}

 }
``` 
***4.方法（HardDisk类两个构造方法）***
```
public HardDisk(int amount,int readSpeed) {
	setAmount(amount);
	setReadSpeed(readSpeed);
}
```
***5.方法(PC类中主构造方法)***
``` 
public HardDisk(){
	
}
public PC(CPU cpu,HardDisk HD) {
	setCPU(cpu);
	setHardDisk(HD);
}
```
***6.方法(Test类中运行本程序主方法)***
``` 
public class Test {

   public static void main(String args[]) {

       CPU cpu = new CPU(6);
       
       CPU recpu = new CPU("Intel",3.8);

       HardDisk HD=new HardDisk(512,240);

       PC pc =new PC(cpu,recpu,HD);

       pc.show();

    }

}
```
## 注释  
## 系统运行截图  
Picture1.CPU processor was wrong：
![CPU processor was wrong](https://i.loli.net/2020/10/08/bH6dcI1jyV2mQoU.jpg)  
Picture2.CPU hertz and HarddDsk readSpeed were wrong： 
![CPU hertz and HarddDsk readSpeed were wrong](https://i.loli.net/2020/10/08/s1z3MkDolgILCJN.jpg)  
Picture3.The right result:
![The right result](https://i.loli.net/2020/10/08/3AUnRsKVHcXBldh.jpg)  
## 实验感想  
通过本次实验，我学会并熟悉了如何创建类、方法和构造方法，用import来跨包调用类，以及基本的访问修饰符使用。实验中四个类组成的关系链让我充分熟悉类与类之间的关系，并不断调试程序和改善代码。除此以外，我还学会如何简单使用GitHub和markdown编辑实验报告。
