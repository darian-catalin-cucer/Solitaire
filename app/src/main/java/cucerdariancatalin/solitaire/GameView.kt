package cucerdariancatalin.solitaire

interface GameView {
    fun update(gameModel: GameModel = GameModel)
    fun gameWon()
}