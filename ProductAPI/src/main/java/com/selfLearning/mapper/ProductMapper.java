package com.selfLearning.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;

import com.selfLearning.dto.Product;
import com.selfLearning.entity.ProductEntity;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	
	@Mapping(source="pid", target="id")
	@Mapping(source="pname", target="name")
	Product productEntityToProduct(ProductEntity prod);
	
	
	@Mapping(source="id", target = "pid")
	@Mapping(source="name", target ="pname")
	ProductEntity productToProductEntity(Product prod);
	
	@IterableMapping(nullValueMappingStrategy=NullValueMappingStrategy.RETURN_NULL)
	List<Product> productEnityListToProductList(List<ProductEntity> p);

}
