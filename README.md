# e-Chesstria - Projet Tutoré Equipe [G00D3N0UGHT](https://git-iutinfo.unice.fr/good3nought) Semestre 2
 
![logo](https://github.com/JunkJumper/e-chesstria/raw/master/logo.png "e-Chesstria logo")

## Table of content

1. **[Description](https://github.com/JunkJumper/e-chesstria#description-back-to-table-of-content)**
2. **[Requirements](https://github.com/JunkJumper/e-chesstria#Requirements-back-to-table-of-content)**
3. **[Installation](https://github.com/JunkJumper/e-chesstria#installation-back-to-table-of-content)**
4. **[Commandes](https://github.com/JunkJumper/e-chesstria#commandes-back-to-table-of-content)**
6. **[Règles des échecs](https://github.com/JunkJumper/e-chesstria#r%C3%A8gles-du-jeu-d%C3%A9chec-back-to-table-of-content)**
7. **[Crédits](https://github.com/JunkJumper/e-chesstria#cr%C3%A9dits-back-to-table-of-content)**
8. **[License](https://github.com/JunkJumper/e-chesstria#license-back-to-table-of-content)**

## Description [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

~~Serious~~equestrian school project  from "[Good 3nough Team](https://git-iutinfo.unice.fr/good3nought)" group.

## Requirements [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

This project requires a [java JDK SE 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) **up to date** to build and a  [java JRE](https://java.com/fr/download/manual.jsp) **up to date** tu launch and run the game. If you don't know chess rulling, you can checkout [chess rules](https://github.com/JunkJumper/e-chesstria#r%C3%A8gles-du-jeu-d%C3%A9chec-back-to-table-of-content).

## Installation [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

Il faut dans une premier temp cloner ce repo git en utilisant la commande suivante :

```
git clone https://github.com/JunkJumper/e-chesstria.git
```

Pour installer le projet, vous pouvez lancer le fichier [echesstria.jar](#) ou bien compiler le projet en créant un nouveau projet sous [Eclipse](https://www.eclipse.org/downloads/) ou [Intellij](https://www.jetbrains.com/idea/download/#section=windows). 

## Commandes [[back to table of content]](https://github.com/JunkJumper/e-chesstria#table-of-content)

Pour pouvoir jouer, vous devez dans un premier temps rentrer deux noms de joueurs, si ces derniers sont vides, le jeu ne se lancera pas. 

![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/joueurs.PNG) 

Dans un second temps, vous devrez choisir qui jouera les blancs et qui jouera les noirs, vous pouvez également laisser le jeu choisir pour vous. 

![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/choix-c.PNG) 

Une fois ces choix effectués, le jeu demarrera en vous affichant le nom du joueur actif ainsi que l'échiquier actuel. 

![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/echi1.PNG) 

Le jeu vous demandra ensuite de rentrer deux positions sur l'échiquier, la première étant celle d'une pièce de l'échiquier et la seconde étant la position de destination. 

![logo](https://github.com/JunkJumper/e-chesstria/raw/master/imgs/pos-E.PNG) 

Le jeu affichera ensuite de nouveau l'échiquier et vous redemendera de refaire la manipulation précédente.

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
