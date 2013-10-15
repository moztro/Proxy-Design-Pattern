/**
 * 
 */
package com.moztrodev.tuto.designpatterns.proxy.proxys;

import com.moztrodev.tuto.designpatterns.proxy.model.Page;

/**
 * @author DANIEL
 *
 */
public class ProxyPage extends Page{
	
	private int printCount;
	private Page page;
	
	public int getPrintCount() {
		return printCount;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	@Override
	public String getContent(){
		printCount++;
		return page.getContent();
	}
}
