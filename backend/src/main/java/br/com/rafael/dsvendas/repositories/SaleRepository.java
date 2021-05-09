package br.com.rafael.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafael.dsvendas.entity.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long> {

}
