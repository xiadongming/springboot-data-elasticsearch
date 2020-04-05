package com.example.demo.es.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.es.dos.TbBrand;
import com.example.demo.es.dos.TbrendRepository;

public class TestDemo {

	@Autowired
	private TbrendRepository repository;

	@Test
	public void save() {

		TbBrand tbBrand = new TbBrand(1, "率瑞纳", "222", "333");
		TbBrand save = repository.save(tbBrand);
		System.out.println(save);
		System.out.println("====================");

	}

}
