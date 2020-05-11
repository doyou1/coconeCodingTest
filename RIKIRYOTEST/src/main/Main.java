package main;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

	
	public static void main(String[] args) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("/C:/chatUpload/chat.txt"));) {
			
			
			bw.close();
		}catch(Exception e) {
			
		}
		
		
	}	
}
