package com.java2.snowing;
//不閃，留在底部

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class SnowFrame2 extends JPanel {
	
	SnowCanvas canvas = new SnowCanvas();

	public SnowFrame2() {
	setSize(850,650);
	setLocation(500, 200);
	setVisible(true);
	add(canvas);
	canvas.repaint();
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SnowFrame2();
	}

	public class SnowCanvas extends JPanel {
		List<Snow> snows = new ArrayList<>();

		public SnowCanvas() {
			for (int i = 0; i < 100; i++) {
				Snow snow = new Snow(this);
				snows.add(snow);
				snow.start();
			}
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for(int i = 0; i<100;i++) {
				Snow snow = snows.get(i);
				g.drawString("雪", snow.x, snow.y);
			}
		}
		
	}

}