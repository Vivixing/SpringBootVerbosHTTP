package com.echeverri.apimogodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value="Prenda")
@Data
public class Prenda {
	@Id
	private String id;
	private String tipoDePrenda;
	private String marca;
	private String color;
	private String talla;
	private String material;
	private int precio;
	
}
