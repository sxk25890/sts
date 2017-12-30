package com.mtc.app.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mtc.app.entity.OrderDetails;

@Controller
public class OrderDetailsController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping("/orderdetails")
	public ModelAndView allProducts() {
		
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("from OrderDetails");
		
		List<OrderDetails> order = query.list();
		
		ModelAndView modelAndView = new ModelAndView("orderDetailsView");
		
		modelAndView.addObject("orderdetails", order);
		
		return modelAndView;
	}

}
