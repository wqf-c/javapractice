package com.safay.WaitAndNotify;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 0:00
 */
public class Baozipu extends Thread{

  private Baozi bz;

  public Baozipu(Baozi bz){
    this.bz = bz;
  }

  @Override
  public void run() {
    int count = 0;
    while (true){
      synchronized (bz){
        if(bz.flag == true){
          try {
            bz.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        if(count % 2 == 0){
          bz.pi = "薄皮";
          bz.xie = "协议";
        }else{
          bz.pi = "冰皮";
          bz.xie = "谢尔";
        }
        count ++;
        System.out.println("正在生产：" + bz.pi + bz.xie + "包子");
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        bz.flag = true;
        bz.notify();
        System.out.println("生产好了");

      }
    }

  }
}
