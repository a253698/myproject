package com.java2.threading;

public class Horse extends Thread {
	//因為無法重複繼承，繼承可選擇性複寫，利用implement runable達成多執行緒

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {

			System.out.println(getName() + ":" + i);
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
