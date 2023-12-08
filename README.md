# Java-Mini-Project
DESCRIPTION:

The program simulates a building with multiple lifts and allows users to interact by 
entering their current floor and destination floor. The system then determines the closest lift 
based on the total count, which is the sum of the distances travelled by the lift: from its current 
position to the user's current floor and from the user's current floor to the destination floor.
 The lifts are represented by the Lift class, and their control is managed by the 
LiftController class. The simulation runs in a loop, prompting the user for input until they 
choose to exit by entering -1 as the current floor. 

ALGORITHM: 


1. Lift Class: 
 Lift class represents a lift with attributes: 
 currentFloor: the current floor of the lift. 
 It has methods: 
o move(int destinationFloor): Moves the lift to the specified destination 
floor and returns the number of moves. 
2. LiftController Class: 
 LiftController class manages multiple lifts and their control. 
 Constructor: 
o Initializes an array of lifts with random initial positions. 
 Methods: 
o findClosestLiftWithMinTotalCount(int userCurrentFloor, int 
userDestinationFloor): Finds the closest lift based on the minimum 
total count. 
o getLiftPosition(int liftIndex): Gets the current position of the specified 
lift. 
o resetLiftPositions(): Resets the positions of all lifts to random floors. 
3. MultiLiftSimulation Class: 
 The main class interacts with the user and manages the simulation. 
 It uses the Scanner class for user input. 
 The simulation runs in a loop until the user chooses to exit. 
 For each iteration, it: 
o Takes user input for current and destination floors. 
o Finds the closest lift using the LiftController. 
o Outputs lift positions and information about the closest lift. 
o Simulates the lift's movement to the user's current floor and then to the 
destination floor. 
o Displays the total moves. 
o Resets lift positions after reaching the destination. 

DATE: 

 The main class interacts with the user and manages the simulation. 
 It uses the Scanner class for user input. 
 The simulation runs in a loop until the user chooses to exit. 
 For each iteration, it: 
o Takes user input for current and destination floors. 
o Finds the closest lift using the LiftController. 
o Outputs lift positions and information about the closest lift. 
o Simulates the lift's movement to the user's current floor and then to the 
destination floor. 
o Displays the total moves. 
o Resets lift positions after reaching the destination. 