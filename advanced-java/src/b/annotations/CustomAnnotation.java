package b.annotations;

public class CustomAnnotation {

    @MarkerAnnotation(value = 10)
    String sayHello() {
        return "My custom annotation";
    }

}
