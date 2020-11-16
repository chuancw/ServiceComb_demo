package com.zechuan.learn.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子操作测试
 */
public class AtomicTest {

	private static volatile int result = 0;

	private static synchronized void increase() {
		result++;
	}

	private static AtomicInteger ai = new AtomicInteger(0);

	private static void increaseAi() {
		ai.getAndIncrement();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				for (int j = 0; j < 10000; j++) {
					increase();
				}
			}).start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(result);



		for (int i = 0; i < 10; i++) {
			new Thread(() -> {
				for (int j = 0; j < 10000; j++) {
					increaseAi();
				}
			}).start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(ai);
	}
}
