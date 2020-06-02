package com.safay.Socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author: wqf
 * Date: 2020/2/19
 * Time: 1:36
 */
public class TcpServer {
  public static void main(String[] args) {
    try {
      ServerSocket server = new ServerSocket(8888);
      Socket socket = server.accept();
      InputStream is = socket.getInputStream();
      byte[] bytes = new byte[1024];
      int len = is.read(bytes);
      System.out.print(new String(bytes));
      OutputStream os = socket.getOutputStream();
      os.write("收到".getBytes());
      socket.close();
      server.close();
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
