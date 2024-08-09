package com.nemo.refactoring.ch06.class05.step03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class Reservation {

	private Queue<Customer> firstServedReservations = new LinkedList<>();
	private Queue<Customer> priorityReservations = new PriorityQueue<>();

	public void addReservation(Customer customer){
		newAddReservation(customer, false);
	}

	public void newAddReservation(Customer customer, boolean isPriority) {
		if (isPriority){
			this.priorityReservations.add(customer);
		}else{
			this.firstServedReservations.add(customer);
		}
	}

	public List<Customer> getReservations() {
		List<Customer> result = new ArrayList<>();
		Queue<Customer> temp = new LinkedList<>(firstServedReservations);
		while (!temp.isEmpty()){
			result.add(temp.poll());
		}
		return result;
	}
}
