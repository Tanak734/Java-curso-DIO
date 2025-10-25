package br.com.dio.warehouse.service;

import br.com.dio.warehouse.dto.StockStatusMessage;

public interface IProductChangeAvabialityProducer {
	void notifyStatusChange(StockStatusMessage message);
}
