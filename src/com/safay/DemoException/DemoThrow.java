package com.safay.DemoException;

/**
 * Author: wqf
 * Date: 2019/10/28
 * Time: 0:36
 */

import java.util.Objects;

/**
 * 运行期异常无需处理
 */
public class DemoThrow {

  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    print(array, 5);
  }

  public static void print(int[] array,int index){
//    if(array == null){
//      throw new NullPointerException("...");
//    }
    Objects.requireNonNull(array, "传入对象为空");
    if(index < 0 || index >= array.length){
      throw new IndexOutOfBoundsException();
    }
  }
}
