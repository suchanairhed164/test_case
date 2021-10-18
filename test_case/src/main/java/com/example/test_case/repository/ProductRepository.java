package com.example.test_case.repository;

import com.example.test_case.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Modifying
    @Query(
            value =
                    "insert into product (name) values (:name)",
            nativeQuery = true)
    void insertUser(@Param("name") String name);

}