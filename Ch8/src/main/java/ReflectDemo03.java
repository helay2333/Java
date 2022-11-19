/**
 * @author Green写代码
 * @date 2022-10-24 22:18
 */

import java.lang.reflect.Field;

//class Person{
//    private String name;
//    private int age;
//
//    @Override
//    public String toString() {
//        return "姓名："+this.name+"，年龄："+this.age;
//    }
//}
//public class ReflectDemo03 {
//    public static void main(String[] args) throws Exception {
//        Class clazz=Class.forName("Person");
//        Object p=clazz.newInstance();
//        Field nameField=clazz.getDeclaredField("name");
//        nameField.setAccessible(true);
//        nameField.set(p, "周羽飞");
//        Field ageField=clazz.getDeclaredField("age");
//        ageField.setAccessible(true);
//        ageField.set(p, 20);
//        System.out.println(p);
//    }
//}