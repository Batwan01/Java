import java.net.*; //socket, serversocket
import java.io.*; //입출력
import java.util.*;

public class TcpIpMultichatServer {
  HashMap clients; //HashMap은 내부에 '키'와 '값'을 저장하는 자료 구조

  TcpIpMultichatServer() {
    clients = new HashMap();
    
    //메서드는 MAP을 스레드로부터 안전하게 만들기 위해 래핑
    //`Collections.synchronizedMap(clients)`를 호출한 후 반환된 맵을 새 변수에 할당하지 않았습니다. 이렇게 하면 동기화된 맵의 참조가 없어져 원래의 `clients` 맵은 여전히 동기화되지 않은 상태입니다.
    //결론적으로, `Collections.synchronizedMap()` 메서드는 주어진 맵을 동기화하여 여러 스레드에서 안전하게 사용할 수 있도록 도와주지만, 복잡한 연산을 수행할 때는 추가적인 동기화 조치가 필요할 수 있습니다.
    Collections.synchronizedMap(clients); 
  }
  
  public void start() {
    ServerSocket serverSocket = null;
    Socket socket = null;

    try {
      serverSocket = new ServerSocket(7777);       //7777포트와 결합 bind
      System.out.println("서버가 시작되었습니다.");

      while(true) {
        socket = serverSocket.accept(); //클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다. 연결 요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성
        System.out.println("["+ socket.getInetAdderss() + ":" + socket.getPort() + "]" + "에서 접속하셨습니다."); //socket.getInetAdderss() < 주소 얻기, socket.getPort() < 포트 얻기
        ServerReceiver thread = new ServerReceiver(socket);
        thread.strat();
      }
    } catch(Exception e) {
      e.printstackTrace();
    }
  } //start()
  
  void sendToAll(String msg) {
    Iterator it = clients.keySet().iterator(); //keySet()은 [A, B, C]라는 Set형태로 변환, iterator() 메서드는 Set에서 원소들을 순차적으로 조회

    while(it.hasNext()) {
      try {
        DataOutputStream out = (DataOutputStream)clients.get(it.next());
      }
    }
  }

}
