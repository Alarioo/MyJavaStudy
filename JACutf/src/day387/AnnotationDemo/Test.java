package day387.AnnotationDemo;
/*
    自定义注解必须配上注解的信息处理流程(使用反射)才有意义。
     自定义注解通过都会指明两个元注解：Retention、Target
 */
/**
 * @author alario
 * @create 2021
 */
public class Test {
    @MyAnnotation()
    public static void main(String[] args) {
        test();
    }
    @MyAnnotation({"c","d"})
    public static void test(){

    }
}
