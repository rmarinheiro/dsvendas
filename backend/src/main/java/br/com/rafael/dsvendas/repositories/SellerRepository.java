package br.com.rafael.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafael.dsvendas.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
