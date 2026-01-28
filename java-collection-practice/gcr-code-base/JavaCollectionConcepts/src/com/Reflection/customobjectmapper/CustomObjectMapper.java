package com.Reflection.customobjectmapper;
import java.lang.reflect.Field;
import java.util.Map;
import com.Reflection.dynamicobjects.Student;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            try {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(obj, entry.getValue());
            } catch (NoSuchFieldException e) {
                // Ignore fields that do not exist
            }
        }

        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> props = Map.of("name", "Alice", "age", 22);

        Student student = toObject(Student.class, props);
        System.out.println("Student name: " + student.getName());
    }
}
