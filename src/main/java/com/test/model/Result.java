package com.test.model;

public class Result {
	private String moduleName;
	private int moduleOrder;
	
	
	public Result(int order, String module) {
		super();
		this.moduleOrder = order;
		this.moduleName = module;
	}
	
	public int getModuleOrder() {
		return moduleOrder;
	}
	
	public void setOrder(int order) {
		this.moduleOrder = order;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String module) {
		this.moduleName = module;
	}
	
	
}
