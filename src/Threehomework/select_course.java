package Threehomework;
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
        //假设学生编号1、4选了大学数学，2、5大学语文，3、6选了大学英语
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
        //老师1号绑定课程大学数学
        teacher teacher_1 = new teacher("老师1号", "邹老师", "男", "1239....");
        course math = new course("1号课程", "大学数学 ", "10号楼", teacher_1, "40m", "4");
        teacher_1.setTeach_course(math);
        //老师2号绑定课程大学英语
        teacher teacher_2 = new teacher("老师2号", "秦老师", "男", "1322....");
        course english = new course("2号课程", "大学英语", "09号楼", teacher_2, "40m", "2");
        teacher_2.setTeach_course(english);
        //老师3号绑定课程大学语文
        teacher teacher_3 = new teacher("老师3号", "陈老师", "男", "1367....");
        course chinese = new course("3号课程", "大学语文 ", "11号楼", teacher_3, "40m", "5");
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
        student student_1 = new student("1", "李同学", "男", "11111");
        student student_2 = new student("2", "王同学", "男", "11132");
        student student_3 = new student("3", "张同学", "女", "11441");
        student student_4 = new student("4", "岳同学", "女", "15111");
        student student_5 = new student("5", "白同学", "男", "11412");
        student student_6 = new student("6", "赵同学", "男", "11341");
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
