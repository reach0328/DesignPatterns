package com.jihoon.designpatterns.factorymethod;

public class TVFactory extends FactoryMethod {

	@Override
	public Product make() {
		return new TV();
	}

	@Override
	public Packed pack(Product product) {
		TVpacked packed = new TVpacked();
		packed.setProduct(product);
		return packed;
	}
}
