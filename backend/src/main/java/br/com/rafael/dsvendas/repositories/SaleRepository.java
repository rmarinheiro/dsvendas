package br.com.rafael.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.rafael.dsvendas.dto.SaleSucessDTO;
import br.com.rafael.dsvendas.dto.SaleSumDTO;
import br.com.rafael.dsvendas.entity.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new br.com.rafael.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new br.com.rafael.dsvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited),  SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSucessDTO> sucessGroupedBySeller();
	
	

}
