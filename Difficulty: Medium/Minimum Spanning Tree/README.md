<h2><a href="https://www.geeksforgeeks.org/problems/minimum-spanning-tree/1">Minimum Spanning Tree</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-family: arial, helvetica, sans-serif;"><span style="font-size: 18.6667px;">Given a weighted, undirected, and connected graph with V vertices and E edges, your task is to find the sum of the weights of the edges in the Minimum Spanning Tree (MST) of the graph. The graph is represented by an adjacency list, where each element adj[i] is a vector containing pairs of integers. Each pair represents an edge, with the first integer denoting the endpoint of the edge and the second integer denoting the weight of the edge.</span></span></p>
<p><span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;"><strong>Input:
</strong>3 3
0 1 5
1 2 3
0 2 1
<img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700343/Web/Other/064ccfb5-e351-4908-a660-b228a091eb47_1685086606.png" alt="">
<strong>Output:</strong>
4
<strong>Explanation</strong>:
<img style="height: 207px; width: 288px;" src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700343/Web/Other/64f692e2-1acf-4515-8f46-516521cf0bab_1685086607.png" alt="">
The Spanning Tree resulting in a weight
of 4 is shown above.
</span></pre>
<p><span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;"><strong>Input:
</strong>2 1
0 1 5
<img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700343/Web/Other/944e4620-f860-4e62-aa2a-086f31e142cb_1685086607.png" alt="">
<strong>Output:</strong>
5
<strong>Explanation</strong>:
Only one Spanning Tree is possible
which has a weight of 5.
</span></pre>
<p>&nbsp;</p>
<p><span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;"><strong>Your task:</strong><br><span style="color: rgba(0, 0, 0, 0.87); background-color: rgb(255, 255, 255); --darkreader-inline-color: rgba(232, 230, 227, 0.87); --darkreader-inline-bgcolor: #181a1b;" data-darkreader-inline-color="" data-darkreader-inline-bgcolor="">Since this is a functional problem you don't have to worry about input, you just have to complete the function&nbsp;</span><span style="box-sizing: inherit; font-weight: bolder; color: rgba(0, 0, 0, 0.87); background-color: rgb(255, 255, 255); --darkreader-inline-color: rgba(232, 230, 227, 0.87); --darkreader-inline-bgcolor: #181a1b;" data-darkreader-inline-color="" data-darkreader-inline-bgcolor="">spanningTree()</span><span style="color: rgba(0, 0, 0, 0.87); background-color: rgb(255, 255, 255); --darkreader-inline-color: rgba(232, 230, 227, 0.87); --darkreader-inline-bgcolor: #181a1b;" data-darkreader-inline-color="" data-darkreader-inline-bgcolor="">&nbsp;which takes a number of vertices V</span><span style="box-sizing: inherit; font-weight: bolder; color: rgba(0, 0, 0, 0.87); background-color: rgb(255, 255, 255); --darkreader-inline-color: rgba(232, 230, 227, 0.87); --darkreader-inline-bgcolor: #181a1b;" data-darkreader-inline-color="" data-darkreader-inline-bgcolor="">&nbsp;</span><span style="color: rgba(0, 0, 0, 0.87); background-color: rgb(255, 255, 255); --darkreader-inline-color: rgba(232, 230, 227, 0.87); --darkreader-inline-bgcolor: #181a1b;" data-darkreader-inline-color="" data-darkreader-inline-bgcolor="">and</span><span style="box-sizing: inherit; font-weight: bolder; color: rgba(0, 0, 0, 0.87); background-color: rgb(255, 255, 255); --darkreader-inline-color: rgba(232, 230, 227, 0.87); --darkreader-inline-bgcolor: #181a1b;" data-darkreader-inline-color="" data-darkreader-inline-bgcolor="">&nbsp;</span><span style="color: rgba(0, 0, 0, 0.87); background-color: rgb(255, 255, 255); --darkreader-inline-color: rgba(232, 230, 227, 0.87); --darkreader-inline-bgcolor: #181a1b;" data-darkreader-inline-color="" data-darkreader-inline-bgcolor="">an adjacency list adj as input parameters and returns an integer denoting the sum of weights of the edges of the Minimum Spanning Tree. Here adj[i] contains vectors of size 2, where the first integer in that vector denotes the end of the edge and the second integer denotes the edge weight.</span><br></span></p>
<p><span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;"><strong>Expected Time Complexity:&nbsp;</strong>O(ElogV).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(V<sup>2</sup>).</span><br><span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;">&nbsp;</span></p>
<p><span style="font-size: 14pt; font-family: arial, helvetica, sans-serif;"><strong>Constraints:</strong><br>2 ≤ V ≤ 1000<br>V-1 ≤ E ≤ (V*(V-1))/2<br>1 ≤ w ≤ 1000<br>The graph is connected and doesn't contain self-loops &amp; multiple edges.</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Samsung</code>&nbsp;<code>Cisco</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Greedy</code>&nbsp;<code>Graph</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;