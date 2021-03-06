 ＃第二次实验课 李灵臣 计G2020322084
## 1.实验要求
1.编写实验说明中实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。  
3.编写实验报告。 
（要求有实验目的、要求、过程、流程图、核心代码、注释、系统运行截图、编程感想等，分章节罗列，不能在实验报告中粘帖大段代码）  
## 2.实验说明
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。  
从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。  
对象示例：	人员（编号、姓名、性别……）  
教师（编号、姓名、性别、所授课程、……）  
			学生（编号、姓名、性别、所选课程、……）  
			课程（编号、课程名称、上课地点、时间、授课教师、……）     
以上属性仅为示例，同学们可以自行扩展（黄色背景的文字，不能原篇出现在实验报告中，需要进一步明确所有的属性）。  

## 3.实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  

掌握面向对象的类设计方法（属性、方法）；  

掌握类的继承用法，通过构造方法实例化对象；  

学会使用super()，用于实例化子类；  

掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。  

## 4.实验过程  
(1).创建了5个类：coures、person、select_course、student、teacher。  

person为父类：设置了人员的编号、姓名、性别、手机号码。  

student为子类：学生（编号、姓名、性别、所选课程、职务） 

teacher为子类：教师（编号、姓名、性别、所授课程、工龄、职称）

couser：设置了课程（编号、课程名称、上课地点、时间、授课教师、课程学分)  

select_course:设置了课程信息、输出学生所选课程的信息、教师绑定自己的授课科目、学生的信息注册。  

（2）.通过student和teacher继承了person类里的对象和方法，继承了person中的id、name、sex和phone；   

在学生类中设置了职务（duty）的对象和选课的构造方法。在老师类中设置了工龄、职称和所授课程。  

在课程类中，设置了编号、课程名称、地址、授课老师、以及课程时间与等级。  

在主方法中，初始化课程类、学生类、老师类中的对象和方法。  
以上都运用了getset方法、tostring方法和list集合。

 
## 5.实验核心代码  
```
public String getId() {
        return id;
    }               //getset方法

    public void setId(String id) {
        this.id = id;
    }
```
``` 
//toString方法
public String toString() {
        return "person{" +
                "教师编号：'" + id + '\'' +
                ", 姓名：'" + name + '\'' +
                ", 性别：" + sex +
                ", 手机号：'" + phone + '\'' +
                '}';

```
```
//List集合
List<course> Course_and_teacher_binding() {
        //老师1号绑定课程高级数学
        teacher teacher_1 = new teacher("老师1号", "邹老师", "男", "1239....");
        course math = new course("1号课程", " 高等数学 ", "10号楼", teacher_1, "40m", "4");
        teacher_1.setTeach_course(math);
``` 
## 6.运行截图   
![alt console](http://m.qpic.cn/psc?/V50ghPAb3qpJGr4VGzMR1RNNj21NWrfC/45NBuzDIW489QBoVep5mcan*ieJiZf51cmjFaPLtmWEJtgRhyiKOSYxuHeZyhg8cMS*HLJ5IRfdtV7KX5mgR3ACtD.vGkhLwW6faS7gXVhY!/b&bo=JgPQAAAAAAADF8c!&rf=viewer_4) 
![alt console](http://m.qpic.cn/psc?/V50ghPAb3qpJGr4VGzMR1RNNj21NWrfC/45NBuzDIW489QBoVep5mcan*ieJiZf51cmjFaPLtmWHlVEN*9uJfQLSQ7pbGyUu8dc40wGd4m1R0c5Po08hgZ8TWdZT0lzhr5LFMoGvID20!/b&bo=ogRQAQAAAAADF8U!&rf=viewer_4) 


## 7.编程感想  
1.通过编程熟悉了getset方法，加深了对toString方法的使用。  
2.利用了大专时期所学的list集合。  
3.在编程过程中出现了许多问题和报错，经过同学的帮助以及csdn的查询，逐步排错改错。

