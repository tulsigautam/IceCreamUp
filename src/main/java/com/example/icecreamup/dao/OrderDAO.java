package com.example.icecreamup.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.icecreamup.dto.OrderDTO;

/**
 * 
 * @author chaklahk
 */
@Component
public class OrderDAO implements IOrderDAO
{
	@Autowired
	OrderRepository orderRepository;

	@Override
	public boolean save(OrderDTO orderDTO) throws Exception
	{
		orderRepository.save(orderDTO);
		return false;
	}
	
	@Override
	public Iterable<OrderDTO> fetchAll() throws Exception
	{
		return orderRepository.findAll();
	}
}
