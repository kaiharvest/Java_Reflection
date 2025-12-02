package indradwiprabowo.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {

    @Test
    void testCreate() {
        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }

    @Test
    void testGetField() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Indra", "Dwi");
        Object result = firstName.get(person1);
        System.out.println(result);

        Person person2 = new Person("Joko", "Nugroho");
        String result2 = (String) firstName.get(person2);
        System.out.println(result2);
    }

    @Test
    void testChanges() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person = new Person("Budi", "Eko");

        person.setFirstName("Maling");
        System.out.println(person.getFirstName()); // output: Maling

        Person person2 = new Person("Indra", "Dwi");
        firstName.set(person2, "Tono");
        System.out.println(person2.getFirstName()); // output: Tono
    }

}
