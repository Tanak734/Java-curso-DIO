package br.com.dio.warehouse.controller;

import br.com.dio.warehouse.controller.request.StockSaveRequest;
import br.com.dio.warehouse.controller.response.StockSavedResponse;
import br.com.dio.warehouse.mapper.IStockMapper;
import br.com.dio.warehouse.service.IStockService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("stocks")
@AllArgsConstructor
public class StockController {

	private final IStockService service;
	private final IStockMapper mapper;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	StockSavedResponse save(@RequestBody final StockSaveRequest request){
		var entity = mapper.toEntity(request);
		entity = service.save(entity);
		return mapper.toResponse(entity);
	}

	@PutMapping("{id}/release")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void release(@PathVariable final UUID id){
		service.release(id);
	}

	@PutMapping("{id}/release")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void inactive(@PathVariable final UUID id){
		service.inactive(id);
	}
}
