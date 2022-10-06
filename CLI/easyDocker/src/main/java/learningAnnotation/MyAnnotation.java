package learningAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // example only for class
@Retention(RetentionPolicy.RUNTIME) // this is for jvm annotation help
//@Target({ElementType.TYPE, ElementType.LOCAL_VARIABLE}) // exmaple for many annotation
public @interface MyAnnotation {
    String info() default "Info";
}
