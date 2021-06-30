package day387.AnnotationDemo;

/**
 * @author alario
 * @create 2021
 */
public @interface MyAnnotation {
    String[] value() default {"a","b"} ;
}
