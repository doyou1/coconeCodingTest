package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class main123 {
	public static void main(String[] args) throws IOException {
		System.out.println("start");		
		
		ArrayList<Message> list = new ArrayList<>();
		for(int i=0;i<20;i++) {
			Message msg = new Message();
			msg.setId("id" + i);
			msg.setUsername("name" + i);
			msg.setChatdate(LocalDateTime.now());
			list.add(msg);
		}

		
		PrintWriter pw = new PrintWriter(new FileWriter("src/main/read123.txt",true));
	
		for(Message m : list) {
			pw.println(m);
		}
		pw.close();
		System.out.println("end");
	}
}
