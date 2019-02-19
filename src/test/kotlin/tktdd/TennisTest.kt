package tktdd

import org.junit.Assert.assertEquals
import org.junit.Test

class MyTennisTest {
    @Test fun givenPlayerOneOtherIsPlayerTwo() {
        assertEquals(PlayerTwo, PlayerOne.other())
    }

    @Test fun givenPlayerOneStringOf() {
        assertEquals("Player 1", stringOfPlayer(PlayerOne))
    }

    @Test fun givenDeuceWhenPlayerOneWins() {
        val winner = PlayerOne
        val nextScore =  scoreWhenDeuce(winner)
        assertEquals("Advantage Player 1", stringOfScore(nextScore))
    }

    @Test fun givenAdvantageWhenAdvantagedPlayerWins() {
        val advantagePlayer = PlayerOne
        val winner = advantagePlayer
        val nextScore =  scoreWhenAdvantage(advantagePlayer, winner)
        assertEquals("Game Player 1", stringOfScore(nextScore))
    }

    @Test fun givenAdvantageWhenOtherPlayerWins() {
        val advantagePlayer = PlayerOne
        val winner = advantagePlayer.other()
        val nextScore =  scoreWhenAdvantage(advantagePlayer, winner)
        assertEquals("Deuce", stringOfScore(nextScore))
    }

    @Test fun givenNewGame() {
        val nextScore =  newGame()
        assertEquals("Love", stringOfScore(nextScore))
    }
    
    // Tests bellow need more conception on types to be implemented

    @Test fun givenPlayerOneAt40Wins() {
        assertEquals("Game Player 1", false)
    }

    @Test fun givenPlayerOneAt40WhenOtherAt30Wins() {
        assertEquals("Deuce", false)
    }

    @Test fun givenPlayerOneAt40WhenOtherAt15Wins() {
        assertEquals("40/30", false)
    }

    @Test fun givenPlayerOneAt15WhenOtherAt15Wins() {
        assertEquals("40/30", false)
    }

    @Test fun givenPlayerOneAt15WinsWhenOtherAt15() {
        assertEquals("30/15", false)
    }

    @Test fun givenPlayerOneAt0WhenOtherAt15Wins() {
        assertEquals("0/30", false)
    }

    @Test fun givenPlayerOneAt30WhenOtherAt15Wins() {
        assertEquals("40/15", false)
    }
}

