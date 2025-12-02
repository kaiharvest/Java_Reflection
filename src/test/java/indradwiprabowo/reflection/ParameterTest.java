package indradwiprabowo.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {

    @Test
    void testGetParameter() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());

            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Parameters Name: " + parameter.getName());
                System.out.println("Parameters Type: " + parameter.getType());
            }

            System.out.println("===========================");
        }
    }

    @Test
    void testMethodWithParameter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

        Person person = new Person("Indra", "Dwi");

        setFirstName.invoke(person, "Joko");

        System.out.println(person.getFirstName());
    }
}
