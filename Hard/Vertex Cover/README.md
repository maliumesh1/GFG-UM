<h2><a href="https://www.geeksforgeeks.org/problems/vertex-cover/1">Vertex Cover</a></h2><h3>Difficulty Level : Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;"><strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">Vertex cover</span> </strong>of an <span class="wiseone-analysis-result wiseone-analysis-result-entity">undirected graph</span> is a list of vertices such that every vertex not in the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">vertex cover</span> shares their every edge with the vertices in the <strong><span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">vertex cover</span></strong>. <span class="wiseone-analysis-result wiseone-analysis-result-fact">In other words, for every edge in the graph, atleast one of the endpoints of the graph should belong to the <strong><span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">vertex cover</span></strong>.</span> You will be given an <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">undirected graph</span> <strong>G</strong>, and your task is to determine the <strong>smallest possible size </strong>of a <strong><span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">vertex cover</span>.</strong></span></p>
<p><strong><span style="font-size: 18px;">Example 1:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong><code>
N=5
M=6
edges[][]={{1,2}
           {4, 1},
           {2, 4},
           {3, 4},
           {5, 2},
           {1, 3}}
<strong>Output:</strong>
3
<strong>Explanation:</strong>
{2, 3, 4} </code>forms a <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">vertex cover</span><br>with the smallest size.</span></pre>
<p><strong><span style="font-size: 18px;"><code>Example 2:</code></span></strong></p>
<pre><span style="font-size: 18px;"><code><strong>Input:</strong>
N=2
M=1
edges[][]={{1,2}}</code> <br><strong>Output:</strong> <br>1 <br><strong>Explanation:</strong> <br>Include either node 1 or node 2<br>in the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">vertex cover</span>.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:&nbsp;&nbsp;</strong><br>You don't need to read input or print anything. Your task is to complete the function <strong>vertexCover()</strong> which takes the <strong>edge list </strong>and an integer <strong>n </strong>for the number of nodes of the graph<strong>&nbsp;</strong>as <span class="wiseone-analysis-result wiseone-analysis-result-entity">input parameters</span>&nbsp;and returns the <strong>size of the smallest possible <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">vertex cover</span></strong>.</span></p>
<p><span style="font-size: 18px;"><strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">Expected Time</span> Complexity:</strong> O(M*N<sup>2</sup>log(N))<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(N<sup>2</sup>)</span><br><br>&nbsp;<span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= N &lt;= 16<br>1 &lt;= M &lt;= N*(N-1)/2<br>1 &lt;= edges[i][0], edges[i][1] &lt;= N</span></p></div>