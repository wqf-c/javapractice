package com.safay.JsoupDemo;

import com.safay.druid.Demo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Author: wqf
 * Date: 2020/2/21
 * Time: 12:05
 */
public class demo01 {

  public static void main(String[] args) throws Exception {
    String path = demo01.class.getClassLoader().getResource("student.xml").getPath();
    Document document = Jsoup.parse(new File(path), "utf-8");
    Elements elements = document.getElementsByTag("name");
    Element element = elements.get(0);
    String name = element.text();
    System.out.println(name);
  }
}
