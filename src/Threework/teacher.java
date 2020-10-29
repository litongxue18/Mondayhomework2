package Threework;  
public teacher(String id, String name, String sex, String phone) {
        super(id, name, sex, phone);
    }

    //老师所授课程的得到
    public course getTeach_course() {
        return teach_course;
    }

    //老师所授课程的设置
    public void setTeach_course(course teach_course) {
        this.teach_course = teach_course;
    }

    //老师工龄的得到
    public String getSeniority() {
        return seniority;
    }

    //老师工龄的设置
    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    //老师职称的得到
    public String getAcademic_title() {
        return academic_title;
    }

    //老师职称的设置
    public void setAcademic_title(String academic_title) {
        this.academic_title = academic_title;
    }
}
