package tktdd


sealed class Player{
    object PlayerOne : Player()
    object PlayerTwo : Player()
}

typealias PlayerOne = Player.PlayerOne
typealias PlayerTwo = Player.PlayerTwo

// Surely not the best choice
typealias Point = Int

/**
 * The `Language` type defines a programming language with a name and hotness score.
 *
 * @property name The name of the language.
 * @property hotness A score from 1 to 10 of user enthusiasm. 10 = so hot right now
 */
data class Language(val name: String, val hotness: Int)

class MyLibrary {
    /**
     * @return data relating to the Kotlin {@code Lanugage}.
     */
    fun kotlinLanguage() = Language("Kotlin", 10)
}