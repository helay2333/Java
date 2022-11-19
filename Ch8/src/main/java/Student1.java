/**
 * @author Green写代码
 * @date 2022-10-24 18:34
 */
public class Student1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student " +
                "姓名：" + name + '，' +
                "年龄：" + age;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        int count = 8;
        count = count >> 1;
        System.out.println(count);
    }
}


