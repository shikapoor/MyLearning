package com.selfLearning;


import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


import com.selfLearning.DAO.ProductRepository;
import com.selfLearning.mapper.ProductMapper;
import com.selfLearning.service.ProductService;

@SpringBootTest
class ProductApiApplicationTests {

	@Inject
	ProductService prodService;
	
	@Mock
	ProductRepository productRepo;
	
	@Mock
	ProductMapper mapper;
	
	@Test
	public void getAllProductsTest()
	{
		List abc = new ArrayList<ProductEntity>();
		ProductEntrity e1 = new ProductEntity();
		abc.add();
		abc.add();
		when(productRepo.findAll()).thenReturn(abc);
	}
	
	
	
	@Test
	void contextLoads() {
	}

}
