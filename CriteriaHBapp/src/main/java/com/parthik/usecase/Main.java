package com.parthik.usecase;



import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.parthik.beans.EmpDTO;
import com.parthik.beans.Employee;
import com.parthik.util.SessionUtil;

public class Main {

	
	public static void main(String[] args) {
		
		Session ses = SessionUtil.getSession();
		
		
//		Using Criteria
		//fetch all the bulk data from database using criteria
		
		
		
		
		//fetch all the details from db then mention emplyee.class	
		
//		CriteriaBuilder builder = ses.getCriteriaBuilder();
//		
//		CriteriaQuery<Employee> crQuery= builder.createQuery(Employee.class);
//		//fetch all the details from db then mention emplyee.class
//		
//		Root<Employee> root = crQuery.from(Employee.class);
//		
//		crQuery.select(root);
//		
//		Query q= ses.createQuery(crQuery);
//		
//		q.list().forEach(emp->{
//			
//			System.out.println(emp);
//		});
		
//		===========================================================
		
		//fetch Integer like salry from database
	
//		CriteriaBuilder builder = ses.getCriteriaBuilder();
//		
//		CriteriaQuery<Integer> crQuery= builder.createQuery(Integer.class);
//		//fetch all the Integer data then mention Integer.class
//		
//		Root<Employee> root = crQuery.from(Employee.class);
//		
//		crQuery.select(root.get("salary"));
//		
//		Query<Integer> q= ses.createQuery(crQuery);
//		
//		q.list().forEach(sal->{
//			
//			System.out.println(sal);
//		});
		
//	===============================================================
		//fetch all name from database
		
//		CriteriaBuilder builder = ses.getCriteriaBuilder();
//		
//		CriteriaQuery<String> crQuery= builder.createQuery(String.class);
//		//fetch all the Integer data then mention Integer.class
//		
//		Root<Employee> root = crQuery.from(Employee.class);
//		
//		crQuery.select(root.get("name"));
//		
//		Query<String> q= ses.createQuery(crQuery);
//		
//		q.list().forEach(name->{
//			
//			System.out.println(name);
//		});
		
		
//		=========================================================
//		fetch multiple column from database
		
//		CriteriaBuilder builder = ses.getCriteriaBuilder();
//		
//		CriteriaQuery<Object[]> crQuery= builder.createQuery(Object[].class);
//		//fetch all the Integer data then mention Integer.class
//		
//		Root<Employee> root = crQuery.from(Employee.class);
//		
//		crQuery.multiselect(root.get("name"),root.get("salary"));
//		
//		Query<Object[]> q= ses.createQuery(crQuery);
//		
//		q.list().forEach(or->{
//			
//			System.out.println(or[0]+"====="+or[1]);
//		});
		
//		============================================================
//		using create seperate class we have to do that
//		using this method we have to must declare parameterized constructor
		
//		CriteriaBuilder builder = ses.getCriteriaBuilder();
//		
//		CriteriaQuery<EmpDTO> crQuery= builder.createQuery(EmpDTO.class);
//		//fetch all the Integer data then mention Integer.class
//		
//		Root<Employee> root = crQuery.from(Employee.class);
//		
//		crQuery.multiselect(root.get("name"),root.get("salary"));
//		
//		Query<EmpDTO> q= ses.createQuery(crQuery);
//		
//		q.list().forEach(emp->{
//			
//			System.out.println(emp);
//		});
//		===========================================================
//		Applyiing where clause...
		
//		CriteriaBuilder builder = ses.getCriteriaBuilder();
//		
//		CriteriaQuery<EmpDTO> crQuery= builder.createQuery(EmpDTO.class);
//		//fetch all the Integer data then mention Integer.class
//		
//		Root<Employee> root = crQuery.from(Employee.class);
//		
//		Predicate p = builder.gt(root.get("salary"), 15000);
//		//equals
//		//gt
//		//ge
//		//lt
//		//le
//		//like
//		//between
//		crQuery.where(p);
//		
//		
//		
//		crQuery.multiselect(root.get("name"),root.get("salary"));
//		Query<EmpDTO> q= ses.createQuery(crQuery);
//		q.list().forEach(emp->{
//			
//			System.out.println(emp);
//		});
//		====================================
//		If we using primary key to find that means we have to get only one result
//		
//		CriteriaBuilder builder = ses.getCriteriaBuilder();
//		
//		CriteriaQuery<EmpDTO> crQuery= builder.createQuery(EmpDTO.class);
//		//fetch all the Integer data then mention Integer.class
//		
//		Root<Employee> root = crQuery.from(Employee.class);
//		
//		Predicate p = builder.equal(root.get("empId"), 2);
//	
//		crQuery.where(p);
//		
//		
//		
//		crQuery.multiselect(root.get("name"),root.get("salary"));
//		Query<EmpDTO> q= ses.createQuery(crQuery);
////		else we use
////		TypedQuery<EmpDTO> emp = ses.createQuery(crQuery);
//		EmpDTO emp = q.getSingleResult();
//		System.out.println(emp);
		
		
//		===================================================
//		Update the details
		
		CriteriaBuilder builder = ses.getCriteriaBuilder();
		
		CriteriaUpdate<Employee> crUpdate = builder.createCriteriaUpdate(Employee.class);
		
		Root<Employee> root = crUpdate.from(Employee.class);
		
		crUpdate.set(root.get("salary"), 90000);
		
		Predicate p = builder.lt(root.get("salary"), 45000);
		
		crUpdate.where(p);
		Query q = ses.createQuery(crUpdate);
		
		ses.getTransaction().begin();
		
		int x = q.executeUpdate();
		
		ses.getTransaction().commit();
		
		System.out.println(x+"Updated........");
		
//		=============================================
		
		//store value
//		Employee emp = new Employee();
//		emp.setName("Jaimini"); 
//		emp.setAddress("Talod");
//		emp.setSalary(45000);
//		
//		ses.getTransaction().begin();
//		
//		ses.save(emp);
//
//		ses.getTransaction().commit();
//		
//		System.out.println("done");
	}
	
}
