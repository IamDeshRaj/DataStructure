connectComponents = (graph) => {
  let count = 0;
  const visited = new Set();
  for (let node in graph) {
    if (exploreGraph(graph, node, visited)) {
      count += 1;
    }
  }
  console.log("total count " + count);
};
exploreGraph = (graph, keyNode, visited) => {
  if (visited.has(String(keyNode))) {
    return false;
  }
  visited.add(String(keyNode));
  for (let node in graph[keyNode]) {
    exploreGraph(graph, node, visited);
  }
  return true;
};

connectComponents({
  0: [8, 1, 5],
  1: [0],
  5: [0, 8],
  8: [0, 5],
  2: [3, 4],
  3: [2, 4],
  4: [3, 2],
});
