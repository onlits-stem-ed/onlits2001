package local.onlits.onlits2001.reflection;
import java.lang.reflect.*;
public class jvm {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if(args.length <= 0) {
            System.out.println("Usage: java jvm <class_name>");
            return;
        }
        Class<?> myClass = Class.forName(args[0]);
        Method myMethod = myClass.getMethod("main");
        myMethod.invoke(null);
    }
}
