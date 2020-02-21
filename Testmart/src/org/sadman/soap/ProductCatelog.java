package org.sadman.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.sadman.soap.business.ProductServiceImpl;
import org.sadman.soap.model.Product;

@WebService(endpointInterface="org.sadman.soap.ProductCatelogInterface", portName="TestMartPort", serviceName="TestMartCatelogService")
public class ProductCatelog implements ProductCatelogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	@Override
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}

	@Override
	public boolean addProducts(String category, String product) {
		return productService.addProducts(category, product);
	}
	
	@Override
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
	}
}
