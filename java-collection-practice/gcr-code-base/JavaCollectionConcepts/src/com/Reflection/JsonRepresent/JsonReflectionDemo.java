package com.Reflection.JsonRepresent;
import java.lang.reflect.Field;

import com.Reflection.dynamicobjects.Student;

public class JsonReflectionDemo {

    public static String toJson(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder("{");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\":\"");
            json.append(field.get(obj)).append("\"");
            if (i < fields.length - 1) json.append(",");
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        Student student = new Student("Bob");
        String json = toJson(student);
        System.out.println(json);
    }
}
