package com.learning.thread;

public class SyncApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		
		Laptop laptop = new Laptop();
		Desktop desktop = new Desktop();
		
		laptop.attachePrinter(printer);
		desktop.attachePrinter(printer);
		
		laptop.start();
		desktop.start();

	}

}
class Printer{
	
   /*synchronized*/ void printDocument(String docName, int copies) {
		System.out.println("Printing document" + docName);
		for(int i = 0; i <= copies; i++) {
			System.out.println("Printer "+ docName + "  copy # "+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
class Laptop extends Thread{
	 Printer pRef;
	 void attachePrinter(Printer p) {
		 pRef = p;
	 }
	 @Override
	 public void run() {
		 synchronized(pRef){
		 pRef.printDocument(">> John's project <<", 10);
		 }
	 }
}
class Desktop extends Thread{
	 Printer pRef;
	 void attachePrinter(Printer p) {
		 pRef = p;
	 }
	 @Override
	 public void run() {
		 synchronized(pRef){
		 pRef.printDocument(">> Harry's project <<", 10);
		 }
	 }
}
