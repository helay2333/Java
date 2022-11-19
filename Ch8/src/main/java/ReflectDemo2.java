//import java.lang.reflect.Constructor;
//
///**
// * @author Green写代码
// * @date 2022-10-24 18:43
// */
//class Student {
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student " +
//                "姓名：" + name + '，' +
//                "年龄：" + age;
//    }
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//public class ReflectDemo2 {
//    public static void main(String[] args) throws Exception {
//        Class clazz = Class.forName("Student");
//        Constructor cons[] = clazz.getConstructors();
//        Student student = (Student)cons[0].newInstance("周羽飞",20);
//        System.out.println(student);
//    }
//}
