package day7.chapter6;

public class ChessDemo {
  public static void main(String[] args) {
    WorldChess worldChess = new WorldChess();
    System.out.println(worldChess.getFirstPlayer());
  }
}

class Chess {
  final ChessPlayer getFirstPlayer(){
    return ChessPlayer.WHITE;
  }
}

enum ChessPlayer {
  WHITE, BLACK
}

class WorldChess extends Chess {
//  ChessPlayer getFirstPlayer(){
//    return ChessPlayer.BLACK;
//  }
}