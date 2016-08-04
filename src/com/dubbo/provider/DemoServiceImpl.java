package com.dubbo.provider;

public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		System.out.println("нт╡ш,╣Всцак?");
		return "Hello Dubbo,Hello " + name;
	}

}
