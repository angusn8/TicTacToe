# Project Report
# Nathaniel Angus

## Introduction

For my final project, I decided to make a console based version of Tic Tac Toe. There is no graphical user interface on my Tic Tac Toe game. Instead the game board is drawn using ascii characters in the terminal window. For this implementation I used three classes. Those three classes are titled Main, Board, and Game. The main class facilitates the output that the user reads such as introduction messages and turn based messages as well as using other classes and methods from those classes to make the game function. The primary function of the board class is to print the board to the terminal window when called. Two methods exist in the board class including the boardSetup() method and the boardPrint() method. The board setup method utilizes a while loop to fill the 2D array with blank characters.  The 2D array is where the X’s and O’s are placed when a player makes their move, but it had to be initialized with blank spaces to start. The boardPrint() method simply uses print statements and the 2D array with the empty characters to create a Tic Tac Toe Board. The game class is the final class in the program. The game class is used to allow the players to take their turns while the class also invokes the rules of the game. The two methods in the game class are makeMove() and checkWin(). The first of these two methods is pretty self explanatory, it allows the player to place an X or an O in the game board depending on whose turn it is. The checkWin() method determines when a player has won the game and ends the game appropriately.

## Motivation

My motivation for creating Tic Tac Toe was to entertain the people who used my program and to adequately test my programming knowledge with a challenging project. When picking what type of program to make for my project, I was more focused on picking a project that would be the appropriate level of difficulty rather than picking a project with real world application. I figured that with my current level of knowledge and the amount of time given I would not be able to make a very elaborate real-world program and almost anything functional that I could make would most likely already have a better version with similar features available. So instead I decided to make a project, such as Tic Tac Toe, that would enable me to practice and showcase what I have learned this semester while still having a feasible goal for my output. Tic Tac Toe might not have been the best program to pick since it’s only purpose is for entertainment and to have fun playing it, but it was plenty challenging and provided me with exactly what I was looking for.

## Project Implementation Details

## Project Results and Output

![Output part 1](https://drive.google.com/file/d/10YWfHUV3Cj2I3og6Nyl6bklMSQmqxZkD/view?usp=sharing)
![Output part 2](https://drive.google.com/open?id=18BUMz6k5_JrkOFhB9I4lze13h1nnhL6W)

## Concluding Remarks

The biggest takeaways that this final project gave me were that it’s always good to challenge yourself, setbacks are a part of creating any major programming project, and it can actually be fun to work through these setbacks.  It is better to challenge yourself and really push the limits of your knowledge for a couple of reasons.  The first reason is that you will only make yourself better by picking challenging projects, whereas with a more simple idea, you won’t be gaining any knowledge, only repeating what you already know.  Another reason is that only by challenging yourself can you really find out how good you actually are.  If you never leave your comfort zone then you will never know the true extent of what you can do.  It’s also fun to work through these challenges and to have to figure out what you are doing wrong or can do better.  Yes it’s frustrating to be stuck for a while on the same problem, but problem solving is what makes computer science so great.

## Based on your experiences with the project and from our discussions in class, please provide answers for the following questions as related to the project you chose to implement:

1. Who would typically make the technology of the similar type as your project? Why?

    Maybe a game company would be making a similar project to what I did. Of course, it would have to be a lot more complex such as including a GUI and allowing you to play against a CPU, but video game companies might be compelled to make a version of this classic game.

2. Who are the intended users of this software? How does this software benefit them?

    Children would most likely be the ones to use this software the most.  Although anybody can play Tic Tac Toe, it is inherently a child's game and that's who enjoys it the most.  They benefit form this software by gaining entertainment and potentially by passing time if they are somewhere they really don't want to be, which happens a lot for children.  

3. Who is not supposed to use this technology? Why?

    I don't really think there's a specific group of people who shouldn't or can't use this software. Even if you don't know how to play Tic Tac Toe right away it's a pretty easy game to learn and can be picked up quickly by almost anybody.

4. How can the type of software implemented in your project cause harm?

    I don't see any way that a console based version of a simply game usually played with paper and pencil could cause any harm at all.

5. What solutions can be developed to avoid the harm caused by this type of technology or to fix the harm?

    Like I said in number four, there are no ways that Tic Tac Toe can cause harm.

## Team Working Strategy

No team working strategy was required since I was working on an individual project.
