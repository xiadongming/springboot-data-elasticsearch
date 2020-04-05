package com.example.demo.es.dos;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbrendRepository extends ElasticsearchRepository<TbBrand,Integer> {

}
