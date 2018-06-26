package com.java2.snowing;

import javax.swing.JFrame;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class SnowFrame extends JFrame {
	SnowCanvas canvas = new SnowCanvas();

	public SnowFrame() {
		setSize(850, 650);
		setLocation(500, 200);
		setVisible(true);
		add(canvas);
		// canvas.repaint();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//關掉就結束
	}

	public class SnowCanvas extends Canvas {
		List<Snow> snows = new ArrayList<>();

		public SnowCanvas() {
			for (int i = 0; i < 100; i++) {
				Snow snow = new Snow(this);
				snows.add(snow);
				snow.start();
			}
		}

		@Override
		public void paint(Graphics g) {
			// g.drawString("雪", snow.300, snow.300);
			// 定位
			for (int i = 0; i < 100; i++) {
				Snow snow = snows.get(i);
				g.drawString("*", snow.x, snow.y);

			}
		}
	}

	public static void main(String[] args) {
		new SnowFrame();
	}
}