import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author Green写代码
 * @date 2022-10-24 22:38
 */
class Person{
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
    public String sayHello(String name, int age) {
        return "大家好,我是" + name + ", 今年" + age + "岁!";
    }
}
public class IntrospectorDemo1 {

    public static void main(String[] args) throws IntrospectionException {
        Person beanObj=new Person();
        BeanInfo bInfoObject= Introspector.getBeanInfo(beanObj.getClass(), beanObj.getClass().getSuperclass());
        String str="内省成员属性：\n";
        String str2="内省成员方法：\n";
        PropertyDescriptor[] mPropertyArray=bInfoObject.getPropertyDescriptors();
        for(int i=0;i<mPropertyArray.length;i++) {
            String propertyName=mPropertyArray[i].getName();
            Class propertyType=mPropertyArray[i].getPropertyType();
            str+=propertyName+"("+propertyType+")\n";
            Method writeMethod=mPropertyArray[i].getWriteMethod();
            Method readMethod=mPropertyArray[i].getReadMethod();
            AnnotatedType[] annotatedTypes=writeMethod.getAnnotatedParameterTypes();
            str2 += writeMethod.getName()+"(";
            for(AnnotatedType a:annotatedTypes) {
                str2 += a.getType()+" ";
            }
            Parameter[] para=writeMethod.getParameters();
            for(Parameter pa:para) {
                str2 += pa.getName()+")\n";
            }
            str2 += readMethod.getName()+"()\n";
            String stringMethod = mPropertyArray[i].getDisplayName();
            str2 += stringMethod+"\n";
        }
        System.out.println(str);
        System.out.println(str2);
    }

}
