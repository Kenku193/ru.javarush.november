package Module2.Lesson18.Example3Anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TudaSuda {
    String name() default "";
    boolean isOk() default false;
    int clientType() default 0;
}
