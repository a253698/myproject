package com.java2.threading;

public class HorseRunable implements Runnable {
	//可執行負責工作，又可持續執行接下來的工作。開一條新道(多執行緒)。

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("R:" + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}