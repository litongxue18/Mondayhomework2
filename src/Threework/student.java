package Threework;
//���ࣺѧ������š��������Ա���ѡ�γ̡�ְ��
public class student extends person {
    //��ѡ�γ�
    private course select_course;
    //ְ��
    private String duty;

    public student(String id, String name, String sex, String phone) {
        super(id, name, sex, phone);
    }

    //ѧ����ѡ�γ̵ĵõ�
    public course getSelect_course() {
        return select_course;
    }

    //ѧ����ѡ�γ̵�����
    public void setSelect_course(course select_course) {
        this.select_course = select_course;
    }

    //ѧ��ְ��ĵõ�
    public String getDuty() {
        return duty;
    }

    //ѧ��ְ�������
    public void setDuty(String duty) {
        this.duty = duty;
    }

}
