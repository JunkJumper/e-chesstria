# e-Chesstria - Projet Tutoré Equipe [G00D3N0UGHT](https://git-iutinfo.unice.fr/good3nought) Semestre 2
 
![logo](https://github.com/JunkJumper/e-chesstria/raw/master/logo.png "e-Chesstria logo")

## Table of content

1. **[Description](https://github.com/JunkJumper/e-chesstria#description-back-to-table-of-content)**
2. **[Requirements](https://github.com/JunkJumper/e-chesstria#requirements-back-to-table-of-content)**
3. **[Installation](https://github.com/JunkJumper/e-chesstria#installation-back-to-table-of-content)**
4. **[Commandes](https://github.com/JunkJumper/e-chesstria#commands-back-to-table-of-content)**
6. **[Règles des échecs](https://github.com/JunkJumper/e-chesstria#r%C3%A8gles-du-jeu-d%C3%A9chec-back-to-table-of-content)**
7. **[Crédits](https://github.com/JunkJumper/e-chesstria#cr%C3%A9dits-back-to-table-of-content)**
8. **[License](https://github.com/JunkJumper/e-chesstria#license-back-to-table-of-content)**

## Description [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

~~Serious~~equestrian school project  from "[Good 3nough Team](https://git-iutinfo.unice.fr/good3nought)" group.

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

## Règles du jeu d'échec [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)
> source [http://www.echecs.club/regles/](http://www.echecs.club/regles/) (voir [crédits](https://github.com/JunkJumper/e-chesstria#cr%C3%A9dits-back-to-table-of-content)) 

### Déroulement du jeu

Au début d’une partie d’échecs, ce sont toujours les blancs qui commencent. Lors d’un tour de jeu, le joueur peut effectuer soit un déplacement, soit une prise soit un coup spécial.

### But du jeu

Ces différents déplacements sont proposées aux joueurs pour parvenir à réaliser leur objectif qui est de prendre le roi adverse. Lorsque ce but est atteint, le joueur qui y est parvenu gagne immédiatement la partie qui prend fin automatiquement. 

### Échec

Chaque fois que vous pouvez prendre le roi de votre adversaire à votre prochain coup, vous devez le prévenir en annonçant « échec ». Il doit alors tenter de parer votre échec, lors de son tour de jeu. 

### Échec et mat

S’il n’y parvient pas, son roi est alors « échec et mat ». Vous remportez donc la partie.

Pour plus d'informations sur les règles, visitez [ce site](http://www.echecs.club/regles/) ou visitez les [crédits](https://github.com/JunkJumper/e-chesstria#cr%C3%A9dits-back-to-table-of-content).

### Vous trouverez ici un tableau résumant les pièces :

|   Pièce   |  Lettre  |
|:---------:|:--------:|
|Cavalier   | C        |
|Fou        | F        |
|Pion       | P        |
|Reine      | Q        |
|Roi        | K        |
|Tour       | T        |

La lettre ``B`` signifie qu'une pièce est de couleur blanche et la lettre ``N`` signifie qu'une pièce est de couleur noire.

## Crédits [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

|                                 Peronne ou Source                                |                                                 Role                                                    |
| :-------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------:|
| [ALEXOVITZ Anthony](https://git-iutinfo.unice.fr/aa700867)                       | Conception et Développement                                                                             |
| [NOWICKI Johann](https://git-iutinfo.unice.fr/nj715143)                          | Conception et Développement                                                                             |
| [RELEVAT Chiara](https://git-iutinfo.unice.fr/rc804998)                          | Secrétariat, Conception et Développement                                                                |
| [SRIFI Jose](https://git-iutinfo.unice.fr/sj801446)                              | Chef de projet, Conception et Développement                                                             |
| [THEBAULT Manon](https://git-iutinfo.unice.fr/tm802036)                          | Conception et Développement                                                                             |
|                                                                                                                                                                                            |
| [PRITCHARD Adam](https://github.com/adam-p)                                      | [Utilisation](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) & syntaxe Markdown      |
| [http://www.echecs.club](http://www.echecs.club)                                 | [Règles](http://www.echecs.club/regles/) du jeu d'échec                                                 |


## License [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

[![logo](https://licensebuttons.net/l/by/4.0/88x31.png)](https://creativecommons.org/licenses/by/4.0/) This project is available under the terms of the [Creative Commons Attribution 4.0 International License](https://creativecommons.org/licenses/by/4.0/) (or check [LICENSE.md](https://github.com/JunkJumper/e-chesstria/blob/master/LICENSE.md)).

[![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/gitalab.PNG)](https://gitlab.com/gitlab-org) [![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/git.PNG)](https://git-scm.com/) [![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/java.PNG)](https://www.java.com/fr/download/)
