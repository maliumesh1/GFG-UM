<h2><a href="https://www.geeksforgeeks.org/problems/subset-sums2234/1">Subset Sums</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><div class="entry-content">
<p><span style="font-size: 18px;">Given a&nbsp;list <strong>arr</strong> of <strong>n</strong> integers, return sums of all subsets in it.&nbsp;</span><span style="background-color: #ffffff; color: #273239; font-family: Nunito, sans-serif; font-size: 18px; letter-spacing: 0.162px;">Output sums can be printed in <strong>any&nbsp;order</strong>.</span></p>
<p><strong><span style="font-size: 18px;">Examples:<br></span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 2, arr[] = {2, 3}</span>
<span style="font-size: 18px;"><strong>Output: </strong>0 2 3 5</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>When no elements is taken then Sum = 0. When only 2 is taken then Sum = 2. When only 3 is taken then Sum = 3. When element 2 and 3 are taken then Sum = 2+3 = 5.</span></pre>
<p><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 3, arr = {1, 2, 1}</span>
<span style="font-size: 18px;"><strong>Output: </strong>0 1 1 2 2 3 3 4<strong><br></strong></span> </pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong>&nbsp;&nbsp;<br>You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>subsetSums</strong>() which takes a list/vector and an integer <strong>n</strong> as an input parameter and returns the list/vector of all the subset sums.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(2<sup>n</sup>)<br><strong>Expected Auxiliary Space:</strong> O(2<sup>n</sup>)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n &lt;= 15<br>0 &lt;= arr[i] &lt;= 10<sup>4</sup></span></p>
</div></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Recursion</code>&nbsp;<code>Algorithms</code>&nbsp;