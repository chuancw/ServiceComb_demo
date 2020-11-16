package com.zechuan.learn.thread.waitandnotify;

public class Test {
	public static void main(String[] args) {
		Object lock = new Object();
		WaitThread waitThread = new WaitThread(lock);
		waitThread.start();
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
	}
}
