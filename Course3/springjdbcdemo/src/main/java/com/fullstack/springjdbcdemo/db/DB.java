package com.fullstack.springjdbcdemo.db;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.fullstack.springjdbcdemo.model.Dish;

public class DB {
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	public DB() {
		// TODO Auto-generated constructor stub
	}
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("[DB] Setter dendency injection of DataSource");
	}
    
	public void insertDish(Dish dish) {
		String sql = "INSERT INTO Dish VALUES(null,?,?)";
		int result = jdbcTemplate.update(sql,dish.getName(),dish.getPrice());
		System.out.println("Dish " + dish.getName() + " inserted into table");
	}
}
