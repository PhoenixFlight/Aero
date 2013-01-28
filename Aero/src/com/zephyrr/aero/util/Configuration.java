package com.zephyrr.aero.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class Configuration {
	private Map<String, Object> config;
	public Configuration() {
		Yaml yaml = new Yaml();
		try {
			InputStream cfgFile = new FileInputStream(new File("config.yml"));
			config = (Map<String, Object>)(yaml.load(cfgFile));
			System.out.println(config);
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public Object getObject(String path) {
		String[] levels = path.split(".");
		Map<String, Object> current = config;
		for(int i = 0; i < levels.length; i++) {
			if(!current.containsKey(levels[i]))
				throw new Error(new InputMismatchException("No such key"));
			else {
				Object now = current.get(levels[i]);
				if(i == levels.length - 1)
					return now;
				current = (Map<String, Object>)(current.get(levels[i]));
			}
		}
		return null;
	}
	public String getString(String path) {
		return (String)getObject(path);
	}
	public int getInteger(String path) {
		return (int)getObject(path);
	}
	public boolean getBoolean(String path) {
		return (boolean)getObject(path);
	}
	public float getFloat(String path) {
		return (float)getObject(path);
	}
}
