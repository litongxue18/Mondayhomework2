package Threework;
import java.util.ArrayList;
import java.util.List;

public class select_course {
    public static void main(String[] args) {
        information_init init = new information_init();
        List<course> course = init.Course_and_teacher_binding();
        List<student> student = init.student_init();
        //课程信息
        for (course i : course) {
            System.out.println(i.toString());
        }
        System.out.println("----------------学生选课----------------");
        //假设学生编号1、4选了数学，2、5选了英语，3、6选了语文
        for (student i : student) {
            if (Integer.parseInt(i.getId()) % 3 == 1) {
                i.setSelect_course(course.get(0));
            } else if (Integer.parseInt(i.getId()) % 3 == 2) {
                i.setSelect_course(course.get(1));
            } else {
                i.setSelect_course(course.get(2));
            }
            //输出学生所选课程的信息
            System.out.println("学生" + i.getName() + "所选课程：" + i.getSelect_course().toString());
        }
        System.out.println("----------------学生退课----------------");
        //学生退课操作
        for (student i : student) {
            i.setSelect_course(null);
            System.out.println("学生" + i.getName() + "所选课程：" + i.getSelect_course());
        }

    }
}

//信息初始化
class information_init {
    //每位老师绑定自己所授课程
    List<course> Course_and_teacher_binding() {
        //1老师a绑定课程math
        teacher teacher_1 = new teacher("1", "a", "男", "123");
        course math = new course("1", "math", "A点", teacher_1, "40m", "4");
        teacher_1.setTeach_course(math);
        //2老师b绑定课程english
        teacher teacher_2 = new teacher("2", "b", "男", "132");
        course english = new course("2", "english", "A点", teacher_2, "40m", "2");
        teacher_2.setTeach_course(english);
        //3老师c绑定课程chinese
        teacher teacher_3 = new teacher("3", "c", "男", "144");
        course chinese = new course("3", "chinese", "A点", teacher_3, "40m", "5");
        teacher_3.setTeach_course(chinese);
        //将绑定完成的课程输出
        List<course> course = new ArrayList<course>();
        course.add(math);
        course.add(english);
        course.add(chinese);
        return course;
    }

    //每个学生进行信息初始化，并返回学生
    List<student> student_init() {
        //学生的信息注册
        student student_1 = new student("1", "stu1", "男", "11111");
        student student_2 = new student("2", "stu2", "男", "11132");
        student student_3 = new student("3", "stu3", "女", "11441");
        student student_4 = new student("4", "stu4", "女", "15111");
        student student_5 = new student("5", "stu5", "男", "11412");
        student student_6 = new student("6", "stu6", "男", "11341");
        //返回学生实列
        List<student> student = new ArrayList<student>();
        student.add(student_1);
        student.add(student_2);
        student.add(student_3);
        student.add(student_4);
        student.add(student_5);
        student.add(student_6);
        return student;
    }
}
