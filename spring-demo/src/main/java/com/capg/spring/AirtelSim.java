package com.capg.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("airtel")
public class AirtelSim implements Sim{
	
	@Value("${airtel.callCharges}")
	private float callCharges;
	@Value("${airtel.internetSpeed}")
	private float internetSpeed;
	@Value("#{${airtel.contacts}}")
	private List<String> contacts;
	
	public AirtelSim() {
		System.out.println("Airtel Bean Created using default constructor");
	}
	
	public AirtelSim(float callCharges, float internetSpeed) {
		super();
		System.out.println("Airtel Bean Created and values injected through parameterized constructor");
		System.out.println("");
		this.callCharges = callCharges;
		this.internetSpeed = internetSpeed;
	}

	public float getCallCharges() {
		return callCharges;
	}
	
	public void setCallCharges(float callCharges) {
		System.out.println("Call charges set through Setter");
		this.callCharges = callCharges;
	}
	
	public float getInternetSpeed() {
		return internetSpeed;
	}
	
	public void setInternetSpeed(float internetSpeed) {
		System.out.println("Internet Speed set through Setter");
		this.internetSpeed = internetSpeed;
	}
	
	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	public void call() {
		System.out.println("Calling from Airtel....charges- "+callCharges+"/min");
	}
	
	public void browse() {
		System.out.println("Browsing from Airtel.....speed- "+internetSpeed+"/min");
	}
	
	public void printAllContacts() {
		contacts.forEach(System.out::println);
	}
}