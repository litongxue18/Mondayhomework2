package Threework;
import java.util.ArrayList;
import java.util.List;

public class select_course {
    public static void main(String[] args) {
        information_init init = new information_init();
        List<course> course = init.Course_and_teacher_binding();
        List<student> student = init.student_init();
        //�γ���Ϣ
        for (course i : course) {
            System.out.println(i.toString());
        }
        System.out.println("----------------ѧ��ѡ��----------------");
        //����ѧ�����1��4ѡ����ѧ��2��5ѡ��Ӣ�3��6ѡ������
        for (student i : student) {
            if (Integer.parseInt(i.getId()) % 3 == 1) {
                i.setSelect_course(course.get(0));
            } else if (Integer.parseInt(i.getId()) % 3 == 2) {
                i.setSelect_course(course.get(1));
            } else {
                i.setSelect_course(course.get(2));
            }
            //���ѧ����ѡ�γ̵���Ϣ
            System.out.println("ѧ��" + i.getName() + "��ѡ�γ̣�" + i.getSelect_course().toString());
        }
        System.out.println("----------------ѧ���˿�----------------");
        //ѧ���˿β���
        for (student i : student) {
            i.setSelect_course(null);
            System.out.println("ѧ��" + i.getName() + "��ѡ�γ̣�" + i.getSelect_course());
        }

    }
}

//��Ϣ��ʼ��
class information_init {
    //ÿλ��ʦ���Լ����ڿγ�
    List<course> Course_and_teacher_binding() {
        //1��ʦa�󶨿γ�math
        teacher teacher_1 = new teacher("1", "a", "��", "123");
        course math = new course("1", "math", "A��", teacher_1, "40m", "4");
        teacher_1.setTeach_course(math);
        //2��ʦb�󶨿γ�english
        teacher teacher_2 = new teacher("2", "b", "��", "132");
        course english = new course("2", "english", "A��", teacher_2, "40m", "2");
        teacher_2.setTeach_course(english);
        //3��ʦc�󶨿γ�chinese
        teacher teacher_3 = new teacher("3", "c", "��", "144");
        course chinese = new course("3", "chinese", "A��", teacher_3, "40m", "5");
        teacher_3.setTeach_course(chinese);
        //������ɵĿγ����
        List<course> course = new ArrayList<course>();
        course.add(math);
        course.add(english);
        course.add(chinese);
        return course;
    }

    //ÿ��ѧ��������Ϣ��ʼ����������ѧ��
    List<student> student_init() {
        //ѧ������Ϣע��
        student student_1 = new student("1", "stu1", "��", "11111");
        student student_2 = new student("2", "stu2", "��", "11132");
        student student_3 = new student("3", "stu3", "Ů", "11441");
        student student_4 = new student("4", "stu4", "Ů", "15111");
        student student_5 = new student("5", "stu5", "��", "11412");
        student student_6 = new student("6", "stu6", "��", "11341");
        //����ѧ��ʵ��
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
