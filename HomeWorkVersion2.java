package com.me;

public class HomeWorkVersion2 {
	public static void main(String[] args) {

		String[] productName = { "少林寺酥饼核桃", "然光α移", "尚康杂粮牡丹饼" }; // 商品名称
		String[] productNumber = { "(090115)", "(090028)", "(090027)" }; // 商品编号
		double[] productPrice = { 15.5, 16.0, 14.5 }; // 商品单价
		int[] productAmount = { 22, 55, 24 }; // 商品数量
		double[] productSum = new double[productName.length]; // 商品金额
		int productCount = productName.length; // 多少项商品
		int sum = 0;// 总商品数量
		double amount = 0; // 总商品金额

		for (int i = 0; i < productCount; i++) { // 遍历所有商品金额
			productSum[i] = productPrice[i] * productAmount[i];
		}

		System.out.println("\t\t\t\t\t\t\t欢\t迎\t光\t临");
		System.out.println("\t\t品名\t\t\t\t售价\t\t\t\t数量\t\t\t\t金额");
		System.out.println("---------------------------------------------------------------------------------");
		for (int i = 0; i < productCount; i++) { // 遍历所有商品信息并打印
			if (i != 1) {
				System.out.println(productName[i] + productNumber[i] + "\t\t" + productPrice[i] + "\t\t*\t\t"
						+ productAmount[i] + "\t\t=\t\t" + productSum[i]);
			} else {
				System.out.println(productName[i] + productNumber[i] + "\t\t\t" + productPrice[i] + "\t\t*\t\t"
						+ productAmount[i] + "\t\t=\t\t" + productSum[i]);
			}
			sum += productAmount[i];
			amount += productSum[i];
		}
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(productCount + "项商品\t共计：" + sum + "件");
		System.out.println("总计：" + amount + "元");
		System.out.println("凭此小票换取发票！\n");
		System.out.println("谢谢使用Firmin超市收银程序！(^_^)");
	}
}
