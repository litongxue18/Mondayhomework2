package Threework;
//课程（编号、课程名称、上课地点、时间、授课教师、课程学分）
public class course<teacher> {
    private String id;
    private String course_name;
    private String course_address;
    private teacher course_teacher;
    private String course_time;
    private String course_grade;

    public course(String id, String course_name, String course_address, teacher course_teacher, String course_time, String course_grade) {
        this.id = id;
        this.course_name = course_name;
        this.course_address = course_address;
        this.course_teacher = course_teacher;
        this.course_time = course_time;
        this.course_grade = course_grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_address() {
        return course_address;
    }

    public void setCourse_address(String course_address) {
        this.course_address = course_address;
    }

    public teacher getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(teacher course_teacher) {
        this.course_teacher = course_teacher;
    }

    public String getCourse_time() {
        return course_time;
    }

    public void setCourse_time(String course_time) {
        this.course_time = course_time;
    }

    public String getCourse_grade() {
        return course_grade;
    }

    public void setCourse_grade(String course_grade) {
        this.course_grade = course_grade;
    }

    @Override
    public String toString() {
        return "course{" +
                "id='" + id + '\'' +
                ", course_name='" + course_name + '\'' +
                ", course_address='" + course_address + '\'' +
                ", course_teacher=" + course_teacher +
                ", course_time='" + course_time + '\'' +
                ", course_grade='" + course_grade + '\'' +
                '}';
    }
}
