package org.sadman.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.sadman.soap.business.ProductServiceImpl;

@WebService
public class ProductCatelog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}

	@WebMethod
	public boolean addProducts(String category, String product) {
		return productService.addProducts(category, product);
	}
}
