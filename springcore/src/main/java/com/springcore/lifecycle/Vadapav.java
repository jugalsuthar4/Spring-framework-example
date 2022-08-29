package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vadapav {
   private String city;

   public String getCity() {
	return city;
   }

   public void setCity(String city) {
	this.city = city;
   }

   @Override
   public String toString() {
	   return "Vadapav [city=" + city + "]";
   }
   
   @PostConstruct
   public void start() {
	   System.out.println("vadapav made");
   }
   
   @PreDestroy
   public void end() {
	   System.out.println("vadapav sold");
   }
   
   
}
