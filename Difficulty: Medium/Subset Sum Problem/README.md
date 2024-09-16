<h2><a href="https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1">Subset Sum Problem</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array of non-negative integers, and a value <em>sum</em>, determine if there is a subset of the given set with sum equal to given <em>sum</em>.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong></span>: <span style="font-size: 18px;">n = 6, arr[] = {3, 34, 4, 12, 5, 2}, sum = 9
<strong>Output:</strong>&nbsp;1&nbsp;
<strong>Explanation</strong>: Here there exists a subset with sum = 9, 4+3+2 = 9.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong></span>: <span style="font-size: 18px;">n = 6, arr[] = {3, 34, 4, 12, 5, 2} , sum = 30
<strong>Output:</strong>&nbsp;0&nbsp;
<strong>Explanation</strong>: There is no subset with sum 30.</span></pre>
<p><br><span style="font-size: 18px;"><strong>Your Task:&nbsp;&nbsp;</strong><br>You don't need to read input or print anything. Your task is to complete the function <strong>isSubsetSum()</strong>&nbsp;which takes the array arr[], its size N<strong>&nbsp;</strong>and an integer <strong>sum </strong>as input parameters and returns boolean value true if there exists a subset with given sum and false otherwise. The driver code itself prints 1, if returned value is true and prints 0 if returned value is false.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(sum*n)<br><strong>Expected Auxiliary Space:</strong> O(sum*n)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n &lt;= 100</span><br><span style="font-size: 18px;">1&lt;= arr[i] &lt;= 100<br>1&lt;= sum &lt;= 10<sup>4</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Algorithms</code>&nbsp;