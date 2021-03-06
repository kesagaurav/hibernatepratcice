package com.gaurav.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.gaurav.dbutil.HibernateUtil;
import com.gaurav.model.Employee;

public class PracticeDao {

	private HibernateUtil hutil;

	public PracticeDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PracticeDao(HibernateUtil hutil) {
		super();
		this.hutil = hutil;
	}
	
	public void insert(Employee e) {
		Session ses=hutil.getSession();
		Transaction t=ses.beginTransaction();
		ses.save(e);
		t.commit();
	}
	
	
	
	public void update() {
		Session ses=hutil.getSession();
		Transaction t=ses.beginTransaction();
		String hql="update com.gaurav.model.Employee set name=:n where salarly=:sal";
		Query q=ses.createQuery(hql);
		q.setString("n","deepa");
		q.setString("sal","902000");
		int r=q.executeUpdate();
		System.out.println("\n query executed " + r);
		t.commit();
	}
	
	
	
	public void delete() {
		Session ses=hutil.getSession();
		Transaction t=ses.beginTransaction();
		Query q=ses.createQuery("delete from com.gaurav.model.Employee where name=:n");
		q.setParameter("n","smith");
		int d=q.executeUpdate();
		System.out.println("\n deleted the rows " + d);
		t.commit();
	}
	
	
	
	public List<Employee> getAllEmployees(){
		Session ses=hutil.getSession();
		Query q=ses.createQuery("from com.gaurav.model.Employee");
		List<Employee> emList=q.list();
		if(emList.size()==0) {
			System.out.println("\n plz insert some values");
		}
		else {
			emList.forEach(e->System.out.println(e));
		}
		return emList;
		
	}
	
}
