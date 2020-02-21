package org.sadman.soap.business;

import java.util.ArrayList;
import java.util.List;

import org.sadman.soap.model.Product;

public class ProductServiceImpl {
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("Angels and Demons");
		bookList.add("Ast of War");
		bookList.add("War & Peace");
		
		movieList.add("RockStar");
		movieList.add("Mission Impossible");
		movieList.add("James Bond");
		
		musicList.add("I want it that way");
		musicList.add("Good Bad");
		musicList.add("Here without you");
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Movies");
		categories.add("Music");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
	
	public boolean addProducts(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Book", "1234", 100.75));
		productList.add(new Product("C# Book", "123", 1000.75));
		return productList;
	}
}
