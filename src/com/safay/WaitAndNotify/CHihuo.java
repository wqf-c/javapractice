package com.safay.WaitAndNotify;

/**
 * Author: wqf
 * Date: 2020/2/18
 * Time: 0:22
 */
public class CHihuo extends Thread{

  Baozi bz;
  public CHihuo(Baozi bz){
    this.bz = bz;
  }

  @Override
  public void run() {
    while (true){
      synchronized (bz){
        if(bz.flag == false){
          try {
            bz.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
        System.out.println("次" + bz.xie + bz.pi + "包子");
        bz.flag = false;
        bz.notify();
        System.out.println("------");
      }
    }
  }
}
