package data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			// server 객체를 생성해줌
			serverSocket = new ServerSocket();
			//현재 컴퓨터의 5001 번과 binding
			serverSocket.bind(new InetSocketAddress("localhost",5001));
			//서버는 항상 클라이언트의 접속 요청을 기다려야한다.
			while(true) {
				System.out.println("[연결 기다림]");
				//클라이언트의 연결요청을 수락한다. but, 클라이언트가 연결요청을 하기 전까지는 대기상태이다.
				//따라서 요청이들어오면 socket이라는 통신용 객체를 생성하고 리턴한다.
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]"+isa.getHostName());
				
				// 데이터를 받고 보내는 코드
				//받은 데이터를 배열에 저장
				byte[] bytes =new byte[100];
				//문자열로 변환해서 저장
				String message = null;
				//inputStream을 열어서 클라이언트가 보낸 메세지를 받는다.
				InputStream is = socket.getInputStream();
				// read()메소드는 클라이언트가 데이터를 보내기 전까지는 대기상태
				//클라이언트가 데이터를 보내면 bytes배열에 저장
				//실제로 읽은 byte수는 readByteCount에 저장
				int readByteCount = is.read(bytes);
				//문자열로 변환
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공]"+message);
				
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
//				.getByues(사용되는 문자셋) 영어 한국어 등등,..
				bytes = message.getBytes("UTF-8");
//				OutputStream을 통해서 bytes배열을 출력함
				os.write(bytes);
//				데이터 내보냄
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//서버를 종료해주기 위해서
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
