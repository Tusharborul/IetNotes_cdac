package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.ProductService;

public class TestJdbc {
  public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
	Scanner sc=new Scanner(System.in);
	ProductService pservice=(ProductService)ctx.getBean("productServiceImpl");
	int choice=0;
	do {
		System.out.println("1. add new product\n 2. delete product\n 3. modify product\n");
		System.out.println("4. display by id\n 5. display all\n 6. display by price\n7.exit\nchoice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean a=pservice.addNewProduct();
			if (a) {
				System.out.println("product inserted sucessfully");
			}else {
				System.out.println("product not inserted");
			}
			break;
		case 2:
			 a=pservice.delectProduct();
			if (a) {
				System.out.println("product deleted sucessfully");
			}else {
				System.out.println("product not deleted");
			}
			
			break;
		case 3:
			 a=pservice.modifyProduct();
				if (a) {
					System.out.println("product update sucessfully");
				}else {
					System.out.println("product not updated");
				}
	
			break;
		case 4:
			 Product p=pservice.findById();
				if (p!=null) {
					System.out.println(p);
				}else {
					System.out.println("product not found");
				}
			
			break;
		case 5:
			List<Product> plst = pservice.getall();
			if(plst!=null) {
				plst.forEach(System.out::println);
			}else {
				System.out.println("product not found");
			}
			break;
		case 6:
			plst = pservice.getAllByPrice();
			if(plst!=null) {
				plst.forEach(System.out::println);
			}else {
				System.out.println("product not found");
			}
			break;
		case 7:
			System.out.println("Thank you for visiting");
			sc.close();
			break;
		default:
			System.out.println("invalid choice");
			break;
		}
			
	}while(choice!=7);
}
}
