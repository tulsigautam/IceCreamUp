package com.example.icecreamup.dao;

import com.example.icecreamup.dto.ProductDTO;

public class ProductDAO implements IProductDAO {

	ProductRepository productRepository;
	
	@Override
	public boolean save(ProductDTO productDTO) throws Exception {
		// TODO Auto-generated method stub
		productRepository.save(productDTO);
		return false;
	}

	@Override
	public Iterable<ProductDTO> fetchAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
