package com.gaurav;

import com.gaurav.dao.PracticeDao;
import com.gaurav.dbutil.HibernateUtil;
import com.gaurav.model.Employee;

public class PracticeMain {

	public static void main(String[] args) {

		HibernateUtil hutil=new HibernateUtil();
		PracticeDao pDao=new PracticeDao(hutil);
		Employee e1=new Employee("gaurav","90000");
		Employee e2=new Employee("john","910000");
		Employee e3=new Employee("deepak","902000");
		Employee e4=new Employee("smith","900");
		Employee e5=new Employee("iqbal","90000");
		pDao.insert(e1);
		pDao.insert(e2);
		pDao.insert(e3);
		pDao.insert(e4);
		pDao.insert(e5);
		
		pDao.update();
		
		pDao.delete();
		
		pDao.getAllEmployees();
	}

}
