import java.lang.reflect.*;

public class ReflectionExample39 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.lang.String");
        Method[] methods = clazz.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
            for (Parameter p : m.getParameters()) {
                System.out.println("  Param: " + p.getName());
            }
        }
    }
}
