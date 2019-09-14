package com.data.structure.algo;

import java.util.ArrayList;
import java.util.List;

public class GreedyAlgoTest {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.forEach(alpha->{
			System.out.println(alpha);
			return;
		});
		
		List<TimeSlot> timeSlots = new ArrayList<TimeSlot>();
		timeSlots.add(new TimeSlot(0, 1));
		timeSlots.add(new TimeSlot(1, 2));
		timeSlots.add(new TimeSlot(2, 3));
		timeSlots.add(new TimeSlot(3, 4));
		Job job = new Job("A", timeSlots, 70);
		List<Job> jobs = new ArrayList<Job>();
		jobs.add(job);
		
		timeSlots = new ArrayList<TimeSlot>();
		timeSlots.add(new TimeSlot(0, 1));
		job = new Job("B", timeSlots, 80);
		jobs.add(job);

		timeSlots = new ArrayList<TimeSlot>();
		timeSlots.add(new TimeSlot(0, 1));
		job = new Job("C", timeSlots, 30);
		jobs.add(job);

		timeSlots = new ArrayList<TimeSlot>();
		timeSlots.add(new TimeSlot(0, 1));
		job = new Job("D", timeSlots, 100);
		jobs.add(job);
		
		JobSequencing.execute(jobs);
	}
}
