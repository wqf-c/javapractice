package com.safay.WaitAndNotify;

/**
 * Author: wqf
 * Date: 2020/2/17
 * Time: 23:42
 */
public class Demo01 {

  public static void main(String[] args) {
    Object obj = new Object();
    new Thread(new Runnable() {
      @Override
      public void run() {
        while (true){
          synchronized(obj) {
            System.out.println("买包子");
            try {
              obj.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }).start();
    new Thread(new Runnable() {
      @Override
      public void run() {
        while (true){
          try {
            Thread.sleep(5000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          synchronized (obj){
            System.out.println("可以吃包子了");
            //只能随机唤醒一个线程，notifyAll可以唤醒所有线程
            obj.notify();
          }
        }
      }
    }).start();
  }
}
