# CSX42: Assignment 2
## Name: Snehal Anil Ahire
-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in studentCoursePlanner/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile SnehalAnil_Ahire_assign2/studentCoursePlanner/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile SnehalAnil_Ahire_assign2/studentCoursePlanner/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile SnehalAnil_Ahire_assign2/studentCoursePlanner/src/build.xml run -Darg0="input.txt" -Darg1="output.txt" 
Note: Arguments accept the absolute path of the files.


-----------------------------------------------------------------------
## Description:
I have used array as a data structure because we can easily find the number of students and courses that are to be created.
wait and allocated courses are strings as it will be simple to add with a + symbol at the end and it can be removed by converting to char array easily.
File output is not able to write semesters and states which I really cant understand why, but you can check the output in standard display.
In the state diagram every state can transit to another state , but to maintain state diagram's neatness only some transitions are shown.
I have used 1 day of 3 slack days.


Cited Code:
Line number 19 in course.java:
taken from link :https://www.journaldev.com/709/java-read-file-line-by-line
Line number 29 in course.java:
taken from link:https://stackoverflow.com/questions/1277880/how-can-i-get-the-count-of-line-in-a-file-in-an-efficient-way/1277904
Line number 18 in FileProcessor.java:
taken from link :https://www.journaldev.com/709/java-read-file-line-by-line
Line number 109 in FileProcessor.java:
taken from link :https://www.journaldev.com/709/java-read-file-line-by-line
Line number 24 in student.java:
taken from link:https://stackoverflow.com/questions/1277880/how-can-i-get-the-count-of-line-in-a-file-in-an-efficient-way/1277904
Line number 14 in Results.java:
taken from link:https://www.javatpoint.com/java-filewriter-class
-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: 10/8/2019

