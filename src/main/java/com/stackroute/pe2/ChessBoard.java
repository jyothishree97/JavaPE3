package com.stackroute.pe2;

public class ChessBoard {
  public String[][] chessPattern(int n1,int n2){
      int k=0;
      String str[][]=new String[n1][n2];
      for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
              k++;
              if(k%2==0) {
                  str[i][j] = "BB";
              }
                  else
                      str[i][j]="WW";
              }
          k++;
          }
        return str;
      }
  }


