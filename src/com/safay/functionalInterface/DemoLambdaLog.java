package com.safay.functionalInterface;

/**
 * Author: wqf
 * Date: 2020/2/19
 * Time: 22:50
 */
public class DemoLambdaLog {

  public static void main(String[] args) {
    String s1 = "aa";
    String s2 = "bb";
    String s3 = "cc";

    showLog(1, () ->{
      return s1 + s2 + s3;
    });
  }

  public static void showLog(int level, MessageBuilder mb){
    if(level == 1){
      mb.builderMessage();
    }
  }
}
