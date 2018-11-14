public class TokenPass {
    private int[] board;
    private int currentPlayer;
    private int playerCount;
    //int winner = -1;

    public TokenPass (int playerCount)
    {
        this.currentPlayer=(int)(Math.random()*playerCount-1);
        board =new int[playerCount];
        for (int i=0; i<board.length; i++)
        {
            board[i]=(int)(Math.random()*10);
        }
    }
    public void distributeCurrentPlayerTokens()
    {
        /**int nextPlayer=currentPlayer;
        int tokensToDistribute=board[currentPlayer];
        board[currentPlayer]=0;

        while (tokensToDistribute>0)
        {
            nextPlayer=(nextPlayer+1)%board.length;
            board[nextPlayer]++;
            tokensToDistribute--;

        }**/

        int tokensToDistribute=board[currentPlayer];
        board[currentPlayer]=0;
        int j=0;
        for (int i=0; i<tokensToDistribute; i++)
         {
             try
             {
                 board[currentPlayer+1]=0;
             }
             catch (ArrayIndexOutOfBoundsException e)
             {
                 board[j]++;
                 j++;

             }
             board[currentPlayer+1]++;
         }


    }

    public int gameOver()
    {

        for (int i=0; i<board.length; i++)
        {
            if (board[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
    public void printBoard()
    {
        for (int i=0; i<board.length; i++)
        {
            System.out.println("Player "+i+" : "+board[i]);
        }
        System.out.println("");

    }
}
