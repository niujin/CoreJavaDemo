package syntax.array;

public class ArrayInitialization {
    public static final int [] a = {100,200};
    public static final int[] b;
    static {
        b = new int[2];
        b[0] = 100;
        b[1] =200;
    }
    //Compilation error
    //public static final int[] c = new int[2]{100,200};
    public static final int[] d = new int[]{100,200};

    //non-static
    public int[] e = {100,200};
    {
        int[] f = new int[2];
        f[0] = 100;
        f[1] = 200;
    }
    public final int[] g = new int[]{100,200};
}
