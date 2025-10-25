package br.com.dio.warehouse.service.impl;

import br.com.dio.warehouse.dto.ProductStorefrontSaveDTO;
import br.com.dio.warehouse.entity.ProductEntity;
import br.com.dio.warehouse.mapper.IProductMapper;
import br.com.dio.warehouse.repository.ProductRepository;
import br.com.dio.warehouse.service.IProductQueryService;
import br.com.dio.warehouse.service.IProductService;
import br.com.dio.warehouse.service.IStockService;
import org.springframework.web.client.RestClient;

import java.util.UUID;

public class ProductServiceimpl implements IProductService{
	private final ProductRepository repository;
	private final IProductQueryService queryService;
	private final IStockService stockService;
	private final RestClient storefrontClient;
	private final IProductMapper mapper;

	public ProductServiceimpl(ProductRepository repository, IProductQueryService queryService, IStockService stockService, RestClient storefrontClient, IProductMapper mapper) {
		this.repository = repository;
		this.queryService = queryService;
		this.stockService = stockService;
		this.storefrontClient = storefrontClient;
		this.mapper = mapper;
	}

	@Override
	public ProductEntity save(final ProductEntity entity){
		repository.save(entity);
		var dto = mapper.toDTO(entity);
		saveStorefront(dto);
		return entity;
	}

	@Override
	public void purchase(UUID id) {
		var entity = queryService.findById(id);
		var stock = entity.decStock();
		repository.save(entity);
		if (stock.isUnavaliable()){
			stockService.changeStatus(stock.getId(), stock.getStatus());
		}
	}
	private void saveStorefront(ProductStorefrontSaveDTO dto) {
		storefrontClient.post().uri("/products").body(dto).retrieve().body(ProductStorefrontSaveDTO.class);
	}
}
