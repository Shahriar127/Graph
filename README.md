
# Graph implementation in Java


## [Graph (BFS,DFS).pdf](https://github.com/user-attachments/files/15937559/Graph.BFS.DFS.pdf)


This repository contains a comprehensive implementation of graph data structures and algorithms in Java. Specifically, it includes implementations of graphs using adjacency matrix and adjacency list representations, as well as depth-first search (DFS) and breadth-first search (BFS) algorithms.

![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSt3kd0B55k43PCBQTGWCIkXlG7axKuYseMXA&s)

### Introduction to Graphs in Data Structures and Algorithms (DSA)

Graphs are fundamental data structures used to represent and solve problems related to networks. A graph \( G \) consists of two main components:
1. **Vertices (or Nodes)**: These are the fundamental units of a graph, representing entities or points in the graph.
2. **Edges**: These are the connections between the vertices, representing relationships or links between the entities.

Graphs are used in various applications, including social networks, transportation networks, computer networks, and more. They provide a way to model pairwise relationships between objects, making them suitable for solving a wide range of problems.

### Varieties of Graphs

Graphs can be classified based on various properties and characteristics:

1. **Directed vs. Undirected Graphs**
   - **Directed Graph (Digraph)**: In a directed graph, edges have a direction, indicating a one-way relationship from one vertex to another. Formally, an edge is represented as an ordered pair \((u, v)\), where \(u\) is the start vertex and \(v\) is the end vertex.
   - **Undirected Graph**: In an undirected graph, edges do not have a direction, indicating a bidirectional relationship between vertices. An edge is represented as an unordered pair \(\{u, v\}\).

2. **Weighted vs. Unweighted Graphs**
   - **Weighted Graph**: In a weighted graph, each edge has an associated weight or cost, representing the cost, distance, or any quantitative value of the relationship between the vertices.
   - **Unweighted Graph**: In an unweighted graph, all edges are considered equal, with no associated weight.

3. **Simple vs. Multigraphs**
   - **Simple Graph**: A simple graph does not have multiple edges (parallel edges) between the same pair of vertices and does not have loops (edges connecting a vertex to itself).
   - **Multigraph**: A multigraph may have multiple edges between the same pair of vertices and may include loops.

4. **Cyclic vs. Acyclic Graphs**
   - **Cyclic Graph**: A cyclic graph contains at least one cycle, which is a path of edges and vertices wherein a vertex is reachable from itself.
   - **Acyclic Graph**: An acyclic graph does not contain any cycles. A special type of acyclic graph is a tree, which is a connected acyclic undirected graph.

5. **Connected vs. Disconnected Graphs**
   - **Connected Graph**: In an undirected graph, a graph is connected if there is a path between every pair of vertices. In a directed graph, a graph is strongly connected if there is a directed path between every pair of vertices.
   - **Disconnected Graph**: A graph is disconnected if there exists at least one pair of vertices that do not have a path connecting them.

6. **Subgraphs and Supergraphs**
   - **Subgraph**: A subgraph is a portion of a graph, consisting of a subset of its vertices and edges.
   - **Supergraph**: A supergraph is a graph that contains another graph as its subgraph.

### Graph Representations

Graphs can be represented in various ways in computer memory, including:
- **Adjacency Matrix**: A 2D array where each cell \( (i, j) \) indicates whether there is an edge from vertex \(i\) to vertex \(j\).
- **Adjacency List**: An array of lists where each list corresponds to a vertex and contains a list of its adjacent vertices.
- **Edge List**: A list of edges where each edge is represented as a pair (or tuple) of vertices.

Each representation has its advantages and disadvantages in terms of space complexity and the efficiency of graph operations like traversal, insertion, and deletion.

Understanding the types and properties of graphs is essential for selecting appropriate algorithms for tasks such as searching, shortest path finding, and network flow problems in various applications.

### Graph Representations


**Adjacency Matrix**: A 2D array where the cell at row i and column j is 1 if there is an edge from vertex i to vertex j, and 0 otherwise. This representation is efficient for dense graphs where the number of edges is large.


**Adjacency List**: An array of lists. The index of the array represents a vertex, and each element in the list at that index represents the vertices that are adjacent to the vertex. This representation is efficient for sparse graphs where the number of edges is small relative to the number of vertices.

### Graph Traversal Algorithms


**Depth-First Search (DFS)**: An algorithm for traversing or searching tree or graph data structures. It starts at the root (or an arbitrary node in the case of a graph) and explores as far as possible along each branch before backtracking.


**Breadth-First Search (BFS)**: An algorithm for traversing or searching tree or graph data structures. It starts at the root (or an arbitrary node in the case of a graph) and explores the neighbor nodes at the present depth prior to moving on to nodes at the next depth level.
