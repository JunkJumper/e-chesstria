# e-Chesstria - 2nd Semester Project - Team [G00D3N0UGHT](https://git-iutinfo.unice.fr/good3nought)
 
![logo](https://github.com/JunkJumper/e-chesstria/raw/master/logo.png "e-Chesstria logo")

## Table of content

1. **[Description](https://github.com/JunkJumper/e-chesstria#description-back-to-table-of-content)**
2. **[Requirements](https://github.com/JunkJumper/e-chesstria#requirements-back-to-table-of-content)**
3. **[Installation](https://github.com/JunkJumper/e-chesstria#installation-back-to-table-of-content)**
4. **[Commands](https://github.com/JunkJumper/e-chesstria#commands-back-to-table-of-content)**
6. **[Chess rules](https://github.com/JunkJumper/e-chesstria#chess-rules-back-to-table-of-content)**
7. **[Credits](https://github.com/JunkJumper/e-chesstria#credits-back-to-table-of-content)**
8. **[License](https://github.com/JunkJumper/e-chesstria#license-back-to-table-of-content)**

## Description [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

~~Serious~~ equestrian school project  from "[Good 3nough Team](https://git-iutinfo.unice.fr/good3nought)" group.

## Requirements [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

This project requires a [java JDK SE 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) **up to date** to build and a  [java JRE](https://java.com/fr/download/manual.jsp) **up to date** tu launch and run the game. If you don't know chess rulling, you can checkout [chess rules](https://github.com/JunkJumper/e-chesstria#r%C3%A8gles-du-jeu-d%C3%A9chec-back-to-table-of-content).

## Installation [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

Firstly, you have to clone the repo using

```
git clone https://github.com/JunkJumper/e-chesstria.git
```

After that, you can compile the project by using a terminal prompt or using IDE's GUI compiler such as [Eclipse](https://www.eclipse.org/downloads/). 

## Commands [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

To play the game, you have to type the name of the two players. If one are blank, the game will put the default name (like "Default Player No1").

![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/joueurs.PNG) 

After that, you have to choose what side each player will take, white or black. You can let the game choose for you. If there are no selection, the game will choose for you.

![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/choix-c.PNG) 

The game will began by displaying the chessfield and the current player name.

![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/echi1.PNG) 

The game will ask you to type two positions : the first one is one of the current alives chess pieces of you side and the second one is the destination position.

![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/pos-E.PNG) 

The game will display again the chessfield and will ask you to do the previous actions until one of the two players will be defeated.

## Chess rules [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)
> source (french only) : [http://www.echecs.club/regles/](http://www.echecs.club/regles/) (look at [credits](https://github.com/JunkJumper/e-chesstria#credits-back-to-table-of-content)) 

### Game Fonctionement

At the begining of the game, it's always the players with white pieces to begin. During a turn, the player has to make a move, take an oppontent piece or a special move.

### Goal

The Differents moves alow to players to defeat the opponent king. When he's defeated, the current players automaticly win the game and the party is finished.

### Check

Each time you can move your pieces to check the opponent king, you have to warn your opponent by saying « check ». Your opponent will have only one choice : try to exit of the « checkstate » by move his king or protect it by putting another piece or by taking the oppentent piece that make himslelf in « checkstate ».

### Checkmate

If your opponent can't escape from the « checkstate », his king is « checkmate » and you win the game.

For more informations, you can check this [website](http://www.echecs.club/regles/) (french) or check [credits](https://github.com/JunkJumper/e-chesstria#credits-back-to-table-of-content).

### Here, you can find what letters are used to display the chess field.

|   Pièce   |  Lettre  |
|:---------:|:--------:|
|Knight     | k        |
|Bishop     | B        |
|Pawn       | P        |
|Queen      | Q        |
|King       | K        |
|Rook       | R        |

``W`` letter is used for white pieces. ``B`` letter is used for black pieces.

## Credits [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

|                                 Peronne ou Source                                |                                                 Role                                                    |
| :-------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------:|
| [ALEXOVITZ Anthony](https://git-iutinfo.unice.fr/aa700867)                       | Conception & Developpement                                                                             |
| [NOWICKI Johann](https://git-iutinfo.unice.fr/nj715143)                          | Conception & Developpement                                                                             |
| [RELEVAT Chiara](https://git-iutinfo.unice.fr/rc804998)                          | Secretariat, Conception & Developpement                                                                |
| [SRIFI Pauline](https://git-iutinfo.unice.fr/sj801446)                              | Projet Manager, Conception & Developpement                                                             |
| [THEBAULT Manon](https://git-iutinfo.unice.fr/tm802036)                          | Conception & Developpement                                                                             |
|                                                                                                                                                                                           |
| [PRITCHARD Adam](https://github.com/adam-p)                                      | [Markdown syntax & cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)|
| [http://www.echecs.club](http://www.echecs.club)                                 | [Chess Ruling](http://www.echecs.club/regles/) du jeu d'échec                                          |


## License [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

[![logo](https://licensebuttons.net/l/by/4.0/88x31.png)](https://creativecommons.org/licenses/by/4.0/) This project is available under the terms of the [Creative Commons Attribution 4.0 International License](https://creativecommons.org/licenses/by/4.0/) (or check [LICENSE.md](https://github.com/JunkJumper/e-chesstria/blob/master/LICENSE.md)).

[![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/gitalab.PNG)](https://gitlab.com/gitlab-org) [![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/git.PNG)](https://git-scm.com/) [![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/java.PNG)](https://www.java.com/fr/download/)
