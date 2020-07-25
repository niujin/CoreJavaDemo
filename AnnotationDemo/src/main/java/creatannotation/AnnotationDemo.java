package creatannotation;

public class AnnotationDemo {
    @CompileTimeAnnotation(value = "aa")
    public static void foo(){
        System.out.println("foo1");
    }

    public static void main(String[] args){
        foo();
    }
}
