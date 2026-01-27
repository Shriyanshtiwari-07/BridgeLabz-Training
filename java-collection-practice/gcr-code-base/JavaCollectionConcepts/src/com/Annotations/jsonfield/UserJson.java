package com.Annotations.jsonfield;
import java.lang.reflect.Field;

public class UserJson {

    @JsonField(name = "user_name")
    public String username;

    @JsonField(name = "user_age")
    public int age;

    public UserJson(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String toJson() throws Exception {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = this.getClass().getFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jf = field.getAnnotation(JsonField.class);
                json.append("\"").append(jf.name()).append("\": ");
                Object value = field.get(this);
                if (value instanceof String) json.append("\"").append(value).append("\"");
                else json.append(value);
                json.append(", ");
            }
        }
        if (json.length() > 1) json.setLength(json.length() - 2); // remove last comma
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        UserJson user = new UserJson("Alice", 25);
        System.out.println(user.toJson());
    }
}
