package com.springboot.jpa.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	EntityManager em;
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void saveStud(Student s) {
		// TODO Auto-generated method stub
		Session ses=(Session)em.unwrap(Session.class);
		ses.persist(s);
		
	}

	@Override
	public void updateStud(int r, float p) {
		// TODO Auto-generated method stub
		Session ses=(Session)em.unwrap(Session.class);
		Student s=ses.get(Student.class,r);
		s.setPer(p);
		ses.merge(s);
	}

	@Override
	public void deleteStud(int r) {
		// TODO Auto-generated method stub
		Session ses=(Session)em.unwrap(Session.class);
		Student ss=ses.get(Student.class, r);
		ses.remove(ss);
		
	}

	@Override
	public List<Student> viewAll() {
		// TODO Auto-generated method stub
		Session ses=(Session)em.unwrap(Session.class);
		Query q=ses.createQuery("from student");
		return q.getResultList();
	}

}
