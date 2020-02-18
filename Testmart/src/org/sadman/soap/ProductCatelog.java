package org.sadman.soap;

import java.util.ArrayList;
import java.util.List;

public class ProductCatelog {
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Moviess");
		categories.add("Music");
		return categories;
	}

}
