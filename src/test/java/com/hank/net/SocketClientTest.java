package com.hank.net;

import java.io.*;
import java.net.Socket;

public class SocketClientTest {
    public static void main(String[] args) {
//        String serverName = args[0];
//        int port = Integer.parseInt(args[1]);
        String serverName = "localhost";
        int port = Integer.parseInt("6066");

        System.out.println("连接到主机："+serverName+"，端口号："+port);
        try {
            //new Socket
            Socket client = new Socket(serverName,port);
            System.out.println("远程主机地址："+client.getRemoteSocketAddress());
            //OutputStream
            OutputStream outToServer = client.getOutputStream();
            //DataOutStream
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from"+client.getLocalAddress());

            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println(in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
