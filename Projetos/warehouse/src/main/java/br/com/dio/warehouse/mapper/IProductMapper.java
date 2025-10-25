package br.com.dio.warehouse.mapper;


import br.com.dio.warehouse.controller.request.ProductSaveRequest;
import br.com.dio.warehouse.controller.response.ProductDetailResponse;
import br.com.dio.warehouse.controller.response.ProductSavedResponse;
import br.com.dio.warehouse.dto.ProductStorefrontSaveDTO;
import br.com.dio.warehouse.entity.ProductEntity;
import br.com.dio.warehouse.entity.StockEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.util.Set;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IProductMapper {


	@Mapping(target = "id", ignore = true)
	@Mapping(target = "stacks", ignore = true)
	@Mapping(target = "price", ignore = true)
	ProductEntity toEntity(final ProductSaveRequest request);

	ProductSavedResponse toSavedResponse(final ProductEntity entity);

	@Mapping(target = "price", expression = "java(getCurrentPrice(entity.getStocks))")
	ProductDetailResponse toDetailResponse(final ProductEntity entity);


	ProductStorefrontSaveDTO toDTO(final ProductEntity entity);


}
