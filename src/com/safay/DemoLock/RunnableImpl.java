package com.safay.DemoLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    实现卖票案例
 */

//wait()会立刻释放synchronized（obj）中的obj锁，以便其他线程可以执行obj.notify()
//  但是notify()不会立刻立刻释放sycronized（obj）中的obj锁，必须要等notify()所在线程执行完synchronized（obj）块中的所有代码才会释放这把锁.
public class RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private static int ticket = 100;
    Lock l = new ReentrantLock();
    Object obj = new Object();
    //设置线程任务:卖票
    @Override
    public void run() {
        //使用死循环,让卖票操作重复执行
        while(true){
            //先判断票是否存在
          //同步代码块
          l.lock();
            if(ticket>0){
              try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
              } catch (InterruptedException e) {
                e.printStackTrace();
              }finally {
                l.unlock();
              }
            }

        }
    }

    //同步方法
    //锁对象  this
    public synchronized void  payTick(){
      if(ticket>0){
        //提高安全问题出现的概率,让程序睡眠
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        //票存在,卖票 ticket--
        System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
        ticket--;
      }
    }

    //锁为class对象
  public static synchronized void  payTickStatic(){
    if(ticket>0){
      //提高安全问题出现的概率,让程序睡眠
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      //票存在,卖票 ticket--
      System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
      ticket--;
    }
  }
}
