<h2><a href="https://www.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1">Floyd Warshall</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">The problem is to find the shortest distances between every pair of vertices in a given <strong>edge-weighted directed</strong>&nbsp;graph. The graph is represented as an adjacency matrix of size&nbsp;<strong>n*n</strong>. <strong>Matrix[i][j]</strong> denotes&nbsp;the weight of the edge from <strong>i to j.&nbsp;</strong>If&nbsp;<strong>Matrix[i][j]=-1,&nbsp;</strong>it means there is no&nbsp;edge from <strong>i to j.</strong><br><strong>Note : Modify</strong>&nbsp;the distances&nbsp;<strong>for every pair in-place.</strong></span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>matrix = [[0, 25],[-1, 0]]
<img style="height: 125px; width: 135px;" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106202714/WhatsAppImage20221106at82359PM.jpeg" alt="">
<strong>Output: </strong>[[0, 25],[-1, 0]]
<img style="height: 125px; width: 135px;" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106202714/WhatsAppImage20221106at82359PM.jpeg" alt="">
<strong>Explanation: </strong>The shortest distance between every pair is already given(if it exists).</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>matrix = [[0, 1, 43],[1, 0, 6],[-1, -1, 0]]
<img style="height: 164px; width: 176px;" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106203741/WhatsAppImage20221106at83711PM.jpeg" alt="">
<strong>Output: [[</strong>0, 1, 7],[1, 0, 6],[-1, -1, 0]]
<img style="height: 167px; width: 177px;" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106204057/WhatsAppImage20221106at84031PM.jpeg" alt="">
<strong>Explanation: </strong>We can reach 2 from 0 as 0-&gt;1-&gt;2 and the cost will be 1+6=7 which is less than 43.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(n<sup>3</sup>)<br><strong>Expected Space Complexity:&nbsp;</strong>O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n &lt;= 100<br>-1 &lt;= matrix[ i ][ j ] &lt;= 1000</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Samsung</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Graph</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;