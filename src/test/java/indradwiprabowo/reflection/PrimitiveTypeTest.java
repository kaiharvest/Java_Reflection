package indradwiprabowo.reflection;

import indradwiprabowo.reflection.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrimitiveTypeTest {

    @Test
    void testClass() {
        Class<Integer> integerClass = Integer.class;
        Class<Long> longClass = long.class;
        Class<Boolean> booleanClass = boolean.class;

        System.out.println(integerClass.isPrimitive());
        System.out.println(longClass.isPrimitive());
        System.out.println(booleanClass.isPrimitive());
    }

    @Test
    void testGetPrimitive() throws NoSuchFieldException {
        Class<Person> personClass = Person.class;
        Field age = personClass.getDeclaredField("age");

        System.out.println(age.getType().isPrimitive());
    }

    @Test
    void testGetFieldPrimitive() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field age = personClass.getDeclaredField("age");

        System.out.println(age.getType().isPrimitive());

        age.setAccessible(true);

        Person person = new Person("Indra", "Dwi");
        person.setEge(22);

        System.out.println(age.getInt(person));
    }

    @Test
    void testExecuteMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setEge = personClass.getDeclaredMethod("setEge", int.class);

        Person person = new Person();
        setEge.invoke(person,30);

        System.out.println(person.getEge());
    }

}
