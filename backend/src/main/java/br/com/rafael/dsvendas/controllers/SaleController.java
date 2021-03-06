package br.com.rafael.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafael.dsvendas.dto.SaleDTO;
import br.com.rafael.dsvendas.dto.SaleSucessDTO;
import br.com.rafael.dsvendas.dto.SaleSumDTO;
import br.com.rafael.dsvendas.dto.SellerDTO;
import br.com.rafael.dsvendas.services.SaleService;
import br.com.rafael.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="/sum-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		List<SaleSumDTO> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller(){
		List<SaleSucessDTO> list = service.sucess();
		return ResponseEntity.ok(list);
	}

}
