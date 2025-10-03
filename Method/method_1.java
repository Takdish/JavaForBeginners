package Method;

public class method_1 {
    /*
     * All methods are functions, but not all functions are methods.
     * If it’s inside a class, it’s a method.
     * If it’s outside a class, it’s just a function.
     */

    /*
     * Access modifier = public,private,protected, default;
     * return type =int,float,String,double...;
     * method name = name...;
     * paramerets =(int a, String name, double t...);
     * method name + parameret list = method signature;
     * public int sum(int a, int v) = method header;
     * static = is a modifier, but non access modifire..;
     */
    static void Welcome() {
        System.out.println("Welcome to my world");
    }

    public static void main(String[] args) {
        Welcome();
    }
}
