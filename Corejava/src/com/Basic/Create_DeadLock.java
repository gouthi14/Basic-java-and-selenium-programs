package com.Basic;

public class Create_DeadLock {
	

	String str1="goutham";
	String str2="harish";
	
	Thread td1=new Thread("my thread1");
	public void run(){
		while(true){
			synchronized(str1){
				synchronized(str2){
					System.out.println(str1+str2);
				}
			}
		}
	};
	
	Thread td2=new Thread("My Thread2"){
		public void run(){
			while(true){
				synchronized(str2){
					synchronized(str1){
						System.out.println(str2+str1);
					}
				}
			}
			
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Create_DeadLock md=new Create_DeadLock();
		
		md.td1.start();
		md.td2.start();
	}

}
