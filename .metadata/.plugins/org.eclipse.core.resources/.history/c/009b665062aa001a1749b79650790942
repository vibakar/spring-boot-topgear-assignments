package com.balakumaranstores.stat.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.balakumaranstores.stat.Model.Contacts;

@Component
public class StoresDaoImpl implements StoresDao{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int saveData(Contacts contactsDao) {
		int customerId=0;
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		try {
	        Serializable ser = session.save(contactsDao);
	        if (ser != null) {
	        	customerId = (Integer) ser;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		session.getTransaction().commit();
		return customerId;
	}

	@Override
	public List<Contacts> getDataAll() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Contacts> contactDao= new ArrayList<Contacts>();
		contactDao=session.createQuery("from Contacts").list();
		return contactDao;
	}

	@Override
	public Contacts getData(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Contacts contactDao= new Contacts();
		contactDao=(Contacts) session.createQuery("from contacts where customer_id ="+id);
		return contactDao;
	}

	@Override
	public void getDeleteData(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		Contacts contactObj = session.get(Contacts.class, id);
		if(contactObj != null) {
			session.delete(contactObj);
		}
		session.getTransaction().commit();
		
	}

	@Override
	public void updateData(Contacts contacts) {
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.saveOrUpdate(contacts);
		session.getTransaction().commit();
		
	}

}
