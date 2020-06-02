package com.safay.Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Author: wqf
 * Date: 2020/2/19
 * Time: 1:33
 */
public class TcpClient {

  public static void main(String[] args) {
    try {
      Socket socket = new Socket("127.0.0.1", 8888);
      OutputStream os = socket.getOutputStream();
      os.write("hello".getBytes());
      os.close();
    }catch (IOException e){
      e.printStackTrace();
    }

  }
}
