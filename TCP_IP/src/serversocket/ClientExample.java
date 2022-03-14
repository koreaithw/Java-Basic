package serversocket;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		//서버에 연결 요청을 하기위해서 Socket 이라는 객체 생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//연결 끊기
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
