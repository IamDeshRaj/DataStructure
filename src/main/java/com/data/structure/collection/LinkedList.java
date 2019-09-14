package com.data.structure.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E>{

	int size = 0;
	Node<E> first = null;
	Node<E> last = null;

	public void addFirst(E element) {
		Node<E> f = first;
		Node<E> elementNode = new Node<E>(null, element, f);
		if(f == null) {
			last = elementNode;
		}else {
			f.prv = elementNode;
			first = elementNode;
		}
		size++;
	}

	@Override
	public boolean add(E element) {
		addLast(element);
		return true;
	}

	public void addLast(E element) {
		Node<E> l = last;
		Node<E> elementNode = new Node<E>(l, element, null);
		last = elementNode;
		if(l == null) {
			first = elementNode;
		}else {
			l.nxt = elementNode;
		}
	}

	public E getElementFromLast(int index) {
		Node<E> main = this.first;
		Node<E> reference = this.first;
		if(this.first == null) {
			return null;
		}
		int i = 1;
		while(i != index) {
			if(reference == null) {
				return null;
			}
			reference = reference.nxt;
			i++;
		}
		while(reference.nxt != null) {
			main = main.nxt;
			reference = reference.nxt;
		}
		return main.element;
	}

	public void createCircleBwtween(int index) {
		Node<E> main = this.first;
		Node<E> reference = this.first;
		if(this.first == null) {
			return;
		}
		int i = 1;
		while(i != index) {
			if(reference == null) {
				return;
			}
			reference = reference.nxt;
			i++;
		}
		while(reference.nxt != null) {
			main = main.nxt;
			reference = reference.nxt;
		}
		reference.nxt = main;
	}

	public E getMiddleNode() {
		Node<E> middle = this.first;
		Node<E> last = this.first;
		while(last != null) {
			middle = middle.nxt;
			last = last.nxt.nxt;
		}
		return middle.element;
	}
	
	public boolean isCircular() {
		Node<E> slow = this.first;
		Node<E> fast = this.first;
		while(fast.nxt != null) {
			slow = slow.nxt;
			fast = fast.nxt;
			if(fast != null && fast.nxt != null) {
				fast = fast.nxt;
			}else {
				return false;
			}
			if(slow.element == fast.element) {
				return true;
			}
		}
		return false;
	}

	public E getCircularNode() {
		Node<E> slow = this.first;
		Node<E> fast = this.first;
		while(fast.nxt != null) {
			slow = slow.nxt;
			fast = fast.nxt;
			if(fast != null && fast.nxt != null) {
				fast = fast.nxt;
			}else {
				return null;
			}
			if(slow.element == fast.element) {
				slow = this.first;
				if(slow.element == fast.element) {
					return slow.element;
				}
				while(slow.element != fast.element) {
					slow = slow.nxt;
					fast = fast.nxt;
					if(slow.element == fast.element) {
						return slow.element;
					}
				}
			}
		}
		return slow.element;
	}

	public void reverse() {
		//Node<E> localLast = this.last;
		Node<E> localFirst = this.first;
		//last = this.first;
		Node<E> tmp = null;
		Node<E> current = null;
		Node<E> nextNode = this.first;
		do {
			nextNode = nextNode.nxt;
			current = nextNode.prv;
			tmp = current.nxt;
			current.nxt = current.prv;
			current.prv = tmp;
		}while(nextNode.nxt != null);

		if(nextNode.nxt == null) {
			nextNode.nxt = nextNode.prv;
			nextNode.prv = null;
		}
		this.last = localFirst;
		this.first = nextNode;
	}

	public void seggregate() {
		if(!(this.first.element instanceof Integer)) {
			System.out.println("operation not supported");
			return;
		}
		Node<E> nxt = this.first;
		Node<E> evenHead = null;
		Node<E> oddHead = null;
		Node<E> evenTail = null;
		Node<E> oddTail = null;
		do {
			if(((Integer)nxt.element)%2==0) {
				if(evenHead == null) {
					evenHead = nxt;
				}else {
					evenHead.nxt = nxt;
					evenHead = evenHead.nxt;
				}
			}else {
				if(oddHead == null) {
					oddHead = nxt;
				}else{
					oddHead.nxt = nxt;
					oddHead = oddHead.nxt;
				}
			}
			nxt = nxt.nxt;
		}while(nxt!=null);
		System.out.println("here");
	}

	public void reverseRecursivily() {
		Node<E> localFirst = this.first;
		Node<E> localLast = this.last;
		reverse(this.first);
		this.last = localFirst;
		this.first = localLast;
	}

	public void reverse(Node<E> nextNode) {
		Node<E> tmp = null;
		if(nextNode.nxt != null) {
			reverse(nextNode.nxt);
		}

		if(nextNode.nxt == null) {
			nextNode.nxt = nextNode.prv;
			nextNode.prv = null;
		}else {
			tmp = nextNode.nxt;
			nextNode.nxt = nextNode.prv;
			nextNode.prv = tmp;
		}
	}

	public E get(int index) {
		E element = null;
		if(index+1 > size) {
			throw new IndexOutOfBoundsException("index "+index+" doesn't exist");
		}
		if(index == 0) {
			return first.element;
		}
		int j=size;
		for (Node<E> i = last; i.prv != null; i = i.prv) {
			if(j == index+1) {
				element = i.element;
				break;
			}
			j--;
		}
		return element;
	}

	public E remove(int index) {
		Node<E> node = null;
		if(index > size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if(index == 0) {
			return first.element;
		}
		int j=size;
		for (Node<E> i = last; i.prv != null; i = i.prv) {
			if(j == index+1) {
				node = i;
				node.prv.nxt = node.nxt;
				size--;
				break;
			}
			j--;
		}
		return node.element;
	}

	public boolean remove(Object o) {
		Node<E> node = null;
		for (Node<E> i = last; i.prv != null; i = i.prv) {
			if(i.element.equals(o)) {
				node = i;
				node.prv.nxt = node.nxt;
				size--;
				break;
			}
		}
		return true;
	}

	public static class Node<E>{
		E element = null;
		Node<E> nxt = null;
		Node<E> prv = null;
		public Node(Node<E> prv, E element, Node<E> nxt) {
			super();
			this.element = element;
			this.nxt = nxt;
			this.prv = prv;
		}
		@Override
		public String toString() {
			if(nxt == null) {
				return "Node [element=" + element + ", nxt=null, prv=" + prv.element + "]";
			}else if(prv == null) {
				return "Node [element=" + element + ", nxt="+ nxt.element+ ", prv=null]";
			}else {
				return "Node [element=" + element + ", nxt="+ nxt.element+ ", prv=" + prv.element + "]";
			}
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub

	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
