package com.safay.IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Author: wqf
 * Date: 2020/2/19
 * Time: 1:28
 */
public class DemoPrintStream {

  public static void main(String[] args) throws IOException {
    PrintStream ps = new PrintStream("D:\\print.txt");
    ps.print(false);
    ps.close();
  }
}
