/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Admin
 */
public class Unsafe_array_list_Example {

    public static void main(String[] args) throws InteruptedException, InterruptedException {
        List<Integer> unsafeArrayList = new ArrayList<>();
        unsafeArrayList.add(1);
        unsafeArrayList.add(2);
        unsafeArrayList.add(3);
        //create a thread pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //create a runnable task that increments each element of the arraylist by one
        Runnable task = () -> {
            incrementArrayList(unsafeArrayList);
        };
        //submit the task to the excutor service 100 items
        //all the task will modify the array list currently
        for (int i = 0; i < 100; i++) {
            executorService.submit(task);
        }
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println(unsafeArrayList);

    }

    private static void incrementArrayList(List<Integer> unsafeArrayList) {
        for (int i = 0; i < unsafeArrayList.size(); i++) {
            Integer value = unsafeArrayList.get(i);
            unsafeArrayList.set(i, value + 1);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}
