# Slopestyle Skiing Competition Simulation

This project simulates a slopestyle skiing competition where athletes are scored by judges based on the tricks performed while navigating obstacles.

## Overview

Slopestyle is a winter sports event where competitors make two runs down a course with various obstacles, attempting to perform complex tricks. A panel of seven judges scores each run between 0.0 to 10.0. The highest and lowest scores are discarded, and the athlete's run score is the average of the remaining five scores.

## Classes

The simulation consists of the following classes, as per the provided UML diagram:

- `SingleRunResult`: Represents the scores for a single run.
- `Skier`: Contains the skier's information and their two run results.
- `ScoreBoard`: Aggregates all skiers' scores and determines the winner.

## Usage

Compile the Java classes and run the `SlopeStyleCompetition` with a command-line argument specifying the file containing the raw results data.

```shell
javac SlopeStyleCompetition.java SingleRunResult.java Skier.java ScoreBoard.java
java SlopeStyleCompetition scores.txt
