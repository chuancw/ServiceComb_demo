package com.zechuan.learn.thread.volatilet;

public class VolatileTest {
	private static boolean initResult = true;

	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {
			System.out.println("start to thread1");
			// 其他线程的修改不会影响当前线程读取的线程工作内存的值，JMM
			// 线程将主内存的值拷贝到工作内存中
			while (initResult) {
			}
			System.out.println("end to thread1");
		}).start();

		Thread.sleep(2000);

		//new Thread(VolatileTest::reverseResult).start();
		initResult = false;
	}

	private static void reverseResult() {
		System.out.println("start to thread2");
		initResult = false;
		System.out.println("end to thread2");
	}
}
