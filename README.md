# AI-Minimax-and-AlphaBeta-Pruning

## Description 
This project will discuss about the game - Weighted Othello. This game is identical to Othello except the score in the game. While in the standard Othello every component score is 1, in this Othello version every cell has number represents the score of the Min/Max player.
The board is given with numbers and MiniMax algorithm/ AlphaBeta Pruning should solve and find the minimax value.

Example: in the given players board:

0|0|0|0

0|1|2|0

0|2|1|0

0|0|0|0

And the given score board that match to the players board above:

0|4|11|6

7|8|5|12

9|15|2|13

10|1|3|14

Player 1 score(maximum player) = 8+2 = 10.

Player 2 score(minimum player) = 15+5 = 20.

mutual score of players is: 10-20 = -10.

## Usage
Attached to the project differents instances of the game(boards) with altered score. each board is 6x6 size and can be found in "instances" dir.

* Game board is represented by 2-DIM array containing cells with the next info:

Empty cell - '0'.

Player 1 cell - '1'.

Player 2 cell - '2'.

In addition another board is exist with the score of each cell in the given players board.

Main class:

1. task2 - Minimax Algorithm: expected to see 50 Weighted Othello boards 6x6 solved.

2. task3 - AlphaBeta Pruning Algorithm: same as above.

## Credits
Daniel Ben-Simon and Eran Toutian, 4th year students of Information and Software Systems Engineering, 
Ben Gurion University of the Negev, Israel
