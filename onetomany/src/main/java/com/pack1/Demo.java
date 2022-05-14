package com.pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pack1.UserDetails;
import com.pack1.Vehicle;

public class Demo {

	public static void main(String[] args) {
	
UserDetails user=new UserDetails();

Vehicle vehicle=new Vehicle();
//Vehicle vehicle2=new Vehicle();

vehicle.setVehicleName("BMW Car");
vehicle.setUser(user);

user.setUserName("Zafar Khna");

Configuration cfg=new Configuration();
cfg.configure();
cfg.addAnnotatedClass(UserDetails.class);
cfg.addAnnotatedClass(Vehicle.class);

SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();

s.save(vehicle);
//s.save(vehicle2);
s.save(user);
Transaction t= s.beginTransaction();

t.commit();
System.out.println("Save");
s.close();
sf.close();
	}

}
