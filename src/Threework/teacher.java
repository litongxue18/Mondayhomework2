package Threework;  
public teacher(String id, String name, String sex, String phone) {
        super(id, name, sex, phone);
    }

    //��ʦ���ڿγ̵ĵõ�
    public course getTeach_course() {
        return teach_course;
    }

    //��ʦ���ڿγ̵�����
    public void setTeach_course(course teach_course) {
        this.teach_course = teach_course;
    }

    //��ʦ����ĵõ�
    public String getSeniority() {
        return seniority;
    }

    //��ʦ���������
    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    //��ʦְ�Ƶĵõ�
    public String getAcademic_title() {
        return academic_title;
    }

    //��ʦְ�Ƶ�����
    public void setAcademic_title(String academic_title) {
        this.academic_title = academic_title;
    }
}
