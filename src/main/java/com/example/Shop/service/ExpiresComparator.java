package com.example.Shop.service;

import com.example.Shop.model.Product;

import java.util.Comparator;

public class ExpiresComparator implements Comparator<Product> {

    @Override
    public int compare(final Product p1, final Product p2) {
    	if (p1.getExpires() == null) {
    		return -1;
    	}
    	
    	if (p2.getExpires() == null) {
    		return 1;
    	}
        return p1.getExpires().compareTo(p2.getExpires());
    }
}
