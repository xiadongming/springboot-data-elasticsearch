package com.example.demo;

import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.es.dos.TbBrand;
import com.example.demo.es.dos.TbrendRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootBootrabbitmqApplicationTests {
    @Autowired
	private TbrendRepository  repository;
	
	@Test
	public void finAll() {
		
		Iterable<TbBrand> findAll = repository.findAll();
		for (TbBrand tbBrand : findAll) {
			System.out.println(tbBrand);
		}
		
	}
	
	@Test
	public void save() {

		TbBrand tbBrand = new TbBrand(1, "吕瑞娜", "222", "333");
		TbBrand save = repository.save(tbBrand);
		System.out.println(save);
		System.out.println("====================");

	}
	
	@Test
	public void save2() {
		
		TbBrand tbBrand = new TbBrand(3, "夏瑞娜", "222", "333");
		TbBrand save = repository.save(tbBrand);
		System.out.println(save);
		System.out.println("====================");
		
	}
	
	//排序查询
	@Test
	public void sort() {
		Iterable<TbBrand> findAll = repository.findAll(Sort.by("id").ascending());
		for (TbBrand tbBrand : findAll) {
			System.out.println(tbBrand);
		}
		
	}
	//复杂查询,需要构建查询条件
	@Test
	public void myQuery() {
		 // 构建查询条件
	    NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
	    // 添加基本分词查询
	    queryBuilder.withQuery(QueryBuilders.matchQuery("name", "夏"));
		
	    Page<TbBrand> search = repository.search(queryBuilder.build());
	    
	    for (TbBrand tbBrand : search) {
			System.out.println(tbBrand);
		}
	    
	}
	
	
	

}
