package Threehomework;
//父类：人员（编号、姓名、性别、手机号码）
public class person {
    private String id;
    private String name;
    private String sex;
    private String phone;

    public person(String id, String name, String sex, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "person{" +
                "教师编号：'" + id + '\'' +
                ", 姓名：'" + name + '\'' +
                ", 性别：" + sex +
                ", 手机号：'" + phone + '\'' +
                '}';
    }
}
