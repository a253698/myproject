package com.mavis.oo;

public class GratuateStudent extends Student {
	int thesis;
	// extends 代表擴充
	// 建構子不會被繼承，但子類別可以利用super呼叫父類別的建構子
	// 剛開始裡面會有空的建構子，但繼承物裡面沒有空的建構子，所以會出錯
	// Student裡面需要有一個空的建構子
	// 一個類別只能繼承一個父類別
	// 若沒繼承，全部都繼承java.lan.Object
	// 父類別和子類別相似，卻又有差異
	// super()未走父類別的空的建構子
}
