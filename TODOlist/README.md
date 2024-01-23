# To-do List

### Description
A simple to-do list applications with features such as
displaying the list, adding tasks, marking tasks as COMPLETED,
and deleting tasks. 

### How to run
Users are presented with a main menu with numbers corresponding to each 
action. Enter the number to perform the choice.

	Main Menu
	0 Display Tasks
	1 Add Tasks
	2 Mark Tasks as COMPLETE
	3 Delete Tasks
	4 Exit Program...
	
	Enter a choice: 
	
Afterward, users will be asked if they want to use the program again.

### Example runs
Displaying all tasks
	
 	Main Menu
	0 Display Tasks
	1 Add Tasks
	2 Mark Tasks as COMPLETE
	3 Delete Tasks
	4 Exit Program...
	
	Enter a choice: 0
	
	To-do List
	1 Eat
	2 Go fishing
	3 Sleep
	
	Again (y or n)? y

Adding tasks

	Main Menu
	0 Display Tasks
	1 Add Tasks
	2 Mark Tasks as COMPLETE
	3 Delete Tasks
	4 Exit Program...
	
	Enter a choice: 1
	
	Add Task
	Enter task: Shower
	Again (y or n)? y

 Marking tasks as COMPLETED
 
	Main Menu
	0 Display Tasks
	1 Add Tasks
	2 Mark Tasks as COMPLETE
	3 Delete Tasks
	4 Exit Program...
	
	Enter a choice: 2
	
	To-do List
	1 Eat
	2 Go fishing
	3 Sleep
	4 Shower
	
	Enter task number to mark as COMPLETED: 2
	Again (y or n)? y
	
Deleting tasks

	Main Menu
	0 Display Tasks
	1 Add Tasks
	2 Mark Tasks as COMPLETE
	3 Delete Tasks
	4 Exit Program...
	
	Enter a choice: 3
	
	To-do List
	1 Eat
	2 Go fishing -- COMPLETED
	3 Sleep
	4 Shower
	
	Enter task number to remove: 3
	Again (y or n)? y

In the end, the to-do list will look like this:
	
 	To-do List
	1 Eat
	2 Go fishing -- COMPLETED
	3 Shower


### Bugs
If the user marks a task COMPLETED and marks the same task again, 
the COMPLETED will be stacked.

e.g.

	1 Sleep 
	2 Shower 
	3 Fish -- COMPLETED -- COMPLETED
