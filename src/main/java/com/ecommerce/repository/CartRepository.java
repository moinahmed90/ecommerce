package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

	List<Cart> findAllByUserId(Integer userId);
}
