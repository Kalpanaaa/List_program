package com.aop;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerResponse extends Thread{
	String data;
	Socket d;
	String prevdata;

	public void responsetoclient(Socket s){
		this.d=s;
	}
		public void run(){
			try {
				DataInputStream	dis = new DataInputStream(d.getInputStream());
				data=dis.readUTF();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for (int j = 0; j <  Server.socket.size(); j++){ {
				   Socket wrsocket = Server.wrsockets.get(j);
				   try {
				    DataOutputStream dos = new DataOutputStream(
				      wrsocket.getOutputStream());
				    dos.writeUTF(prevdata);
				   } catch (IOException e) {
				    e.printStackTrace();
				   }
				  
				  }
   
			
			
		}
	

	//public void start() {
		
	}

}
