package com.zechuan.learn.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ThreadLocalTest {

	private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("123", 123);
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		System.out.println(entries);
	}
}
