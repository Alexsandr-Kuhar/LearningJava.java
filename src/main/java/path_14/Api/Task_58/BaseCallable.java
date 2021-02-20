package main.java.path_14.Api.Task_58;

import main.java.test.potoki.pool.ProductList;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class BaseCallable implements Callable<String> {
    @Override
    public  String call() throws  Exception {
        String product = ProductList.getProduct();
        String result = null;
//        if (product != null) {
//            result = product + " done";
//        } else {
//            result = "product is empty";
//        }
        TimeUnit.MICROSECONDS.sleep(100);
        System.out.println(result);
        return result;
    }
}
