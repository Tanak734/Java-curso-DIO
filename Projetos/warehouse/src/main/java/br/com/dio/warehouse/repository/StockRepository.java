package br.com.dio.warehouse.repository;

import br.com.dio.warehouse.dto.StockStatusMessage;
import br.com.dio.warehouse.entity.ProductEntity;
import br.com.dio.warehouse.entity.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StockRepository extends JpaRepository<StockEntity, UUID> {

	public void notifyStatusChange(final StockStatusMessage message);
}
