package br.com.rafael.dsvendas.services;


import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.rafael.dsvendas.dto.SaleDTO;
import br.com.rafael.dsvendas.dto.SellerDTO;
import br.com.rafael.dsvendas.entity.Sale;
import br.com.rafael.dsvendas.entity.Seller;
import br.com.rafael.dsvendas.repositories.SaleRepository;
import br.com.rafael.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> sale = repository.findAll(pageable);
		return sale.map(x-> new SaleDTO(x));
	}

}
