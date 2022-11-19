/**
 * @author Green写代码
 * @date 2022-10-24 23:01
 */
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IntrospectorDemo03 {
    public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
        Person person=new Person();
        person.setAge(20);
        person.setName("周羽飞");
        PropertyDescriptor pd=new PropertyDescriptor("name",person.getClass());
        Method m_name=pd.getReadMethod();
        Object o=m_name.invoke(person);
        System.out.println("姓名："+o);
        pd=new PropertyDescriptor("age",person.getClass());
        Method m_age=pd.getReadMethod();
        o=m_age.invoke(person);
        System.out.println("年龄:"+ o);
    }
}

