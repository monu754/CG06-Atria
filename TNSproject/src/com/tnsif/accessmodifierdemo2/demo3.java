package com.tnsif.accessmodifierdemo2;

import com.tnsif.assessmodifierdemo.PublicDemo;

public class demo3 {

	public static void main(String args[]) {
		PublicDemo p=new PublicDemo();
		System.out.println(p.a);
		System.out.println(p.s);
		//System.out.println(p.str);
		p.display();

}
}