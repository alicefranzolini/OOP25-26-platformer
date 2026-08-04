# OOP25 Platformer

A 2D side-scrolling platform game, inspired by the "Super Mario Bros" genre, built in **Java** with **JavaFX** as a project for an Object-Oriented Programming (OOP) course.

## Description

The player controls a character who must make their way through 3 levels, jumping across platforms, collecting coins, defeating enemies, and reaching the flag at the end of each level to complete it.

## How to run the game

From a terminal, navigate to the folder containing the file and run:

```bash
java -jar OOP25-platformer.jar
```

## Controls

| Key | Action |
|---|---|
| **Left arrow** | Move left |
| **Right arrow** | Move right |
| **Space** | Jump |
| **Esc** | Pause / resume the game |
| **M** | Return to the menu |
| **R** | Restart the level / game |
| **1** | Go to Level 1 |
| **2** | Go to Level 2 |
| **3** | Go to Level 3 |

## Gameplay mechanics

- **Lives and score**: the player starts with a set number of lives; collecting coins increases the score and, once a threshold is reached, grants an extra life. Defeating enemies awards bonus points.
- **Enemies**: Goombas (defeated by jumping on top of them) and Koopas (which retreat into their shell when hit and can then be kicked into other enemies).
- **Question blocks**: hitting them from below releases a random reward (e.g. coins).
- **Level end**: reaching the flagpole lowers the flag and completes the level.
- **Game states**: Menu, Playing, Paused, Game Over, Victory.

## Levels

The game includes **3 levels**, each with different layouts of platforms, pyramids, and enemies, directly selectable from the menu using the number keys 1-2-3.
