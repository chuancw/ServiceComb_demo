package com.zechuan.learn.thread.waitandnotify;

import java.util.Date;

public class WaitThread extends Thread {
	private final Object lock;

	public WaitThread(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				long startTime = System.currentTimeMillis();
				System.out.println("start to wait.." + new Date());
				lock.wait();
				System.out.println("ent to wait.." + new Date());
				long endTime = System.currentTimeMillis();
				System.out.println("the thread is start : " +(endTime - startTime) / 1000L);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
