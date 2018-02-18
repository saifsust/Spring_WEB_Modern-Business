package com.modern_business.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.modern_business.dbmodels.Category;

@Controller("homeController")
public class HomeController {

	private JdbcTemplate jdbc;

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private void setJdbc(DataSource dataSource) {
		this.jdbc = new JdbcTemplate(dataSource);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		String query = "SELECT * FROM category";
		jdbc.query(query, new RowMapper<Category>() {

			@Override
			public Category mapRow(ResultSet result, int arg1) throws SQLException {
				System.out.println(result.getString("categoryName"));
				return null;
			}

		});

		System.out.println("Hibernate");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Category cat = new Category("SAIFUL ISLAM");
		// session.save(cat);
		// session.getTransaction().commit();
		List<Category> list = session.createQuery(" from Category ").list();
		for (Category category : list) {
			System.out.println(category);
		}
		/// session.getTransaction().commit();
		session.close();
		System.out.println("Hello");
		return "user/index";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		System.out.println("Hello");
		return "user/index";
	}

}
