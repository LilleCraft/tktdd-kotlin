# tktdd-kotlin

You need a [JDK 11](./docs/jdk.md) and [Kotlin 1.3.11](https://kotlinlang.org/docs/tutorials/command-line.html) installed

TKTDD in Kotlin with [Gradle](https://docs.gradle.org/current/userguide/installation.html) build system and Junit test framework

## First time with Kotlin ?

You should do an [Iteration 0](./docs/0.md)

## Tennis

A tennis match consists of multiple sets that again are played as several games, in the kata, you only have to implement the scoring system for a single game:

- Each player can have either of these points in one game: Love, 15, 30, 40.
- If you have 40 and you win the ball, you win the game. There are, however, special rules.
- If both have 40, the players are deuce.
- If the game is in deuce, the winner of a ball will have advantage and game ball.
- If the player with advantage wins the ball, (s)he wins the game.
- If the player without advantage wins, they are back at deuce.

This problem is easy enough that it's fun to play with, but difficult enough that it's fun to play with.
<br/>(∩ ｀-´)⊃━☆ ﾟ.\*･｡ﾟ

### Setup

clone this repository and run

```sh
gradle build
```

### Players

In tennis, there are two players, which we can easily model with a discriminated union (a variant) :

```Kotlin

sealed class Player{
    object PlayerOne : Player()
    object PlayerTwo : Player()
}

typealias PlayerOne = Player.PlayerOne
typealias PlayerTwo = Player.PlayerTwo

```

### Winning the game

#### Advantage

When one of the players have the advantage in tennis, the result can go one of two ways: either the player with the advantage wins the ball, in which case he or she wins the game, or the other player wins, in which case the next score is deuce.

#### Forty

When one of the players have forty points, there are three possible outcomes of the next ball:

- If the player with forty points wins the ball, (s)he wins the game.
- If the other player has thirty points, and wins the ball, the score is deuce.
- If the other player has less than thirty points, and wins the ball, his or her points increases to the next level (from love to fifteen, or from fifteen to thirty).

### Challenge

You get some tests in `src/test/kotlin/tktdd/TennisTest.kt` folder which should serve you as a specification of what you can code.
This Kata will consist in several iterations.
At the end of each iteration you score the number of green tests ! (•̀ᴗ•́)و
Between iterations you will the animator will give you some clues to improve the safety and confidence in your code.

```sh
gradle build # compile your lib
gradle test # run unit tests
```

#### Next iterations

Your are free to cheat ... But you shouldn't do it if you really whant to learn something :

- [Before I start the second iteration](./docs/1.md)
- [Before I start the third iteration](./docs/2.md)
- [Before I start the forth iteration](./docs/3.md)
- [Before I start the fifth iteration](./docs/4.md)
