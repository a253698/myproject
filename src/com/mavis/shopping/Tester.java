package com.mavis.shopping;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		// ArrayList<Customer> customers = new ArrayList<>();
		// Customer c1 = new Customer(10000);
		// SilverCustomer c2 = new SilverCustomer(20000);
		// GoldenCustomer c3 = new GoldenCustomer(30000);
		// customers.add(c1);
		// customers.add(c2);
		// customers.add(c3);
		// for(int i=0; i<customers.size(); i++){
		// Customer c = customers.get(i);
		// c.print();
		// }
		//

		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer(10000));
		customers.add(new SilverCustomer(20000));
		customers.add(new GoldenCustomer(30000));
		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			c.print();
		}
		// 完全等於上面註解掉的

		ArrayList<Integer> list = new ArrayList<>();
		// 因為ArrayList沒有特定種類，所以在<種類名稱>中定義
		// <>稱為泛型
		// ArrayList為集合，可放異質資料，但這樣在做宣告的時候需要轉型。
		list.add(99);
		list.add(88);
		list.add(77);

		int n = list.get(2);
		// 因為已經有在<>，中宣告ArrayList種類為int，所以n不再需要轉型
		System.out.println(n);
		// 4.2屬於double 4.2f屬於float

		System.out.println(list.get(1));
		// 取出第編號1的
		System.out.println(list.size());
		// 問list中共有幾個
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Customer p1 = new Customer(1000);
		p1.print();

		SilverCustomer p2 = new SilverCustomer(1500);
		p2.print();

		GoldenCustomer p3 = new GoldenCustomer(2000);
		p3.print();
	}
}
