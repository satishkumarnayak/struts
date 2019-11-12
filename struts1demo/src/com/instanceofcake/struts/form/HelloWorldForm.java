package com.instanceofcake.struts.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hello = null;

	public HelloWorldForm() {
		
		
		super();
		System.out.println("==========HelloWorldform constructor==============");
		hello = "Hello World";
	}

	public String getHello() {
		System.out.println("=========HelloWorldform getHello===============");
		return hello;
	}

	public void setHello(String hello) {
		System.out.println("=========HelloWorldform setHello===============");
		this.hello = hello;
	}
}
