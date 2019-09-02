package com.data.structure.collection.graph;

public class GraphTest {

	public static void main(String[] args) {
		GraphImpl bfs = new GraphImpl(8);
		bfs.insert(0, 1); 
        bfs.insert(0, 2); 
        bfs.insert(1, 2); 
        bfs.insert(2, 0); 
        bfs.insert(2, 3); 
        bfs.insert(3, 3);
		
        /*bfs.insert(0, 1);
		bfs.insert(0, 2);
		bfs.insert(0, 3);
		bfs.insert(1, 2);
		bfs.insert(1, 1);
		bfs.insert(1, 3);
		bfs.insert(1, 0);
		bfs.insert(2, 0);
		bfs.insert(2, 0);
		bfs.insert(3, 3);
		bfs.insert(3, 1);
		bfs.insert(3, 2);
		bfs.insert(3, 5);
		bfs.insert(3, 7);
		bfs.insert(4, 4);
		bfs.insert(4, 3);
		bfs.insert(4, 7);
		bfs.insert(5, 5);
		bfs.insert(5, 3);
		bfs.insert(5, 6);
		bfs.insert(6, 6);
		bfs.insert(6, 5);
		bfs.insert(6, 7);
		bfs.insert(7, 7);
		bfs.insert(7, 3);
		bfs.insert(7, 4);
		bfs.insert(7, 6);*/
		bfs.traverseBFS(2);
		System.out.println(bfs.isCircular());
		bfs.traverseDFS(2);
	}
}
