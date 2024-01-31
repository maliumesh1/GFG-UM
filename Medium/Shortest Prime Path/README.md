<h2><a href="https://www.geeksforgeeks.org/problems/shortest-prime-path--141631/1">Shortest Prime Path</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">You are given two four digit <span class="wiseone-analysis-result wiseone-analysis-result-entity">prime numbers</span> <strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">Num1</span> </strong>and <strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">Num2</span>.</strong>&nbsp;Find the distance of the <span class="wiseone-analysis-result wiseone-analysis-result-entity">shortest path</span> from <span class="wiseone-analysis-result wiseone-analysis-result-entity">Num1</span> to <span class="wiseone-analysis-result wiseone-analysis-result-entity">Num2</span> that can be attained by altering only single digit at a time such that every number that we get after changing a digit is a four digit <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">prime number</span> with no <span class="wiseone-analysis-result wiseone-analysis-result-entity">leading zeros</span>.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong></span>
<span style="font-size: 18px;">Num1 = 1033 
<span class="wiseone-analysis-result wiseone-analysis-result-entity">Num2</span> = 8179</span>
<span style="font-size: 18px;"><strong>Output: </strong></span><span style="font-size: 18px;">6</span>
<span style="font-size: 18px;"><strong>Explanation:</strong></span>
<span style="font-size: 18px;">1033 -&gt; 1<strong>7</strong>33 -&gt; <strong>3</strong>733 -&gt; 373<strong>9</strong> -&gt; 37<strong>7</strong>9 -&gt; <strong>8</strong>779 -&gt; 8<strong>1</strong>79.</span>
<span style="font-size: 18px;">There are only 6 steps reuired to reach Num2 from <span class="wiseone-analysis-result wiseone-analysis-result-entity">Num1</span>. </span>
<span style="font-size: 18px;">and all the intermediate numbers are 4 digit <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">prime numbers</span>.</span></pre>
<p><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong></span>
<span style="font-size: 18px;">Num1 = 1033 
<span class="wiseone-analysis-result wiseone-analysis-result-entity">Num2</span> = 1033</span>
<span style="font-size: 18px;"><strong>Output:</strong></span>
<span style="font-size: 18px;">0</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong>&nbsp;&nbsp;<br>You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>solve</strong>()&nbsp;which takes two integers&nbsp;Num1 and Num2&nbsp;as <span class="wiseone-analysis-result wiseone-analysis-result-entity">input parameters</span>&nbsp;and returns the distance of the <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">shortest path</span> from <span class="wiseone-analysis-result wiseone-analysis-result-entity">Num1</span> to <span class="wiseone-analysis-result wiseone-analysis-result-entity">Num2</span>.&nbsp;If it is unreachable then return -1.</span></p>
<p><span style="font-size: 18px;"><strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">Expected Time</span> Complexity:</strong> O(<span class="wiseone-analysis-result wiseone-analysis-result-entity">nlogn</span>)<br><strong>Expected Auxiliary Space:</strong> <span class="wiseone-analysis-result wiseone-analysis-result-entity">O(n)</span></span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1000&lt;=Num1,Num2&lt;=9999<br>Num1 and Num2 are <span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">prime numbers</span>.</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Adobe</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Prime Number</code>&nbsp;<code>Shortest Path</code>&nbsp;<code>BFS</code>&nbsp;<code>Algorithms</code>&nbsp;