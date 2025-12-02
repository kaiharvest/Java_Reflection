package indradwiprabowo.reflection;

import org.junit.jupiter.api.Test;

public class SuperClassTest {

    @Test
    void testGetSuperClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass); // Person

        Class<? super Person> objectClass = personClass.getSuperclass();
        System.out.println(objectClass); // Object

        Class<? super Person> nullClass = objectClass.getSuperclass();
        System.out.println(nullClass); // null
    }

}
