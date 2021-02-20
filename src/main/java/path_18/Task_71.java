package main.java.path_18;

import main.java.path_18.Api.HelloWorld;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task_71 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HelloWorld myHelloWorld = new HelloWorld();
        Method method = HelloWorld.class.getDeclaredMethod("printHelloWorld");
        method.setAccessible(true);
        method.invoke(myHelloWorld);
    }
}
