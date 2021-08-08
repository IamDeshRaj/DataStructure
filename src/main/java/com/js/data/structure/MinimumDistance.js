findMinimumDistance = (edges, nodeA, nodeB) => {
  const graph = buildGraph(edges);
  const visited = new Set([nodeA]);
  const queue = [[nodeA, 0]];
  while (queue.length > 0) {
    const [nodeC, distance] = queue.shift();
    if (nodeC == nodeB) return distance;
    for (let node of graph[nodeC]) {
      if (!visited.has(node)) {
        queue.push([node, distance + 1]);
      }
    }
  }
  return -1;
};

buildGraph = (edges) => {
  const graph = {};
  for (let edge of edges) {
    const [node1, node2] = edge;
    if (!graph[node1]) graph[node1] = [];
    if (!graph[node2]) graph[node2] = [];
    graph[node1].push(node2);
    graph[node2].push(node1);
  }
  return graph;
};

console.log(
  "Minimum distance is " +
    findMinimumDistance(
      [
        ["w", "x"],
        ["x", "y"],
        ["z", "y"],
        ["z", "v"],
        ["w", "v"],
      ],
      "w",
      "z"
    )
);
