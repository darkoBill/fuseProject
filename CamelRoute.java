package com.mycompany;

import org.apache.camel.builder.RouteBuilder;

public class CamelRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		
		from("file:C:\\input").log("log1").
		to("file:C:\\output");
		
	}
}
