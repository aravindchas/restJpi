package com.cg.es.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.es.entity.ElectronicProduct;

@Repository
public interface ElectronicProductRepository extends JpaRepository<ElectronicProduct,Integer>{

	List<ElectronicProduct> findByName(String name);
	
	@Query("Select product from ElectronicProduct product order by product.name")
	List<ElectronicProduct> findByNameSorted(String name);

}
