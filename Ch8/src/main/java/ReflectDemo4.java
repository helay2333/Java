import java.lang.reflect.Method;

/**
 * @author Green写代码
 * @date 2022-10-24 18:52
 */

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Class clazz=Class.forName("Person");
        Method md=clazz.getMethod("sayHello", String.class,int.class);
        String result=(String)md.invoke(clazz.newInstance(),"周羽飞",20);
        System.out.println(result);
    }
}
