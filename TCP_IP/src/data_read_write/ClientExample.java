package data_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
			
			byte[] bytes = null;
			String message = null;
			
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";
			
			bytes = message.getBytes("UTF-8");
			
//			outputstream을 통해서 데이터를 전달
			os.write(bytes);
//			내보냄
			os.flush();
			System.out.println("[데이터 보내기 성공]");
			
//			Server쪽에서 보낸 message를 받야하므로
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
//			읽은 바이트 배열의 값을 매개값으로 준다
			int readByteCount = is.read(bytes);
//			bytes배열을 문자열로 변환하기위해서
//			String 메서드를 이용해서 bytes배열을 주고 index 0부터 readByteCount(읽은 문자 수만큼),UTF-8형식으로)
			message = new String(bytes, 0 ,readByteCount, "UTF-8");
//			문자열 출력
			System.out.println("[데이터 받기 성공]:"+message);
			
			is.close();
			os.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//연결 끊기
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {}
		}
	}
}
