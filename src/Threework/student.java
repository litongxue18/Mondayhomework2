package Threework;
//子类：学生（编号、姓名、性别、所选课程、职务）
public class student extends person {
    //所选课程
    private course select_course;
    //职务
    private String duty;

    public student(String id, String name, String sex, String phone) {
        super(id, name, sex, phone);
    }

    //学生所选课程的得到
    public course getSelect_course() {
        return select_course;
    }

    //学生所选课程的设置
    public void setSelect_course(course select_course) {
        this.select_course = select_course;
    }

    //学生职务的得到
    public String getDuty() {
        return duty;
    }

    //学生职务的设置
    public void setDuty(String duty) {
        this.duty = duty;
    }

}
