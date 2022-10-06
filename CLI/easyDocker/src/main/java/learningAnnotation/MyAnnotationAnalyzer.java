package learningAnnotation;

import java.lang.reflect.Method;

public class MyAnnotationAnalyzer {
    public void parse(Class<?> clazz) throws Exception {
        Method[] methods = clazz.getMethods();
        int pass = 0;
        int fail = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                try {
                    method.invoke(null);
                    pass++;
                } catch (Exception ex) {
                    fail++;
                }
            }
        }
    }
}
