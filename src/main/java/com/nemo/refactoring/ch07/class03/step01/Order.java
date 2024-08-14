package com.nemo.refactoring.ch07.class03.step01;

public class Order {
	private Long id;
	private Priority priority;

	public Order(Long id, String priorityString) {
		this.id = id;
		this.priority = new Priority(priorityString);
	}

	public Long getId() {
		return id;
	}

	public String getPriorityString() {
		return priority.toString();
	}

	public void setPriority(String priorityString) {
		this.priority = new Priority(priorityString);
	}
}
