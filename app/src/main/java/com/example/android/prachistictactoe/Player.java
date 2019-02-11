package com.example.android.prachistictactoe;


public class Player {

    int[][] array=new int[3][3];
    int x;
    boolean win=false;
    public static int count=0;
    String playerName;


    public Player(int x)
    {
        this.x=x;
    }

    public boolean hasWon()
    {
        return win;
    }




    public void touched(int a,int b)
    {
        array[a][b]=x;


        if(array[0][0]==array[1][1]&&array[1][1]==array[2][2]&&array[0][0]==x)
        {
            win=true;
            return;
        }
        else if(array[2][0]==array[1][1]&&array[1][1]==array[0][2]&&array[2][0]==x)
        {
            win=true;
            return;
        }
        for(int i=0;i<3;i++)
        {
                if(array[i][0]==array[i][1]&&array[i][1]==array[i][2]&&array[i][0]==x)
                {
                    win=true;
                    break;
                }
                else if(array[0][i]==array[1][i]&&array[1][i]==array[2][i]&&array[0][i]==x)
                {
                    win=true;
                    break;
                }

        }

    }

    public static void countIncrease()
    {
        count++;
    }


}