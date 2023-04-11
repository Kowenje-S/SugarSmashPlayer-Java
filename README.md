# SugarSmashPlayer-Java

This is the question 

The developers of a free online game named Sugar Smash have asked you to develop a class named SugarSmashPlayer that holds data about a single player.  
The class contains the following fields: 
 • the player’s integer ID number 
 • a String screen name
 • the player’s integer points 

In your default constructor, assign default values of your choice to integer ID number and String screen name. Give the player a starting value of 0 points. Include get and set methods for each field. In the earnPoints() method, increment the amount of points by 100.

Write the class PremiumSugarSmashPlayer that descends from SugarSmashPlayer. This special player will be able to use boosters to increase their score by 500. The class contains the player’s integer booster field. The player will start with 3 boosters when created. Override the earnPoints() method so that the player earns 500 points and adds it to their current points. Within the same method, decrement the number of boosters by 1. If the player tries to earn points but has no more boosters, then print: “Out of boosters!” (without the quotations) and will earn 100 points instead. When the player buys boosters, increment boosters by 3. 

Run DemoSugarSmash.java to demonstrate the methods pass all 5 tests
