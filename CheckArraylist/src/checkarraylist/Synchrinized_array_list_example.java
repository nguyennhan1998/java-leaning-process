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
public class Synchrinized_array_list_example {
    public static void main(String[] args) throws InteruptedException, InterruptedException {
        List<Integer> safeArrayList= new ArrayList<>();
        safeArrayList.add(1);
        safeArrayList.add(2);
        safeArrayList.add(3);
        //create a thread pool of size 10
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        //create a runnable task that increaments each element of the arraylist by one
        Runnable task = () ->{
            incrementArrayList(safeArrayList);
        };
        //submi the task to the excutor service 100 times 
        //all  the task will modify the array list concurrently
        for(int i=0;i<100;i++){
            executorService.submit(task);
        }
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println(safeArrayList);
    }

    private static void incrementArrayList(List<Integer> safeArrayList) {
        synchronized  (safeArrayList){
            for(int i=0;i<safeArrayList.size();i++){
                Integer value= safeArrayList.get(i);
                safeArrayList.set(i, value+1);
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
