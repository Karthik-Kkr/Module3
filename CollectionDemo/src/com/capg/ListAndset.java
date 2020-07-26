package com.capg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListAndset {
	
	public static void main(String[] args) {
		
		List<String> trainees=new ArrayList<>();
		trainees.add("Karthik");
		trainees.add("Sai priya");
		trainees.add("Karthik");
		trainees.add("Sai priya");
		
//		trainees.add(1);
//		trainees.add(true);		
//		trainees.remove(true);			If there is no generic
		
		trainees.add(1, "love");		
		for(Object trainee:trainees) {
			System.out.println(trainee);
		}
		
		Set<Integer> trainees1=new TreeSet<>();
//		trainees1.add("Karthik");
//		trainees1.add("Sai priya");
//		trainees1.add("Karthik");
//		trainees1.add("Sai priya");
		trainees1.add(1);
		trainees1.add(1);
//		trainees1.add(true);
		
		trainees1.forEach(System.out::println);
		
		
		List<Trainee> student=Arrays.asList(
				new Trainee("Karthik","21",345678987654L),
				new Trainee("Sai Priya","20",2345678998765L),
				new Trainee("Karthik","21",345678987654L),
				new Trainee("Sai Priya","20",2345678998765L)
				);
		
		Collections.sort(student, (t1,t2)->t1.age.compareTo(t2.age));
		student.forEach(t->System.out.println(t));
		System.out.println();
		System.out.println();
		Set<Trainee> set=new HashSet<Trainee>(student);
		set.forEach(t1->System.out.println(t1));
		
	}
}

class SortByAge implements Comparator<Trainee>{

	@Override
	public int compare(Trainee t1, Trainee t2) {
		return t1.name.compareTo(t2.name);
	}	
}

class SortByPhone implements Comparator<Trainee>{

	@Override
	public int compare(Trainee t1, Trainee t2) {

		return (int) (t1.phoneNo-t2.phoneNo);
	}
	
}
