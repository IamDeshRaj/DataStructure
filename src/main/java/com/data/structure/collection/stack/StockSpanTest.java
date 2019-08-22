package com.data.structure.collection.stack;

public class StockSpanTest {

	public static void main(String[] args) {
		StockSpan stock = new StockSpan();
		stock.push(11);
		stock.push(12);
		stock.push(15);
		stock.push(13);
		stock.push(14);
		stock.push(19);
		stock.push(16);
		stock.push(17);
		stock.push(18);
		stock.getSpan();
		stock.getNextGreaterToRight();
	}
}
