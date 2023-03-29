package b.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//when the annotation will be applied (example ElementType.METHOD for methods)
@Target({ElementType.METHOD, ElementType.TYPE})//where the annotation will be applied (in this case, a class)
public @interface MarkerAnnotation {

    int value();
}
