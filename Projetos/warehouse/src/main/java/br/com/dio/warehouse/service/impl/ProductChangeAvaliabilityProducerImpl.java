package br.com.dio.warehouse.service.impl;

import br.com.dio.warehouse.dto.StockStatusMessage;
import br.com.dio.warehouse.service.IProductChangeAvabialityProducer;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductChangeAvaliabilityProducerImpl implements IProductChangeAvabialityProducer {

	private final RabbitTemplate rabbitTemplate;
	private final String exchangeName;
	private final String routingKeyName;

	public ProductChangeAvaliabilityProducerImpl(final RabbitTemplate rabbitTemplate,
												 @Value("${spring.rabbitmq.template.exchange.product-change-availability}")
												 final String exchangeName,
												 @Value("${spring.rabbitmq.template.routing-key.product-change-availability}")
												 final String routingKeyName){
		this.exchangeName = exchangeName;
		this.rabbitTemplate = rabbitTemplate;
		this.routingKeyName = routingKeyName;
	}

	@Override
	public void notifyStatusChange(final StockStatusMessage message){
		rabbitTemplate.convertAndSend(exchangeName, routingKeyName, message);
	}


}
