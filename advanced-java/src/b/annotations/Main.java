package b.annotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        CustomAnnotation c = new CustomAnnotation();
        Method method = c.getClass().getMethod("sayHello");

        MarkerAnnotation markerAnnotation = method.getAnnotation(MarkerAnnotation.class);
        System.out.println("The value of the annotation is: " + markerAnnotation.value());

    }
}
