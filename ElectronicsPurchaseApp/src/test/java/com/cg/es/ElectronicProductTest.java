package com.cg.es;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.es.entity.ElectronicProduct;
import com.cg.es.repository.ElectronicProductRepository;
import com.cg.es.service.ElectronicProductServiceImpl;
@SpringBootTest
class ElectronicProductTest {
	@Autowired
	ElectronicProductServiceImpl epservice;
	
	@MockBean
	ElectronicProductRepository eprepo;

	
	
	@Test
	void testaddProduct() {
		ElectronicProduct e1=new ElectronicProduct();
		e1.setCode(101);
		e1.setName("Mobile");
		e1.setPrice(45000.00);
		e1.setImage("F:/images.samsung.jpeg");
		e1.setCreateDate("2021-04-21"); 
		e1.setProductType(null);
	
   Mockito.when(eprepo.save(e1)).thenReturn(e1);
   assertThat(epservice.addProduct(e1)).isEqualTo(e1);
	}
	
	
	@Test
	void testupdateProduct() throws Exception {
		ElectronicProduct e1=new ElectronicProduct();
		e1.setCode(101);
		e1.setName("Mobile");
		e1.setPrice(45000.00);
		e1.setImage("F:/images.samsung.jpeg");
		e1.setCreateDate("2021-04-21");
		e1.setProductType(null);
		
		Optional<ElectronicProduct> e2=Optional.of(e1);
		Mockito.when(eprepo.findById(101)).thenReturn(e2);
		e1.setName("SmartPhone");
		
		
   Mockito.when(eprepo.save(e1)).thenReturn(e1);
   assertThat(epservice.updateProduct(e1)).isEqualTo(e1);
	}
	
	@Test
	void testremoveProduct() throws Exception{
		ElectronicProduct e1=new ElectronicProduct();
		e1.setCode(101);
		e1.setName("Mobile");
		e1.setPrice(45000.00);
		e1.setImage("F:/images.samsung.jpeg");
		e1.setCreateDate("2021-04-21");
		e1.setProductType(null);
		
		Optional<ElectronicProduct> e2=Optional.of(e1);
		Mockito.when(eprepo.findById(101)).thenReturn(e2);
		 Mockito.when(eprepo.existsById(e1.getCode())).thenReturn(false);
		   assertFalse(eprepo.existsById(e1.getCode()));
	}
	@Test
	void testshowAllProducts() {
		ElectronicProduct e1=new ElectronicProduct();
		e1.setCode(101);
		e1.setName("Mobile");
		e1.setPrice(45000.00);
		e1.setImage("F:/images.samsung.jpeg");
		e1.setCreateDate("2021-04-21");
		e1.setProductType(null);
		
		ElectronicProduct e2=new ElectronicProduct();
		e2.setCode(102);
		e2.setName("Iphone");
		e2.setPrice(45000.00);
		e2.setImage("F:/images.apple.jpeg");
		e2.setCreateDate("2021-05-13");
		e2.setProductType(null);
		List<ElectronicProduct> epList = new ArrayList<>();
		epList.add(e1);
		epList.add(e2);
		
		Mockito.when(eprepo.findAll()).thenReturn(epList);
		
		assertThat(epservice.showAllProducts()).isEqualTo(epList);
		
	}
	@Test
	void testviewProduct() {
		ElectronicProduct e1=new ElectronicProduct();
		e1.setCode(101);
		e1.setName("Mobile");
		e1.setPrice(45000.00);
		e1.setImage("F:/images.samsung.jpeg");
		e1.setCreateDate("2021-04-21");
		e1.setProductType(null);
		Optional<ElectronicProduct> e2=Optional.of(e1);
   Mockito.when(eprepo.findById(101)).thenReturn(e2);
   assertThat(epservice.viewProduct(101)).isEqualTo(e2);
	}

	

}
