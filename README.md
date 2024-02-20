# Project 2 Final Report: Comparing Knapsacks Experiment
<hr>

## Design description
<dl>
<dt>Angela Fujihara, Project Manager</dt>
<dd>Contributions:
    <ul>
        <li>Project planning, weekly meeting facilitator</li>
        <li>FracK brute force algorithm</li>
        <li>FracK greedy algorithm</li>
        <li>Final report outline</li>
        <li>Co-authored the CSV reader class</li>
    </ul>
</dd>

<dt>Cheryl Moser, Version Control Manager</dt>
<dd>Contributions:
    <ul>
        <li>Repository management</li>
        <li>csv output</li>
        <li>generation of 3 additional csv files</li>
        <li>K01 greedy algorithm</li>
        <li>JUnit tests for K01 greedy</li>
        <li>Plot generation via JFreeChart</li>
        <li>Translate final report to markdown file</li>
    </ul>
</dd>

<dt>Mycole Brown, Development Manager</dt>
<dd>Contributions:
    <ul>
        <li>Co-authored the CSV reader class</li>
        <li>K01 dynamic programming algorithm</li>
        <li>FracK dynamic programming algorithm</li>
    </ul>
</dd>

<dt>Ashtin Rivada, Design Manager</dt>
<dd>Contributions:
    <ul>
        <li>UML</li>
        <li>Knapsack object class</li>
        <li>K01 brute force algorithm</li>
        <li>JUnit tests for K01 brute force</li>
        <li>Design review of deliverables</li>
    </ul>
</dd>
</dl>

<hr>

## Project Description
<p>Design choices. Include brief description of design choices specific to our project. 
Discuss reason, thought process behind specific design choices. Discuss reasoning 
for how code was organized.</p>

<hr>

## Plot Charts and Performance Analysis:
<img src = "images/fracK_bruteForce.jpg" width="600">
<img src = "images/fracK_greedy.jpg" width="600">
<img src = "images/fracK_dp.jpg" width="600">
<img src = "images/k01_bruteForce.jpg" width="600">
<img src = "images/k01_greedy.jpg" width="600">
<img src = "images/k01_dp.jpg" width="600">

<ul>
    <li>Fractional Dynamic VS 01 Dynamic
    <li>Fractional Dynamic VS Fractional Greedy
    <li>Fractional Dynamic VS 01Greedy
    <li>Fractional Dynamic VS Fractional Brute
    <li>Fractional Dynamic VS 01 Brute
    <li>Fractional Greedy VS Fractional Brute
    <li>Fractional Greedy VS 01 Brute
    <li>Fractional Greedy VS 01 Greedy
    <li>Fractional Brute VS 01 Greedy
    <li>Fractional Brute VS 01 Brute
    <li>Fractional Brute VS 01 Dynamic
    <li>01 Dynamic VS 01 Greedy
    <li>01 Dynamic VS Fractional Greedy
    <li>01 Dynamic VS 01 Brute
    <li>01 Greedy VS 01 Brute
</ul>

## Theoretical results vs empirical results
Did our findings meet our theoretical expectations?<br>
Which algorithm performed best for which knapsack?<br>
01 Knapsack best algorithm: Why was this the best performing algorithm?<br>
Fractional Knapsack best algorithm: Why was this the best performing algorithm?<br>

## Algorithm development

### [algorithm 1 title]
<cite>Author: Angela Fujihara</cite>
<dl>
<dt>Description</dt>
<dd></dd>
<dt>Methods</dt>
<dd></dd>
<dt>Analysis</dt>
<dd></dd>

### [algorithm 2 title]
<dt>Description</dt>
<dd></dd>
<dt>Methods</dt>
<dd></dd>
<dt>Analysis</dt>
<dd></dd>
</dl>

### Greedy method for the knapsack 0-1 problem
<cite>Author: Cheryl Moser</cite>
<dl>
<dt>Description</dt>
    <dd>
    This method is a modified version of the greedy method for the fractional knapsack. 
    It is not guaranteed to return optimal results, especially with larger input arrays. 
    The Junit tests associated with this method confirm that with an input array of size 30, 
    it does not report the optimal solution; however, with an array of size 5, it did. 
    In designing the tests, an online calculator (https://augustineaykara.github.io/Knapsack-Calculator/) 
    was used to find the actual optimized profit and weight for the test input. The 
    greedy method for this problem is not optimal because it does not consider 
    combinations of items; instead, it puts items into the knapsack sequentially by 
    highest value until the weight limit is met.
    </dd>

<dt>Methods</dt>
    <dd>
    A priority queue was used in combination with a custom comparator for holding 
    value-weight pairs in decreasing order by value. A hash set was used to store 
    the items that were added to the knapsack. The method iterates through the priority 
    queue, removing the highest value entry first and adding it to the knapsack until 
    the queue is empty, or until the weight limit is met.
    </dd>

<dt>Analysis</dt>
<dd>
    The time complexity of this method is O(n log n). This is due to the dequeue 
    operation nested within the priority queue iterator operation. The iterator operation 
    depends on the length of the priority queue, or the weight limit, either of which 
    can be of any size; the dequeue operation involves a re-ordering of the queue, 
    which is O(log n) due to the halving operations done on the binary heap.
</dd>
</dl>

### [algorithm title]
<cite>Author: Ashtin Rivada</cite>
<dl>
<dt>Description</dt>
<dd></dd>
<dt>Methods</dt>
<dd></dd>
<dt>Analysis</dt>
<dd></dd>
</dl>

### [algorithm 1 title]
<cite>Author: Mycole Brown</cite>
<dl>
<dt>Description</dt>
<dd></dd>
<dt>Methods</dt>
<dd></dd>
<dt>Analysis</dt>
<dd></dd>

### [algorithm 2 title]
<dt>Description</dt>
<dd></dd>
<dt>Methods</dt>
<dd></dd>
<dt>Analysis</dt>
<dd></dd>
</dl>

Were there any other algorithms that could have solved these problems? Such as divide-and-conquer?

<hr>

## Purpose: 
To practice and demonstrate proficiency in creating brute force, greedy 
and dynamic programming algorithms for the fractional knapsack problem and the 01 
Knapsack problem.

<hr>

## Skills Used: Java programming
Knowledge Goals: Greedy, Dynamic Programming and their applications.
See <a href = "./PROJECTSPEC.md">PROJECTSPEC.md</a> for more info regarding
this project's specifications.

<hr>

## How to run this application
This application uses external libraries that must be added to the project's 
dependency list. Download the JFreeChart library 
<a href = "https://www.jfree.org/jfreechart/download/">here</a>, and download the 
guava-31.0.1-jre.jar file <a href = "https://repo1.maven.org/maven2/com/google/guava/guava/31.0.1-jre/">here</a>. 
Add the jar files to the project structure.

There are two knapsack packages, each with its own Main.java file. Run both of 
those to see their respective console output.
