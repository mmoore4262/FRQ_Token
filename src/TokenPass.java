public class TokenPass {
    private int[] board;
    private int currentPlayer;
    private int playerCount;

    public TokenPass (int playerCount)
    {
        this.currentPlayer=(int)(Math.random()*playerCount-1);
        board =new int[playerCount];
        for (int i=0; i<board.length; i++)
        {
            board[i]=(int)(Math.random()*10);
        }
    }
    public void distributeCurrentPlayerTokens(int currentPlayer, int [] board)
    {
        int stor=board[currentPlayer];
        int j=1;
        for (int i=1;i<stor; i++)
        {
            if (board[currentPlayer+i])

            {

            }
        }
    }
}
