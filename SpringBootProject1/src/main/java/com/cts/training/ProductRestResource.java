package com.cts.training;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cts.training.bean.Product;

@RepositoryRestResource(path = "products", collectionResourceRel = "products")
public interface ProductRestResource extends PagingAndSortingRepository<Product, Integer> {
	
	List<Product> findByDescription(@Param("ds") String ds);

}
