package com.safay.DemoList;

import java.util.LinkedList;

/**
 * Author: wqf
 * Date: 2019/10/27
 * Time: 21:46
 */

/*底层为链表
* 查询慢 增删快
* ArrayList底层为数组
* 查询快 增删慢
* */
public class DemoLinkList {

  public static void main(String[] args) {
    LinkedList<String> linked = new LinkedList<>();
    linked.add("a");
    linked.add("b");
    linked.push("c");
    linked.addFirst("d");
    linked.addLast("com");

    linked.getFirst();
    linked.getLast();
    linked.pop();
    linked.removeFirst();
    linked.removeLast();
  }
}
