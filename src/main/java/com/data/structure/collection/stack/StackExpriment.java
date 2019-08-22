package com.data.structure.collection.stack;

public class StackExpriment {

	public static void main(String[] args) {

		TwoStack<Integer> twoStack = new TwoStack<Integer>(Integer.class, 8);
		twoStack.push1(11);
		twoStack.push1(12);
		twoStack.push1(13);
		twoStack.push1(14);
		twoStack.push2(15);
		twoStack.push2(16);
		twoStack.push2(17);
		twoStack.push2(18);
		twoStack.push1(19);
		while(twoStack.size1()!=0){
			System.out.print(twoStack.pop1()+", ");
		}
		while(twoStack.size2()!=0){
			System.out.print(twoStack.pop2()+", ");
		}
		/*StackImplementation<Integer> lst = new StackImplementation<Integer>();
		lst.push(11);
		lst.push(12);
		lst.push(13);
		lst.push(14);
		lst.push(15);
		lst.push(16);
		lst.push(17);
		lst.push(18);
		System.out.println(lst.size());
		while(lst.size()!=0){
			System.out.print(lst.pop()+", ");
		}
		System.out.println("");
		System.out.print(lst.pop()+", ");*/
	}
}
