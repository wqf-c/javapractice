package com.safay.ThreadAndLambda;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 0:31
 */
public class DemoThreadPool {

  public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(2);
    es.submit(new RunnableImp1());
    es.submit(new RunnableImp1());
    //线程池会一直开启，使用完线程，会归还线程
    es.submit(new RunnableImp1());
    es.shutdown();//不建议使用
  }
}
