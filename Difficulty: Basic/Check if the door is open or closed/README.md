<h2><a href="https://www.geeksforgeeks.org/problems/check-if-the-door-is-open-or-closed2013/1?page=1&company=TCS&sortBy=submissions">Check if the door is open or closed</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given <strong>N</strong> doors and <strong>N</strong> persons. The doors are numbered from 1 to <strong>N</strong> and persons are given id’s numbered from 1 to <strong>N</strong>. Each door can have only two&nbsp;statuses i.e. open (1) or closed (0) . Initially all the doors have status closed. Find the final status of all the doors, when all the persons have changed&nbsp;the status of the doors of which they are authorized.&nbsp;i.e. if status open then change the status to closed and vice versa. A person with id ‘i’ is authorized to change the status of door numbered ‘j’ if ‘j’ is a multiple of ‘i’.<br>
<strong>Note:</strong> A person has to change the current status of all the doors for which he is authorized exactly once.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span><span style="font-size:18px"> </span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>3
<strong>Output:</strong></span>
<span style="font-size:18px">1 0 0 </span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">Initiall status of rooms - 0 0 0. 
Person with id 2 changes room 2 to open,
i.e. (0 1 0). Person with id 1 changes
room 1, 2, 3 status (1 0 1).
Person with id 3 changes room 3
status i.e. (1 0 0).</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span><span style="font-size:18px"> </span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>2
<strong>Output:</strong></span>
<span style="font-size:18px">1 0</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">Initiall status of rooms - 0 0. 
Person with id 2 changes room 2 to open,
i.e. (0 1). Person with id 1 changes
room 1, 2 status (1 0).
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>checkDoorStatus()</strong> which takes an Integer N as input and returns an array as the answer.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N*sqrt(N))<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 10<sup>4</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>TCS</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>Algorithms</code>&nbsp;