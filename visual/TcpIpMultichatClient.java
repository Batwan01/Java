import java.util.*;
import java.io.*;
import java.net.*;

public class TcpIpMultichatClient {
  public static void main(String args[]) {
    if(args.length!=1) {
      System.out.println("USAGE: java TcpIpMultichatClient 대화명");
      System.exit(0);
    }

    try {
      String serverIp = "127.0.0.1";

      Socket socket = new Socket(serverIp, 7777); //소켓을 생성하여 연결을 요청한다.
      System.out.println("서버에 연결되었습니다.");
      Thread sender = new Thread(new ClientSender(socket, args[0])); //주석 달기1
      Thread receiver = new Thread(new ClientReciver(socket));
    
      sender.start(); //run() 실행
      receiver.start();
    } catch(ConnectException ce) {
      ce.printStackTrace();
    } catch(Exception e) {}
  } //main

  static class ClientSender extends Thread {
    Socket socket;
    DataOutputStream out;
    String name;

    ClientSender(Socket socket, String name) {
      this.socket = socket;
      try {
        out = new DataOutputStream(socket.getOutputStream()); //socket에 연결된 기본 출력 스트림(OutputStream)을 반환, 스트림에 쓸 수 있게 해주는 메서드들을 추가로 제공, 소켓을 통해 전송 
        this.name = name;
      } catch(Exception e) {}
    }

    public void run() {
      Scanner scanner = new Scanner(System.in);
      try {
        if(out!=null) {
          out.writeUTF(name);
        }
        
        while(out!=null)
          out.writeUTF("[" + name + "]" + scanner.nextLine()); //메세지 보내기
      } catch(IOException e) {}
    } //run()
  } //clientsender

  static class ClientReciver extends Thread {
    Socket socket;
    DataInputStream in;

    ClientReciver(Socket socket) {
      this.socket = socket;
      try {
        in = new DataInputStream(socket.getInputStream());
      } catch (IOException e) {}
    }

    public void run() {
      while(in!=null) {
        try {
            System.out.printlm(in.readUTF());
        } catch(IOException e) {}
      }
    } //run
  } //clientreceiver
} //class
