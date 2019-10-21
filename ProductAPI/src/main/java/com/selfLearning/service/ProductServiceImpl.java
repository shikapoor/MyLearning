package com.selfLearning.service;

import java.util.ArrayList;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selfLearning.DAO.ProductRepository;
import com.selfLearning.dto.Product;
import com.selfLearning.entity.ProductEntity;
import com.selfLearning.exceptions.ProductNotFoundException;
import com.selfLearning.mapper.ProductMapper;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	ProductMapper mapper;
	
	public ArrayList<Product> getAllProducts(){
		ArrayList<Product> productList = null;
		try
		{
			ArrayList<ProductEntity> productEntityList= productRepo.findAll();
			productList = mapper.productEnityListToProductList(productEntityList);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return productList;
	}
	
	public Product getProductById(int prodId)throws ProductNotFoundException
	{
		Product productObj = null;
		
			Optional<ProductEntity> entity = productRepo.findById(new Integer(prodId));
			if(!entity.isPresent())
			{
				throw new ProductNotFoundException("Product Not found with Product ID : "+prodId);
			}
			else
			{
				productObj = mapper.productEntityToProduct(entity.get());
			}
		
		return productObj;
		
	}
	
	public int addProduct(Product prodObj)
	{
		
		ProductEntity obj = productRepo.save(mapper.productToProductEntity(prodObj));
		
		return mapper.productEntityToProduct(obj).getId();
	}

}
