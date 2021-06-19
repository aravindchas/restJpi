package com.cg.es.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.es.entity.ElectronicProductType;

@Repository
public interface ProductTypeRepository extends JpaRepository<ElectronicProductType,Integer>{

}
