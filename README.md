# Project 2 Final Report: Comparing Knapsacks Experiment
<hr>

# Table of Contents
1. [How to run this application](#how-to-run-this-application-a-namehowa)
2. [Authors and contributions](#authors-and-contributions-a-nameauthorsa)
3. [Project description](#project-description-a-namedescriptiona)
    1. [UML diagram](#uml-diagram) 
4. [Plot charts](#plot-charts)
5. [Performance analysis](#performance-analysis)
6. [Results: theoretical vs. empirical](#theoretical-results-vs-empirical-results)
7. [Best performance](#which-algorithm-performed-best-for-which-knapsack)
8. [Algorithm development](#algorithm-development)
9. [Other algorithms for the knapsack problem](#were-there-any-other-algorithms-that-could-have-solved-these-problems-such-as-divide-and-conquer)
<hr>

## How to run this application <a name="how"></a>
This application uses external libraries that must be added to the project's
dependency list.

#### Add jar files:
<ul>
    <li>Download the JFreeChart library
<a href = "https://www.javatpoint.com/jfreechart-installation">here</a></li>
    <li>Download the
guava-31.0.1-jre.jar file <a href = "https://repo1.maven.org/maven2/com/google/guava/guava/31.0.1-jre/">here</a></li>
    <li>Add all of the jar files to the project structure</li>
</ul>

#### Run both driver classes:
There are two knapsack packages, one for knapsack 0-1; one for fractional knapsack.
Each has its own Main.java class. Run both to see their respective console output.
<hr>

## Authors and Contributions <a name="authors"></a>
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
        <li>Project design & UML diagram</li>
        <li>Knapsack object class</li>
        <li>K01 brute force algorithm</li>
        <li>JUnit tests for K01 brute force</li>
        <li>Co-authored CSV reader class</li>
        <li>Design review of deliverables</li>
    </ul>
</dd>
</dl>

<hr>

## Project Description <a name="description"></a>
<cite>Author: Ashtin Rivada</cite>

For the structure we chose to use the template you provided for us in the project
as each one of us would have our own classes that the others shouldn’t be making
any edits on, so this would help us avoid merge conflicts where we could. We also
came to an agreement that having the knapsack saved as an object would be the best
approach, as we could input our data and manipulate it to fit each of our methods
parameters. We added a ProjectTools package that holds any other classes, that
aren't the knapsack classes themselves, to use in our project. As for graphing,
unlike the last project, we decided to try and make the graphs in java ourselves
so we wouldn't need to use anything other than intelliJ to complete the project.

As for the metric we chose to use runtime again. We made this choice because it
was an easy implementation since we used it for our last project, and also because
the runtime of the algorithm is easy to understand, explain, and can directly show
how efficient each algorithm is.  As for how our results will be displayed we have
each of our methods printing out what weights and values were used, what knapsack
number it is, the weight capacity, the total weight that we used, and the maximum
profit onto the console while it is running. Then we have our class PlotGenerator
that will display the runtimes as a graph, to do this we used a Java library called
JFreeChart.

### UML Diagram

<img src = "images/KnapsackExperimentUML.jpeg">

<hr>

## Plot Charts
<cite>Author: Cheryl Moser</cite>

<img src = "images/fracK_bruteForce.jpg" width="600">
<img src = "images/fracK_greedy.jpg" width="600">
<img src = "images/fracK_dp.jpg" width="600">
<img src = "images/k01_bruteForce.jpg" width="600">
<img src = "images/k01_greedy.jpg" width="600">
<img src = "images/k01_dp.jpg" width="600">
<hr>

## Performance Analysis

<dl>
    <dt>Fractional Dynamic VS 01 Dynamic</dt>
    <dd><cite>Author: Mycole Brown</cite><br><br>
    K01 Dynamic Programming method is inconclusive.
    </dd>
</dl>
<hr>
<dl>
    <dt>Fractional Dynamic VS Fractional Greedy</dt>
    <dd><cite>Author: Mycole Brown</cite><br><br>
    The graph for the Fractional Greedy algorithm shows a runtime that starts high 
    and quickly drops, stabilizing at a low level as the input array size increases.
    <br><br>
    The Fractional Dynamic algorithm graph also starts high and decreases rapidly, 
    but appears to stabilize slightly higher than the Greedy algorithm.
    </dd>
</dl>
<hr>
<dl>
    <dt>Fractional Dynamic VS 01Greedy</dt>
    <dd><cite>Author: Mycole Brown</cite><br><br>
    The 0/1 Greedy algorithm graph shows a sharp decrease and then stabilizes at 
    a higher time than the Fractional Dynamic algorithm, suggesting that the Fractional 
    Dynamic is more efficient for larger input sizes.
    </dd>
</dl>
<hr>
<dl>
    <dt>Fractional Dynamic VS Fractional Brute</dt>
    <dd><cite>Author: Mycole Brown</cite><br><br>
    The Fractional Brute Force graph shows a very steep climb as the input size 
    increases, indicating a significant increase in runtime, likely exponential.
    <br><br>
    In contrast, the Fractional Dynamic algorithm maintains a lower and more stable 
    runtime, even as the input size grows, marking it as significantly more efficient 
    than the Brute Force method.
    <br><br>
    From these comparisons, we can say that the Fractional Dynamic algorithm is 
    more efficient than the Fractional Greedy and 0/1 Greedy algorithms for larger 
    input sizes and much more efficient than the Fractional Brute Force algorithm, 
    which has a runtime that increases exponentially with the input size. The Greedy 
    versions of the algorithms are usually faster for smaller input sizes but do not 
    scale as well as the Dynamic version when the input size gets larger.
    </dd>
</dl>
<hr>
<dl>
    <dt>Fractional Dynamic VS 01 Brute</dt>
    <dd><cite>Author: Angela Fujihara</cite></dd>

--------Brute Force 0/1 Knapsack--------
    <dt>How it Works:</dt>
    <dd>This method checks every possible combination of items, making
    it very slow, especially with larger datasets.
    </dd>
    <b>Speed</b>
    <ul>
        <li>csv file with 5 items - Approximate between 60k-70k microseconds</li>
        <li>csv file with 10 items - Approximately between 0-10k microseconds</li>
        <li>csv file with 15 items - Approximately between 20k-30k microseconds</li>
        <li>csv file with 20 items - Approximately between 170k-180k microseconds</li>
        <li>csv file with 25 items is off the chart</li>
        <li>csv file with 30 items is off the chart</li>
    </ul>
    <dt>Time Complexity:</dt>
    <dd>
    The time complexity of Brute Force 0/1 Knapsack is exponential,
    typically represented as O(2<sup>n</sup>), where 'n' is the number of items.
    This means that as 'n' increases, the time taken to find the optimal solution
    grows exponentially.
    </dd>
    <dt>Execution Time:</dt>
    <dd>
    With small sets of items (like 5 or 10), it's relatively fast,
    taking anywhere from no time at all to about 10 milliseconds. But as the number
    of items increases, it can get really slow. For sets of 15 to 20 items, it takes
    between about 20,000 to 180,000 microseconds. And for sets of 25 or 30 items,
    it gets so slow that we can't even measure it accurately.
    </dd>
    --------Fractional Dynamic Knapsack:--------
    <dt>How it Works:</dt>
    <dd>
    This method sorts items by value-to-weight ratios before picking them,
    which makes it faster than brute force.
    </dd>
    <b>Speed</b>
    <ul>
        <li>csv file with 5 items - Approximate between 4500-4750k microseconds</li>
        <li>csv file with 10 items - Approximately between 250-500 microseconds</li>
        <li>csv file with 15 items - Approximately between 250-500 microseconds</li>
        <li>csv file with 20 items - Approximately between 500-750 microseconds</li>
        <li>csv file with 25 items - Approximately between 500-750 microseconds</li>
        <li>csv file with 30 items - Approximately between 500-750 microseconds</li>
    </ul>
    <dt>Time Complexity:</dt>
    <dd>
    The time complexity of Fractional Dynamic Knapsack is O(n log n),
    where 'n' is the number of items. This complexity arises from sorting the items
    by their value-to-weight ratios before selecting them, which enhances efficiency
    compared to the brute force approach.
    </dd>
    <dt>Execution Time:</dt>
    <dd>
    Unlike brute force, Fractional Dynamic Knapsack stays consistently
    fast no matter how many items you have. For sets of 5 to 30 items, it takes
    about 250 to 500 microseconds most of the time. This shows that it handles
    larger sets of items without slowing down much.
    </dd>
    <dt>Conclusion:</dt>
    <dd>
    Comparing the two methods using the provided data and considering their time
    complexities, Fractional Dynamic Knapsack remains the preferred choice. While
    Brute Force 0/1 Knapsack struggles with larger datasets due to its exponential
    time complexity, Fractional Dynamic Knapsack maintains a more consistent and
    efficient performance, demonstrating its superiority in handling larger sets
    of items.
    </dd>
</dl>
<hr>
<dl>
    <dt>Fractional Greedy VS Fractional Brute</dt>
    <dd><cite>Author: Angela Fujihara</cite></dd>
    ----------Greedy Fractional Knapsack--------
    <dt>How it Works:</dt>
    <dd>Greedy Fractional Knapsack selects items based on their value-to-weight 
    ratio, choosing the most valuable items first until the knapsack is full.
    </dd>
    <b>Speed</b>
    <ul>
        <li>csv file with 5 items - Approximate between 1500-1600 microseconds</li>
        <li>csv file with 10 items - Approximately between 0-100 microseconds</li>
        <li>csv file with 15 items - Approximately between 0-100 microseconds</li>
        <li>csv file with 20 items - Approximately between 0-100 microseconds</li>
        <li>csv file with 25 items - Approximately between 0-100 microseconds</li>
        <li>csv file with 30 items - Approximately between 0-100 microseconds</li>
    </ul>
    <dt>Time Complexity:</dt>
    <dd>
    Greedy Fractional Knapsack has a time complexity of O(n log n), meaning it's 
    pretty efficient even for large datasets. This complexity arises from sorting the 
    items by their value-to-weight ratios before selecting them.
    </dd>

----------Brute Force Fractional Knapsack--------
<dt>How it Works:</dt>
<dd>
Brute Force Fractional Knapsack considers all possible combinations
of items to find the best solution, which can take a long time.
</dd>
<b>Speed</b>
<ul>
<li>csv file with 5 items - Approximate between 0-5000 microseconds</li>
<li>csv file with 10 items - Approximately between 0-5000 microseconds</li>
<li>csv file with 15 items - Approximately between 25k-30k microseconds</li>
<li>csv file with 20 items - Approximately between 120k-125k microseconds</li>
<li>csv file with 25 items - off the chart</li>
<li>csv file with 30 items - off the chart</li>
</ul>
<dt>Time Complexity:</dt>
<dd>
The time complexity of Brute Force Fractional Knapsack is exponential, typically
represented as O(2<sup>n</sup>), where 'n' is the number of items. This means
that as 'n' increases, the time taken to find the optimal solution grows exponentially.
</dd>
<dt>Conclusion:</dt>
<dd>
The Greedy Fractional Knapsack algorithm works better overall. It's fast and
consistent across different dataset sizes, whereas the Brute Force approach
slows down a lot as the dataset gets bigger. Additionally, Greedy Fractional
Knapsack's time complexity suggests it's efficient even for larger datasets,
making it a preferable choice in most cases.
</dd>
</dl>
<hr>
<dl>
    <dt>Fractional Greedy VS 01 Brute</dt>
    <dd><cite>Author: Angela Fujihara</cite></dd>
----------Brute Force 0/1 Knapsack--------
<dt>How it Works:</dt>
<dd>
Brute Force 0/1 Knapsack checks every possible combination
of items, which can take a lot of time, especially with more items.
</dd>
<b>Speed</b>
<ul>
<li>csv file with 5 items - Approximate between 60k-70k microseconds</li>
<li>csv file with 10 items - Approximately between 0-10k microseconds</li>
<li>csv file with 15 items - Approximately between 20k-30k microseconds</li>
<li>csv file with 20 items - Approximately between 170k-180k microseconds</li>
<li>csv file with 25 items is off the chart</li>
<li>csv file with 30 items is off the chart</li>
</ul>
<dt>Time Complexity:</dt>
<dd>
The time complexity of Brute Force 0/1 Knapsack is exponential,
typically represented as O(2<sup>n</sup>), where 'n' is the number of items. This means
that as 'n' increases, the time taken to find the optimal solution grows exponentially.
</dd>
----------Greedy Fractional Knapsack:--------
<dt>How it Works:</dt>
<dd>
Greedy Fractional Knapsack picks items with the best value-
to-weight ratio first until the knapsack is full.
</dd>
<b>Speed</b>
<ul>
<li>csv file with 5 items - Approximate between 1500-1600 microseconds</li>
<li>csv file with 10 items - Approximately between 0-100 microseconds</li>
<li>csv file with 15 items - Approximately between 0-100 microseconds</li>
<li>csv file with 20 items - Approximately between 0-100 microseconds</li>
<li>csv file with 25 items - Approximately between 0-100 microseconds</li>
<li>csv file with 30 items - Approximately between 0-100 microseconds</li>
</ul>
<dt>Time Complexity:</dt>
<dd>
Greedy Fractional Knapsack has a time complexity of O(n log n),
making it efficient even for larger datasets. This complexity arises from sorting
the items by their value-to-weight ratios before selecting them.
</dd>
<dt>Conclusion:</dt>
<dd>
Based on the data and considering how long they take, Greedy
Fractional Knapsack is faster. It stays speedy across different dataset sizes,
while Brute Force 0/1 Knapsack slows down a lot as the dataset gets bigger.
Greedy Fractional Knapsack seems like a better choice when you need a quick
and decent solution. But keep in mind, the Greedy approach isn't always perfect.
Sometimes it might not give the best answer, especially if the problem is more
complicated. So, while Greedy Fractional Knapsack is fast and handy, it might
not always give you the absolute best solution.
</dd>
</dl>
<hr>
<dl>
    <dt>Fractional Greedy VS 01 Greedy</dt>
    <dd><cite>Author: Angela Fujihara</cite></dd>
----------Greedy Fractional Knapsack--------
<dt>How it Works:</dt>
<dd>
Greedy Fractional Knapsack selects items based on their
value-to-weight ratio, prioritizing those with the best ratio until the knapsack is full.
</dd>
<b>Speed</b>
<ul>
<li>For 5 items: Around 1500-1600 microseconds</li>
<li>For 10 items: Roughly 0-100 microseconds</li>
<li>For 15 items: Also approximately 0-100 microseconds</li>
<li>For 20 items: Similarly, around 0-100 microseconds</li>
<li>For 25 items: Consistently about 0-100 microseconds</li>
<li>For 30 items: Maintaining around 0-100 microseconds</li>
</ul>
<dt>Time Complexity:</dt>
<dd>
Greedy Fractional Knapsack has a time complexity of O(n log n),
ensuring efficiency even with larger datasets. It sorts items by their value-to-weight
ratios before selection.
</dd>
----------Greedy 0/1 Knapsack--------
<dt>How it Works:</dt>
<dd>
Greedy 0/1 Knapsack prioritizes the most valuable items first,
assessing whether each fits entirely into the knapsack.
</dd>
<b>Speed</b>
<ul>
<li>For 5 items: Approximately 16,000-17,000 microseconds</li>
<li>For 10 items: Typically between 0-1000 microseconds</li>
<li>For 15 items: Similarly, around 0-1000 microseconds</li>
<li>For 20 items: Also about 0-1000 microseconds</li>
<li>For 25 items: Usually between 1000-2000 microseconds</li>
<li>For 30 items: Consistently between 1000-2000 microseconds</li>
</ul>
<dt>Time Complexity:</dt>
<dd>
Greedy 0/1 Knapsack's time complexity depends on implementation
but generally handles larger datasets reasonably well. While it doesn't sort
items like the Fractional Knapsack, it maintains efficiency without significant slowdowns.
</dd>
<dt>Conclusion:</dt>
<dd>
Considering the execution times and time complexities, both Greedy Fractional
Knapsack and Greedy 0/1 Knapsack perform well, particularly with smaller datasets.
Greedy Fractional Knapsack exhibits consistent speed across all dataset sizes,
while Greedy 0/1 Knapsack slightly increases in time with larger datasets.
Overall, Greedy Fractional Knapsack appears to handle larger datasets more efficiently,
making it preferable in many cases.
</dd>
</dl>
<hr>
<dl>
    <dt>Comparison Note for Brute Force</dt>
    <dd>
    The runtimes for both brute force methods up to knapsack #4 are A LOT less 
    than 5,000,000 Microseconds, but due to the exponentially high runtime of knapsack 
    #6 it is hard to say what the number actually is)
    </dd>
<hr>
    <dt>01 dynamic vs 01 greedy</dt>
    <dd><cite>Author: Ashtin Rivada</cite><br><br>
    K01 Dynamic Programming method is inconclusive.
    </dd>
<hr>
    <dt>Fractional Brute vs 01 Greedy</dt>
    <dd><cite>Author: Ashtin Rivada</cite>
    <ul>
    ----------01 Greedy Speeds----------
        <li>Knapsack #1: 9,500 Microseconds</li>
        <li>Knapsack #2: about 650 Microseconds</li>
        <li>Knapsack #3: about 800 Microseconds</li>
        <li>Knapsack #4: about 1,100 Microseconds</li>
        <li>Knapsack #5: about 1,250 Microseconds</li>
        <li>Knapsack #6: about 1,400 Microseconds</li>
    </ul>
    <ul>
    ----------Fractional Brute Speeds----------
        <li>Knapsack #1: Less than 5,000,000 Microseconds</li>
        <li>Knapsack #2:  Less than 5,000,000 Microseconds</li>
        <li>Knapsack #3:  Less than 5,000,000 Microseconds</li>
        <li>Knapsack #4:  Less than 5,000,000 Microseconds</li>
        <li>Knapsack #5:  about 5,000,000 Microseconds</li>
        <li>Knapsack #6: about 130,000,000 Microseconds</li>
    </ul>
    </dd>
    <dt>Comparison</dt>
    <dd>
    We can see there is a clear winner in which method ran faster. That would be 
    the Greedy for the 01 Knapsack. It is very fast and does not change the runtime 
    much, even for the bigger datasets that Brute force takes forever to finish. 
    I am assuming the first knapsack for 01 Greedy took much longer than the rest 
    probably due to all the initializations going through for the first call but 
    those would not have to be made for the following tests as they were made in 
    the first and would just need to be updated.
    </dd>
</dl>
<hr>
<dl>
    <dt>Fractional Brute vs 01 Brute</dt>
    <dd><cite>Author: Ashtin Rivada</cite><br><br>
    ----------01 Brute Speeds----------
    <ul>
        <li>Knapsack #1:  Less than 2,500,000 Microseconds</li>
        <li>Knapsack #2:  Less than 2,500,000 Microseconds</li>
        <li>Knapsack #3:  Less than 2,500,000 Microseconds</li>
        <li>Knapsack #4:  Less than 2,500,000 Microseconds</li>
        <li>Knapsack #5: about 2,700,000 Microseconds</li>
        <li>Knapsack #6: about 54,000,000 Microseconds</li>
    </ul>
        ----------Fractional Brute Speeds----------
    <ul>
        <li>Knapsack #1: Less than 5,000,000 Microseconds</li>
        <li>Knapsack #2:  Less than 5,000,000 Microseconds</li>
        <li>Knapsack #3:  Less than 5,000,000 Microseconds</li>
        <li>Knapsack #4:  Less than 5,000,000 Microseconds</li>
        <li>Knapsack #5:  about 5,000,000 Microseconds</li>
        <li>Knapsack #6: about 130,000,000 Microseconds</li>
    </ul>
    <dt>Comparison</dt>
    <dd>
    Both the Brute force method for the 01 Knapsack and for the Fractional Knapsack 
    look similar. Each method can solve up to size 20 pretty fast, remaining very 
    close to the x-axis. Then when we start on Knapsack #5 which has 25 items we 
    start to see a slight increase for both methods for their runtime. With the 
    01 knapsack reaching about 2,700,000 microseconds and the fractional reaching 
    about 5,000,000. Finally we get to knapsack #6 which has 30 items so the number 
    of combinations increases exponentially. We have the 01 knapsack running at 
    about 54,000,000 and fractional running at about 130,000,000. We can see here 
    that once the brute force reaches a certain point it takes a very long time 
    to finish. The 01 brute force ran about 2x as fast as the fractional probably 
    due to not having to ratio any items to make sure all of the maximum weight 
    was taken up.  With this being said The brute force approach would not be ideal 
    for larger dataSets as the runtime would increase exponentially.
    </dd>
</dl>
<hr>
<dl>
    <dt>Fractional Brute vs 01 Dynamic</dt>
    <dd><cite>Author: Ashtin Rivada</cite><br><br>
    K01 Dynamic Programming method is inconclusive.
    </dd>
</dl>
<hr>
<dl>
    <dt>01 Dynamic VS Fractional Greedy</dt>
    <dd><cite>Author: Cheryl Moser</cite><br><br>
    K01 Dynamic Programming method is inconclusive, though it currently shows
    as being one of the best performers of the bunch with even the largest input size
    keeping a runtime of under 24 microseconds. FracK Greedy seems to be the clear
    winner here, with very low runtimes that hold steady across all input sizes.
</dd>
</dl>
<hr>
<dl>
    <dt>01 Dynamic VS 01 Brute</dt>
    <dd><cite>Author: Cheryl Moser</cite><br><br>
    K01 Dynamic Programming method is inconclusive, though it currently shows
    as being one of the best performers of the bunch with even the largest input size
    keeping a runtime of under 24 microseconds. 01 Brute shows a steep exponential
    curve, as expected.
    </dd>
</dl>
<hr>
<dl>
<dt>01 Greedy VS 01 Brute</dt>
    <dd><cite>Author: Cheryl Moser</cite><br><br>
    It seems that several algorithm plots begin with an outlier point. I suspect 
    this is due to a slowdown caused by the initialization that happens as the code 
    enters a new algorithm class. I confirmed that the array size of 5 is not the issue 
    by placing the array of size 30 into the first plot point generation, and the array 
    of size 5 into the last. The graph still showed that first outlier point. I
    conducted this test for the K01 Greedy algorithm only.
    <br><br>
    Discarding the first plot point, greedy performed better across the board in this 
    comparison, holding steady between 800 - 2100 ms for all array sizes.
    The greedy plot appears to be a curve resembling an O(n log n) curve, though that is
    somewhat inconclusive without more data points to the right; the brute force 
    plot shows an exponential curve.
    </dd>
</dl>
<hr>

## Theoretical results vs empirical results
<cite>Author: Cheryl Moser</cite>
<dl>
    <dt>Theoretical</dt>
    <dd>
    <ul>
        <li>Brute Force --> Expectation: O(2<sup>n</sup>) for both K01 & FracK</li>
        <li>Greedy --> O(n log n) for both K01 & FracK; however, we know that 
        it may produce suboptimal results when applied to K01</li>
        <li>Dynamic Programming --> 01 O(nW), where W = the weight limit of the knapsack
            | FracK exponential similar to O(2<sup>n</sup>)</li>
    </ul></dd>
    <dt>Empirical</dt>
    <dd>
    <ul>
        <li>Brute Force --> Results match expectations for both knapsacks</li>
        <li>Greedy --> Results match expectations for both knapsacks</li>
        <li>Dynamic Programming --> 01 (inconclusive) | 
            FracK low exponential</li>
    </ul></dd>
    <dt>Conclusion</dt>
    <dd>
    Results were as expected for brute force and greedy: brute force displayed a curve
    that was extremely steep as it progressed toward larger arrays; greedy displayed
    a slow, steady rise as arrays became larger, with a faster performance when applied 
    to the fractional knapsack. More data points of large array sizes are needed to 
    determine if the shape of the curve indeed looks like the expected O(n log n).
    The surprise result lies with the dynamic programming method as applied to the 
    fractional knapsack, as it did indeed display as exponential, but far less 
    than the expected O(2<sup>n</sup>).
    </dd>
</dl>
<hr>

## Which algorithm performed best for which knapsack?
<dl><cite>Author: Angela Fujihara</cite>
    <dt>0/1 Knapsack:</dt>
        <dd>    
        Why Greedy is Best: The Greedy approach is effective for the 0/1 Knapsack 
        problem because it prioritizes immediate gains. It quickly selects items with the 
        highest value-to-weight ratio, filling the knapsack until capacity is reached. 
        Although it may not always find the optimal solution, it generally provides a good 
        approximation efficiently. In contrast, the brute-force method exhaustively evaluates 
        all combinations, becoming prohibitively slow as the dataset size increases.
        </dd>
    <dt>For Fractional Knapsack:</dt>
        <dd>    
            Why Dynamic Programming and Greedy are Best:
            <ul>
                <li>Dynamic Programming (Fractional Knapsack):<br>
                This approach excels, particularly for larger tasks. It breaks down the 
                problem into smaller, manageable parts and efficiently combines their solutions 
                without sacrificing efficiency.</li>
<br>
                <li>Greedy (Fractional Knapsack): Greedy remains a viable choice, especially 
                for smaller datasets. It prioritizes items with the best value-to-weight 
                ratio, adding them to the knapsack incrementally. While it may not always 
                yield the optimal solution, its speed and reliability make it a practical 
                option for smaller-scale problems.</li>
            </ul>
        </dd>
    <dt>Conclusion:</dt>
        <dd>
        In conclusion, Dynamic Programming and Greedy algorithms stand out as the top 
        contenders for Fractional Knapsack problems. Dynamic Programming's systematic 
        approach to problem-solving and efficient solution recombination make it ideal 
        for larger datasets. On the other hand, Greedy offers speed and reliability, 
        making it a suitable choice for smaller-scale tasks. For 0/1 Knapsack problems, 
        Greedy strikes a balance between efficiency and accuracy, making it the preferred 
        method over the brute-force approach.
        </dd>
</dl>
<hr>

## Algorithm development

<dl>
    <dt>Brute force method for the fractional knapsack problem</dt>
    <dd><cite>Author: Angela Fujihara</cite><br><br>
    The methodology involves iterating through all possible combinations of items 
    and calculating the total value and weight for each combination. It ensures accuracy 
    by considering every possible combination but may be inefficient for large datasets 
    due to its exponential time complexity.
    </dd>

<dt>Greedy method for the fractional knapsack problem</dt>
    <dd><cite>Author: Angela Fujihara</cite><br><br>
    The methodology involves sorting the items based on their value-to-weight ratio 
    and iteratively selecting the items with the highest ratio until the knapsack's 
    capacity is reached. It prioritizes items with the highest immediate benefit, 
    aiming to maximize the total value of items in the knapsack. However, it may 
    not always yield the optimal solution.
    </dd>

<dt>Greedy method for the knapsack 0-1 problem</dt>
<dd><cite>Author: Cheryl Moser</cite>
    <dd>
    <strong>Description</strong>: This method is a modified version of the greedy method for the fractional knapsack. 
    It is not guaranteed to return optimal results, especially with larger input arrays.
    The greedy method for this problem is not optimal because it does not consider all
    combinations of items; instead, it puts items into the knapsack sequentially by 
    highest value-to-weight ratio until the weight limit is met.
    <br><br>
    <strong>Methods</strong>: A priority queue was used in combination with a custom comparator for holding 
    value-weight pairs in non-increasing order by the value/weight ratio. A hash set was used to store 
    the items that were added to the knapsack. The method iterates through the priority 
    queue, removing the highest value-to-weight entry first and adding it to the knapsack until 
    the queue is empty, or until the weight limit is met. If the addition of an item 
    exceeds the weight limit, it is discarded and the next item is considered.
    <br><br>
    <strong>Analysis</strong>: The time complexity of this method is O(n log n). This is due to the dequeue 
    operation nested within the priority queue iterator operation. The iterator operation 
    depends on the length of the priority queue, or the weight limit, either of which 
    can be of any size; the dequeue operation involves a re-ordering of the queue, 
    which is O(log n) due to the halving operations done on the binary heap.
</dd>

<dt>01 Brute Force</dt>
    <dd><cite>Author: Ashtin Rivada</cite><br><br>
    My process for developing my algorithm came after a bunch of research. My first 
    approach was using recursion to get all possibilities of combinations but this 
    seemed to have optimized my method, as I ran it and it solved all the tests 
    too fast to be considered a true brute force method. This made me take some 
    time and try to come up with a way to get all combinations without using any 
    recursion. I concluded that making each weight and value pair an item of itself 
    would make it easier for comparison and combinations.Then after some time 
    researching I found a Java library that could get these combinations for me 
    without optimizing my brute force. To make this work I needed a Set of Items 
    rather than the array of Items I was originally using so I converted this to 
    the set and was able to use a method from a java library called “Sets.powerSet”. 
    This gave me all the possible combinations and from the inputted set of items, 
    then I looked through each combination making sure the total weight the combination 
    had was under the maximum weight allowed and if this was true I checked if the 
    total profit was greater than what I currently had and if it was, it was now 
    our new total profit. After they are all checked the one with the greatest 
    profit while also staying within the allowed weight range was saved as my best 
    choice and I was able to use that to print my answers into the console.
</dd>
</dl>
<hr>

## Were there any other algorithms that could have solved these problems? Such as divide-and-conquer?
<dl>
<cite>Author: Mycole Brown</cite>

### Some different methodologies for solving the knapsack problem:
<dt>Greedy Methodology (0/1 and Fractional)</dt>
    <dd>
    The greedy approach to the knapsack problem involves making the locally optimal 
    choice at each step with the hope of finding the global optimum. For the 0/1 
    knapsack, this might involve choosing items based on value-to-weight ratio 
    without splitting items. For the fractional knapsack, it allows splitting items 
    to maximize the total value within the weight constraint.
    </dd>
    <dt>Dynamic Programming (Fractional Dynamic)</dt>
    <dd>
    Dynamic programming solves problems by breaking them down into simpler subproblems. 
    It is used to solve the knapsack problem by considering the solution for smaller 
    capacities and smaller sets of items, then building up to the solution for the 
    original problem. It typically involves using a table to store the results of 
    subproblems to avoid redundant calculations.
    </dd>
    <dt>Brute Force Methodology (Fractional Brute Force)</dt>
    <dd>
    A brute force approach checks all possible combinations of items to find the 
    one that offers the most value without exceeding the weight limit. This method 
    is exhaustive and often impractical for large datasets due to its exponential 
    time complexity.
    </dd>

### Other algorithms that could have been used to solve these problems

<dt>Divide and Conquer</dt>
    <dd>
    This approach involves dividing the problem into smaller subproblems, solving 
    the subproblems recursively, and then combining their solutions to solve the 
    original problem. While divide-and-conquer is a powerful strategy for many problems, 
    it is not typically used for the knapsack problem because the knapsack problem 
    does not naturally break down into independent subproblems that can be solved 
    recursively without overlapping subproblems, which is where dynamic programming 
    is more efficient.
    </dd>
    <dt>Genetic Algorithms</dt>
    <dd>
    These are adaptive heuristic search algorithms that are based on the evolutionary 
    ideas of natural selection and genetics. What does heuristic mean? Imagine you're 
    in a maze. Instead of wasting time trying every possible path from start to finish, 
    you follow a simple rule like 'always turn right' to find the exit. It's not 
    foolproof, but it gets you out quickly. That’s what a heuristic does in problem-solving: 
    it's a shortcut that’s usually good enough. They are particularly useful for 
    solving optimization and search problems where the solution space is large and complex.
    </dd>
    <dt>Simulated Annealing</dt>
    <dd>
    This is a probabilistic technique and it’s used for estimating the global optimum 
    of a given function.What is a probabilistic technique? A probabilistic technique 
    in the context of algorithm design is a method that makes use of randomness 
    as part of its logic or process. It doesn't guarantee a perfect answer every 
    time but is designed to find a good answer most of the time. Probabilistic 
    algorithms often perform well for complex problems where deterministic solutions 
    (those that are always expected to produce the same result) might be too slow 
    or difficult to implement. What is a global optimum? You're playing hide and 
    seek, and you want to find the absolute best hiding spot in the entire area. 
    The global optimum is that unbeatable spot. Finding it means you've won the 
    game of hide and seek in the most spectacular way possible. Out of all of the 
    places it’s the most optimum (assuming that's correct English). It is a metaheuristic 
    to approximate global optimization in a large search space and can be applied 
    to the knapsack problem. What is a metaheuristic? This is like having a bunch 
    of different 'always turn right' rules and picking the one that seems to work 
    best for the particular maze you're in. It's a strategy to choose between different 
    shortcuts. Also a search space needs some defining. A search space is all the 
    spots you could possibly hide in during the game of hide and seek. Some spots 
    are pretty good, some are okay, and one is the ultimate best. That's your search space.
    <br>
    The name “simulated annealing” comes from how blacksmiths make swords. They 
    heat metal to make it malleable, hammer it into shape, and then cool it down 
    to lock in the form. Simulated annealing does something similar with solutions 
    – it shakes things up with heat (randomness) to escape ruts and then cools down 
    to settle into a great solution.
    </dd>
    <dt>Backtracking</dt>
    <dd>
    This is an algorithmic technique for solving problems recursively by trying 
    to build a solution, one piece at a time, removing those solutions that fail 
    to satisfy the constraints of the problem at any point in time.
    </dd>
    <dt>Branch and Bound</dt>
    <dd>
    This is another algorithm design paradigm used for solving combinatorial 
    optimization problems like the knapsack problem. Combinatorial optimization 
    problems are puzzles where you have to consider a bunch of different elements 
    and figure out the best combination. Like choosing your team in a pick-up 
    basketball game from everyone who showed up at the court. It involves dividing 
    the problem into several branches, computing bounds for each branch, and then 
    pruning branches that cannot yield better solutions than the best one found so far.
    </dd>
</dl>
