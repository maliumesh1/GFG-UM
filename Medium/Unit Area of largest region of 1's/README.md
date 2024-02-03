<h2><a href="https://www.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1">Unit Area of largest region of 1's</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a grid of dimension <strong>n</strong>x<strong>m&nbsp;</strong>containing 0s and 1s. Find the unit area of the largest region of 1s.<br>
Region of 1's is a group of 1's connected 8-directionally (horizontally, vertically, diagonally).</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>grid = {{1,1,1,0},{0,0,1,0},{0,0,0,1}}
<strong>Output: </strong>5
<strong>Explanation: </strong>The grid is-
<span style="color: rgb(255, 0, 0); --darkreader-inline-color: #ff1a1a;" data-darkreader-inline-color="">1 1 1</span> 0
0 0 <span style="color: rgb(255, 0, 0); --darkreader-inline-color: #ff1a1a;" data-darkreader-inline-color="">1 </span>0
0 0 0 <span style="color: rgb(255, 0, 0); --darkreader-inline-color: #ff1a1a;" data-darkreader-inline-color="">1
</span>The largest region of 1's is colored
in orange.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>grid = {{0,1}}
<strong>Output: </strong>1
<strong>Explanation: </strong>The grid is-
0 <span style="color: rgb(255, 0, 0); --darkreader-inline-color: #ff1a1a;" data-darkreader-inline-color="">1
</span>The largest region of 1's is colored in 
orange.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anyhting. Your task is to complete the function&nbsp;<strong>findMaxArea()&nbsp;</strong>which takes grid as input parameter and returns the area of the largest region of 1's.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n*m)<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(n*m)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n, m ≤ 500</span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Samsung</code>&nbsp;<code>Ola Cabs</code>&nbsp;<code>Google</code>&nbsp;<code>Salesforce</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>DFS</code>&nbsp;<code>Graph</code>&nbsp;<code>BFS</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;