package com.capg.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg.spring")
@PropertySource("app.properties")
public class MobileConfigurations {
	
//	@Bean(name="vodafone")
//	public VodafoneSim getVodafoneSim() {
//		VodafoneSim vf=new VodafoneSim();
//		vf.setCallCharges(1.75f);
//		vf.setInternetSpeed(6.8f);
//		Map<String,Long> contacts=new HashMap<>();
//		contacts.put("Rahul", 5824573246L);
//		contacts.put("Karthik",9177367703L);
//		vf.setContacts(contacts);
//		return vf;
//	}
//	@Bean(name="mobile")
//	public Mobile getMobile() {
//		Mobile m=new Mobile();
//		m.setSim(getVodafoneSim());
//		return m;
//	}
}
