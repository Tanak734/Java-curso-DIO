package br.com.dio.warehouse.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

import static br.com.dio.warehouse.entity.StockStatus.AVALIABLE;
import static jakarta.persistence.CascadeType.ALL;

@Entity
@Getter
@Setter
@ToString
public class ProductEntity {
	@Id
	private UUID id;

	private String name;

	@ToString.Exclude
	@OneToMany(mappedBy = "product", cascade = ALL, orphanRemoval = true)
	private Set<StockEntity> stocks = new HashSet<>();

	public StockEntity decStock(){
		var stock = getStockWithMinSoldPrice();
		stock.decAmount();
		return stock;
	}

	public BigDecimal getPrice(){
		return getStockWithMinSoldPrice().getSoldPrice();
	}


	private StockEntity getStockWithMinSoldPrice(){
		return this.stocks.stream()
				.filter(s -> s.getStatus().equals(AVALIABLE))
				.min(Comparator.comparing(StockEntity::getSoldPrice))
				.orElseThrow();
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof ProductEntity that)) return false;
		return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(stocks, that.stocks);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, stocks);
	}

	@PrePersist
	private void prePersist(){
		this.id = UUID.randomUUID();
	}

}
