package indradwiprabowo.reflection;

import org.junit.jupiter.api.Test;

public class SuperClassTest {

    @Test
    void testGetSuperClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass); // Person

        Class<? super Person> superclass = personClass.getSuperclass();
        System.out.println(superclass); // Object

        Class<? super Person> superclasTop = superclass.getSuperclass();
        System.out.println(superclasTop); // null
    }

}
