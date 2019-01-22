package tktdd

// TYPES

/**
 * The `Player` type defines tennis players.
 */
sealed class Player
object PlayerOne : Player()
object PlayerTwo : Player()

/**
 * The `Point` type defines tennis point values.
 */
typealias Point = Int // Surely not the best choice

/**
 * The `PointsData` type defines the product of two player point values.
 */
data class PointsData (val playerOne: Point, val playerTwo: Point)

/**
 * The `Points` type defines a set score for a tennis game between two players.
 * Probably incomplete at this moment.
 */
sealed class Score
data class Points(val pointsData : PointsData) : Score()
object Deuce : Score()
data class Game(val player : Player) : Score()



// TOOLING FUNCTIONS

/**
 * The `Option` type is missing in standard library.
 * In real life apps, you rather need to get it from arrow lib https://arrow-kt.io/docs/arrow/core/option/ 
 */
sealed class Option<out T : Any>
data class Some<out T : Any> internal constructor(val value: T) : Option<T>()
object None : Option<Nothing>()

/**
 * Extends player type now we know all possible values
 */
fun Player.other() : Player = when(this) {
    is PlayerOne -> PlayerTwo
    is PlayerTwo -> PlayerOne
}

/**
 * I prefer to have function for user string generation to not override toString introspection
 */
fun stringOfPlayer( p : Player) : String = when(p) {
    is PlayerOne -> "Player 1"
    is PlayerTwo -> "Player 2"
}

fun stringOfScore(s : Score) : String = when(s){
    is Deuce -> "Deuce"
    else -> TODO() // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-t-o-d-o.html
}

/**
 * Tool function to increment points
 */
fun incrementPoint(p : Point) : Option<Point> = when (p) {
    0 -> Some(15)
    15 -> Some(30)
    30 -> Some(40)
    else -> None // Outch ! How int could solve Advantage and End of game ? 
}

/**
 * An exemple how to extract values from 'a option value 
 */
fun readFromOptionPoint (optPoint : Option<Point>) : Point = when(optPoint){
    is Some -> optPoint.value
    is None -> 0 // arbitrary
}

// TRANSITION FUNCTIONS

fun scoreWhenPoint(pointsData : PointsData, winner : Player) : Score { TODO() }
fun scoreWhenDeuce(winner : Player) : Score { TODO() }
fun scoreWhenAdvantage(advantagedPlayer : Player, winner : Player) : Score { TODO() }
fun newGame() : Score { TODO() }

// MAIN FUNCTION
fun score(current : Score, winner : Player) : Score {TODO()}