package com.Annotations.roleallowed;
import java.lang.reflect.Method;

public class AccessControl {

    private String currentUserRole;

    public AccessControl(String role) {
        this.currentUserRole = role;
    }

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed");
    }

    public void execute(String methodName) throws Exception {
        Method method = this.getClass().getMethod(methodName);
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed ra = method.getAnnotation(RoleAllowed.class);
            if (!ra.value().equals(currentUserRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }
        method.invoke(this);
    }

    public static void main(String[] args) throws Exception {
        AccessControl admin = new AccessControl("ADMIN");
        admin.execute("adminTask"); // Allowed

        AccessControl user = new AccessControl("USER");
        user.execute("adminTask"); // Access Denied!
    }
}
