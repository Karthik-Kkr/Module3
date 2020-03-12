package com.capg.spring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vodafone")
public class VodafoneSim implements Sim{
	
	@Value("${vodafone.callCharges}")
	private float callCharges;
	@Value("${vodafone.internetSpeed}")
	private float internetSpeed;
	@Value("#{${vodafone.contacts}}")
	private Map<String,Long> contacts;
	
	public VodafoneSim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VodafoneSim(float callCharges, float internetSpeed) {
		super();
		this.callCharges = callCharges;
		this.internetSpeed = internetSpeed;
	}

	public float getCallCharges() {
		return callCharges;
	}
	
	public void setCallCharges(float callCharges) {
		this.callCharges = callCharges;
	}
	
	public float getInternetSpeed() {
		return internetSpeed;
	}
	
	public void setInternetSpeed(float internetSpeed) {
		this.internetSpeed = internetSpeed;
	}
	
	public Map<String, Long> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, Long> contacts) {
		this.contacts = contacts;
	}

	public void call() {
		System.out.println("Calling from vodafone....charges- "+callCharges+"/min");
	}
	
	public void browse() {
		System.out.println("Browsing from vodafone.....speed- "+internetSpeed+"/min");
	}
	
	public void printAllContacts() {
		contacts.forEach((name,number)->System.out.println(name+"-"+number));
	}
}
