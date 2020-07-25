package switchdemo;

public class UseLabelInLoop {
    public static void withlabel(){
        label1:
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j==3){
                    break label1;
                }
            }
            System.out.println(i);
        }
        //compile error, since label should be put right before an iteration
        //label2:
        //int c=5;
    }

    public static void withoutLabel(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j==3){
                    break;
                }
                System.out.println(j);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        System.out.println("With label");
        withlabel();
        System.out.println("Without label");
        withoutLabel();
    }
}
