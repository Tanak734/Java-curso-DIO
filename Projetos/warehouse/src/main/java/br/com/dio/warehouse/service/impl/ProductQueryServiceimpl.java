package br.com.dio.warehouse.service.impl;

import br.com.dio.warehouse.dto.ProductStorefrontSaveDTO;
import br.com.dio.warehouse.entity.ProductEntity;
import br.com.dio.warehouse.mapper.IProductMapper;
import br.com.dio.warehouse.repository.ProductRepository;
import br.com.dio.warehouse.service.IProductQueryService;
import br.com.dio.warehouse.service.IStockService;
import org.springframework.web.client.RestClient;

import java.util.UUID;


public class ProductQueryServiceimpl implements IProductQueryService {
	private final ProductRepository repository;

	public ProductQueryServiceimpl(ProductRepository repository) {
		this.repository = repository;
	}


	@Override
	public ProductEntity findById(final UUID id){
		return repository.findById(id).orElseThrow();
	}

}
