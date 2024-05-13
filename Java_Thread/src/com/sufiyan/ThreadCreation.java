package com.sufiyan;

public class ThreadCreation {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("we are now in main thread : " + Thread.currentThread().getName());
				System.out.println("Current thread priority is : " + Thread.currentThread().getPriority());
			}
		});
		thread.start();

		thread.setName("New thread");
		// thread.setDaemon(false);
		thread.setPriority(Thread.MAX_PRIORITY);
	}
}
