package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Product> getProduct() {
		return jdbcTemplate.query("select * from Product", (rs, rownum)->
		{
		 Product p=new Product();
		 p.setPid(rs.getInt(1));
		 p.setPname(rs.getString(2));
		 p.setQty(rs.getInt(3));
		 p.setPrice(rs.getDouble(4));
		 p.setLdt(rs.getDate(5).toLocalDate());
		 p.setCid(rs.getInt(6));
		 return p;
		});
	}


	public Product getById(int pid) {
		return jdbcTemplate.queryForObject("select * from product where pid=?",new Object[] {pid},  (rs, rownum)->
		{
			 Product p=new Product();
			 p.setPid(rs.getInt(1));
			 p.setPname(rs.getString(2));
			 p.setQty(rs.getInt(3));
			 p.setPrice(rs.getDouble(4));
			 p.setLdt(rs.getDate(5).toLocalDate());
			 p.setCid(rs.getInt(6));
			 return p;
		});
	}


	public boolean save(Product p) {
		int n=jdbcTemplate.update("Insert into Product values(?,?,?,?,?,?)",new Object[] {
				p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getLdt(),p.getCid()
		});
		return n>0;
	}


	public boolean removeById(int pid) {
	  int n= jdbcTemplate.update("delete from Product where pid=?",new Object[] {pid});
		return n>0;
	}


	public boolean modifyById(Product p) {
		int n=jdbcTemplate.update("update Product set pname=?,qty=?,price=?,expirydate=?,cid=? where pid=?",new Object[] {
				p.getPname(),p.getQty(),p.getPrice(),p.getLdt(),p.getCid(),p.getPid()
		});
		return n>0;
	}

}
