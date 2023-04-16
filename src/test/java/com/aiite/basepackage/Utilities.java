package com.aiite.basepackage;

import java.time.LocalDateTime;

public class Utilities {
	
	public static void currentDateTime() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}

}
