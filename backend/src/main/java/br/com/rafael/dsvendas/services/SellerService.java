package br.com.rafael.dsvendas.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafael.dsvendas.dto.SellerDTO;
import br.com.rafael.dsvendas.entity.Seller;
import br.com.rafael.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> seller = repository.findAll();
		return seller.stream().map(x-> new SellerDTO(x)).collect(Collectors.toList());
	}

}
