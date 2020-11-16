package com.zechuan.learn.thread.waitandnotify;

import java.util.Date;

public class NotifyThread extends Thread {
	private final Object lock;

	public NotifyThread(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("start to notify.." + new Date());
			lock.notify();
			System.out.println("end to notify.." + new Date());
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		}
	}
}
