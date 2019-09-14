package com.data.structure.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JobSequencing {

	public static void execute(List<Job> jobs) {
		int profit = 0;
		Map<TimeSlot, Job> schedule = new HashMap<TimeSlot, Job>();
		Collections.sort(jobs);
		jobs.forEach(job->{
			allotTimeSlot(schedule, job);
		});
		Set<TimeSlot> keys = schedule.keySet(); 
		for (TimeSlot timeSlot : keys) {
			profit+=schedule.get(timeSlot).getProfit();
			System.out.println("Executed Job::"+schedule.get(timeSlot)+" in "+timeSlot);
		}
		System.out.println("Profit::"+profit);
	}

	private static void allotTimeSlot(Map<TimeSlot, Job> schedule, Job job) {
		for (TimeSlot timeSlot : job.getTimeSlots()) {
			if(schedule.get(timeSlot) == null) {
				schedule.put(timeSlot, job);
				return;
			}
		}
	}
}

class Job implements Comparable<Job>{
	private String name;
	private List<TimeSlot> timeSlots;
	private Integer profit;
	public Job(String name, List<TimeSlot> timeSlots, Integer profite) {
		super();
		this.name = name;
		if(timeSlots == null) {
			this.timeSlots = new ArrayList<TimeSlot>();
		}else {
			this.timeSlots = timeSlots;
		}
		this.profit = profite;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TimeSlot> getTimeSlots() {
		return timeSlots;
	}
	public void addTimeSlots(TimeSlot timeSlot) {
		this.timeSlots.add(timeSlot);
	}
	public Integer getProfit() {
		return profit;
	}
	public void setProfit(Integer profit) {
		this.profit = profit;
	}
	@Override
	public String toString() {
		return "Job [name=" + name + ", timeSlots=" + timeSlots + ", profit=" + profit + "]";
	}
	@Override
	public int compareTo(Job job) {
		return job.profit.compareTo(this.profit);
	}
}

class TimeSlot implements Comparable<TimeSlot>{
	private int lowerTimeBound;
	private int upperTimeBound;
	public TimeSlot(int lowerTimeBound, int upperTimeBound) {
		super();
		this.lowerTimeBound = lowerTimeBound;
		this.upperTimeBound = upperTimeBound;
		if((this.upperTimeBound-this.lowerTimeBound) != 1)
			throw new RuntimeException("upperTimeBound-lowerTimeBound value should be equal to 1");
	}
	public int getLowerTimeBound() {
		return lowerTimeBound;
	}
	public void setLowerTimeBound(int lowerTimeBound) {
		this.lowerTimeBound = lowerTimeBound;
	}
	public int getUpperTimeBound() {
		return upperTimeBound;
	}
	public void setUpperTimeBound(int upperTimeBound) {
		this.upperTimeBound = upperTimeBound;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lowerTimeBound;
		result = prime * result + upperTimeBound;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeSlot other = (TimeSlot) obj;
		if (lowerTimeBound != other.lowerTimeBound)
			return false;
		if (upperTimeBound != other.upperTimeBound)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TimeSlot [lowerTimeBound=" + lowerTimeBound + ", upperTimeBound=" + upperTimeBound + "]";
	}
	@Override
	public int compareTo(TimeSlot timeSlot) {
		return ((Integer)this.hashCode()).compareTo(timeSlot.hashCode());
	}
}