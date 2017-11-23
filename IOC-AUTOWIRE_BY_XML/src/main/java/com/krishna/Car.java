package com.krishna;

public class Car {

	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void show() {
		System.out.println(engine.getModelyear());
	}
}
