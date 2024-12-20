package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	JdbcTemplate jdbcTemplate;

	public boolean saveProduct(Product p) {
		int n=jdbcTemplate.update("insert into product values(?,?,?,?,?,?)", new Object[]{
				p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getLdt(),p.getCid()
		});
		if(n>0) {
			return true;
		}

		return false;
	}

	public boolean deleteProduct(int pid) {
		int n= jdbcTemplate.update("delete from product where pid=?" , pid);
		if(n>0) {
			return true;
		}
		return false;
	}

	public boolean updateProduct(Product p) {
		int n=jdbcTemplate.update("update product set pname=?, qty=?, price=?, expdate=?, cid=? where pid=?", new Object[]{
			p.getPname(),p.getQty(),p.getPrice(),p.getLdt(),p.getCid(), p.getPid()
		});
		if(n>0) {
			return true;
		}

		return false;
	}

	@Override
	public Product getElementById(int pid) {
		// TODO Auto-generated method stub
		Product p = jdbcTemplate.queryForObject("select * from Product where pid = ?", new Object[] {pid}, BeanPropertyRowMapper.newInstance(Product.class));
			return p;	
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> plist = jdbcTemplate.query("select * from product", (rs,n)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			p.setLdt(rs.getDate(5).toLocalDate());
			p.setCid(rs.getInt(6));
			return p;
			
		});
		return plist;
	}

	@Override
	public List<Product> getByPrice(double price) {
		// TODO Auto-generated method stub
		List<Product> plist = jdbcTemplate.query("select * from product where price<?", new Object[] {price}, BeanPropertyRowMapper.newInstance(Product.class));
		if(plist.size()>0)
			return plist;
		else
			return null;
	
	}
	
	
	

}
