# Recursion

**Recursion Vs Iteration: **
-------------------------------

We can write every loop in a recursive mode.  
Ex : for(initialization; condition; increment)  
{
      Logic goes here  
}
In the similar way for every recursive function it needs to have 3 parts  
1. Initialization  
2. Condition  
3. Increment  
So lets take a recursive function..  

returntype functionName(Initialization)  
{
       Terminate Condition  
       Logic goes here  
       changing the variables like Increment and Decrement and passing those changed variables to the same function  
}
================================================================
Consider two students named "Recursion" and "Iteration".  

Recursion  is optimistic and lazy.  He likes to solve the problems that are eithervery small or the problems that are almost done.  

Iteration is well planned and hard working . He likes big problems.  

Now you give both of them a big problem to solve,  

Recursion solved it as follows:  
Recursion  is too lazy to solve the big problem at once , but he knows he can  solve the problem if someone has almost done the problem. He assumed  someone has almost done it, and he completed the problem. Now he  considered the "someone's problem" and tried to solve it similarly. This  process continued until he got a small problem , which he can solve by  himself.  

Iteration solved it as follows:  
Iteration solved a part of the problem and kept on solving many such parts until the problem is completely solved.  

========================================================================

http://stackoverflow.com/questions/717725/understanding-recursion !
https://www.topcoder.com/community/data-science/data-science-tutorials/an-introduction-to-recursion-part-2/ !

##### Base Condition : Solves with out recursion : Check if you have it in the code
* It handles a simple “base case” without using recursion.  

In this example, the base case is “HelloWorld(0)”; if the function is asked to print zero times then it returns without spawning any more “HelloWorld”s.  

##### Smallest Problem : Easy and straight to solve smallest problem

* It avoids cycles. Smaller problem is easy to solve.  

Imagine if “HelloWorld(10)” called “HelloWorld(10)” which called “HelloWorld(10).”   
You’d end up with an infinite cycle of calls, and this usually would result in a “stack overflow” error while running. 
In many recursive programs, you can avoid cycles by having each function call be for a problem that is somehow smaller 
or simpler than the original problem. In this case, for example, count will be smaller and smaller with each call. 
As the problem gets simpler and simpler (in this case, we’ll consider it “simpler” to print something zero times rather than printing it 5 times) 
eventually it will arrive at the “base case” and stop recursing. There are many ways to avoid infinite cycles, 
but making sure that we’re dealing with progressively smaller or simpler problems is a good rule of thumb.

