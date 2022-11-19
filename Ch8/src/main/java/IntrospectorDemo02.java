import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Green写代码
 * @date 2022-10-24 22:58
 */
public class IntrospectorDemo02{
    public static void main(String[] args) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Person person=new Person();
        PropertyDescriptor pd=new PropertyDescriptor("name",person.getClass());
        Method m_name=pd.getWriteMethod();
        m_name.invoke(person,"周羽飞");
        pd=new PropertyDescriptor("age",person.getClass());
        Method m_age=pd.getWriteMethod();
        Class clazz=pd.getPropertyType();
        if(clazz.equals(int.class)) {
            m_age.invoke(person, 20);
        }else {
            m_age.invoke(person, "19");
        }
        System.out.println(person);
    }
}
