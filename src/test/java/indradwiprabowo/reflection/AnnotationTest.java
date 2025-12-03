package indradwiprabowo.reflection;

import indradwiprabowo.reflection.data.Person;
import indradwiprabowo.reflection.validation.Validator;
import org.junit.jupiter.api.Test;


public class AnnotationTest {

    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {
        Person person = new Person("Indra", " ");

        Validator.validateNotBlank(person);
    }

}
