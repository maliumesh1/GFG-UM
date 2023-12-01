<h2><a href="https://www.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1">Check whether BST contains Dead End</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 20px;">Given a&nbsp;<a title="Binary Search Tree" href="https://www.geeksforgeeks.org/binary-search-tree-data-structure/" target="_blank" rel="noopener"><span class="wiseone-analysis-result wiseone-analysis-result-entity">Binary Search Tree</span></a> that contains <strong>unique <span class="wiseone-analysis-result wiseone-analysis-result-entity">positive integer</span> values greater than 0</strong>. The task is to complete the function <strong>isDeadEnd</strong> which returns <strong>true</strong> if&nbsp;the <span class="wiseone-analysis-result wiseone-analysis-result-entity">BST</span> contains a <strong>dead end </strong>else returns <strong>false</strong>. Here <strong>Dead End </strong>means a&nbsp;<span class="wiseone-analysis-result wiseone-analysis-result-entity"><strong>leaf</strong> node</span>, at which no other node can be inserted.</span></p>
<p><strong><span style="font-size: 20px;">Example 1:</span></strong></p>
<pre><span style="font-size: 20px;"><strong>Input :</strong>   
&nbsp;              8
             /   \ 
           5      9
         /  \     
        2    7 
       /
      1     
          
<strong>Output :</strong> <br>Yes
<strong>Explanation :</strong> <br>Node 1 is a Dead End in the given BST.</span></pre>
<p><strong><span style="font-size: 20px;">Example 2:</span></strong><span style="font-size: 20px;"> </span></p>
<pre><span style="font-size: 20px;"><strong>Input :</strong>     
&nbsp;             8
            /   \ 
           7     10
         /      /   \
        2      9     13

<strong>Output :</strong> <br>Yes
<strong>Explanation :</strong> <br>Node 9 is a Dead End in the given BST.<br></span></pre>
<p><span style="font-family: sans-serif; font-size: 20px; white-space: normal;"><strong>Your Task:</strong> You don't have to input or print anything. Complete the function <strong>isDeadEnd()&nbsp;</strong>which takes <strong>BST</strong> as input and returns a <span class="wiseone-analysis-result wiseone-analysis-result-entity">boolean value</span>.</span></p>
<p><span style="font-family: sans-serif; font-size: 20px; white-space: normal;"><strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">Expected Time</span> Complexity:</strong> <strong><span class="wiseone-analysis-result wiseone-analysis-result-entity">O(N)</span>,</strong> where <strong>N</strong> is the number of nodes in the <strong>BST.<br></strong></span><strong style="font-family: sans-serif; font-size: 20px; white-space: normal;">Expected <span class="wiseone-analysis-result wiseone-analysis-result-entity">Space Complexity</span>:</strong><span style="font-family: sans-serif; font-size: 20px; white-space: normal;">&nbsp;</span><strong style="font-family: sans-serif; font-size: 20px; white-space: normal;"><span class="wiseone-analysis-result wiseone-analysis-result-entity wiseone-analysis-result-repeat">O(N)</span></strong></p>
<p><span style="font-size: 20px;"><strong>Constraints:</strong></span><span style="font-size: 20px;"><br>1 &lt;= N &lt;= 1001<sup><br></sup>1 &lt;= Value of Nodes &lt;= 10001<sup><br></sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Binary Search Tree</code>&nbsp;<code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;