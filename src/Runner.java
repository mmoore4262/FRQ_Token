public class Runner {
    public static void main(String[] args)
    {
        TokenPass game1= new TokenPass(4);

        while(game1.gameOver()<0)
        {
            game1.printBoard();
            game1.distributeCurrentPlayerTokens();
            //game1.nextPlayer();
        }
        game1.printBoard();
        System.out.println("Game winner: Player"+ game1.gameOver());
    }
}
