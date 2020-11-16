package com.zechuan.learn.thread;

import java.util.Date;

public class MyRunnable implements Runnable {
	private String command;


	public MyRunnable(String s) {
		this.command = s;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : start time " + new Date());
		printCommand();
		System.out.println(Thread.currentThread().getName() + " : end time " + new Date());
	}

	private void printCommand() {
		System.out.println(command);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
