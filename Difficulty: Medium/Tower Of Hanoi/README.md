<h2><a href="https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1">Tower Of Hanoi</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">The <a href="https://en.wikipedia.org/wiki/Tower_of_Hanoi">tower of Hanoi</a></span> <span style="font-size: 18px;">is a famous puzzle where we have three rods and <strong>n</strong> disks. The objective of the puzzle is to move the entire stack to another rod. You are given the number of discs <strong>n</strong>. Initially, these discs are in the rod 1. You need to print all the steps of discs movement so that all the discs reach the 3<sup>rd</sup> rod. Also, you need to find the total moves.</span></p>
<p><span style="font-size: 18px;">You only need to complete the function&nbsp;<strong>toh()</strong> that takes following parameters: <strong>n</strong> (number of discs),&nbsp;<strong>from</strong>&nbsp;(The rod number from which we move the disc),&nbsp;<strong>to</strong>&nbsp;(The rod number to which we move the disc),&nbsp;<strong>aux</strong>&nbsp;(The rod that is used as an auxiliary rod) and prints the required moves inside function body (See the example for the format of the output) as well as return the count of total moves made.</span></p>
<p><span style="font-size: 18px;"><strong>Note: </strong>The discs are arranged such that the<strong> top disc is numbered 1 </strong>and the<strong> bottom-most disc is numbered n</strong>. Also, all the discs have <strong>different sizes</strong> and a bigger disc <strong>cannot</strong> be put on the top of a smaller disc. Refer the provided link to get a better clarity about the puzzle.</span></p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>n = 2
<strong>Output:
</strong>move disk 1 from rod 1 to rod 2
move disk 2 from rod 1 to rod 3
move disk 1 from rod 2 to rod 3
3<strong>
Explanation: </strong>For N=2 , steps will be as follows in the example and total 3 steps will be taken.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>n = 3
<strong>Output:
</strong>move disk 1 from rod 1 to rod 3
move disk 2 from rod 1 to rod 2
move disk 1 from rod 3 to rod 2
move disk 3 from rod 1 to rod 3
move disk 1 from rod 2 to rod 1
move disk 2 from rod 2 to rod 3
move disk 1 from rod 1 to rod 3
7<strong>
Explanation: </strong>For N=3 , steps will be as follows in the example and total 7 steps will be taken.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(2<sup>n</sup>).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(n).</span></p>
<p><strong><span style="font-size: 18px;">Constraints:</span></strong><br><span style="font-size: 18px;">0 &lt;= n &lt;= 16</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Recursion</code>&nbsp;<code>Algorithms</code>&nbsp;