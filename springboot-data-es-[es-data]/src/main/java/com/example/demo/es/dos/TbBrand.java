package com.example.demo.es.dos;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "tb_brand", type = "tbBrand")
public class TbBrand {
	@Id
	private Integer id;
	@Field(analyzer = "ik_smart", type = FieldType.Text)
	private String name;
	@Field(analyzer = "ik_smart", type = FieldType.Text)
	private String image;
	
	@Field(analyzer = "ik_smart", type = FieldType.Text)
	private String letter;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}

	public TbBrand(Integer id, String name, String image, String letter) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.letter = letter;
	}

	public TbBrand() {
	}

	@Override
	public String toString() {
		return "TbBrand [id=" + id + ", name=" + name + ", image=" + image + ", letter=" + letter + "]";
	}
	
	
	

}
