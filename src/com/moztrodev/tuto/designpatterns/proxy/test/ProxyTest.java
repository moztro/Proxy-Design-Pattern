/**
 * 
 */
package com.moztrodev.tuto.designpatterns.proxy.test;

import com.moztrodev.tuto.designpatterns.proxy.model.Page;
import com.moztrodev.tuto.designpatterns.proxy.model.Printer;
import com.moztrodev.tuto.designpatterns.proxy.proxys.ProxyPage;

/**
 * @author DANIEL
 *
 */
public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Page page = new Page();
		page.setContent("Hello MoztroDev, welcome to proxy test");
		
		ProxyPage proxyPage = new ProxyPage();
		proxyPage.setPage(page);
		
		for(int i=0; i < 10; i++)
			Printer.print(proxyPage);
		
		System.out.println("Print count: "+proxyPage.getPrintCount());
	}

}
