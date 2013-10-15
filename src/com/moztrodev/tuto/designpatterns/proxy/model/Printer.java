/**
 * 
 */
package com.moztrodev.tuto.designpatterns.proxy.model;

/**
 * @author DANIEL
 *
 */
public abstract class Printer {

	public static void print(Page page){
		System.out.println(page.getContent());
	}
}
