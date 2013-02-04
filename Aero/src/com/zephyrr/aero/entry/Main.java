package com.zephyrr.aero.entry;

import com.zephyrr.aero.gui.Window;
import com.zephyrr.aero.util.Configuration;

public class Main {
	private Window mainWindow;
	private Configuration config;
	public Main() {
		config = new Configuration();
		mainWindow = new Window(this, 800,600);
		mainWindow.setVisible(true);
	}
	public boolean loop() {
		mainWindow.update();
		return true;
	}
	public static void main(String[] args) {
		Main m = new Main();
		while(true)
			m.loop();
	}
}
