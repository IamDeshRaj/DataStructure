largestComponent = (graph) => {
  let largest = 0;
  let visited = new Set();
  for (let node in graph) {
    const cs = exploreAndCount(graph, node, visited);
    if (largest < cs) {
      largest = cs;
    }
  }
  console.log("Largest component is " + largest);
};

exploreAndCount = (graph, keyNode, visited) => {
  if (visited.has(String(keyNode))) return 0;

  visited.add(String(keyNode));
  let totalCount = 1;
  for (let node of graph[keyNode]) {
    const count = exploreAndCount(graph, node, visited);
    totalCount = totalCount + count;
  }
  return totalCount;
};

largestComponent({
  0: [8, 1, 5],
  1: [0],
  5: [0, 8],
  8: [0, 5],
  2: [3, 4],
  3: [2, 4],
  4: [3, 2],
});
