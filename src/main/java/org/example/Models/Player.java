package org.example.Models;

import java.util.Scanner;

public class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name, Symbol symbol, PlayerType playerType){
        this.name = name;
        this.symbol=symbol;
        this.playerType=playerType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Move makeMove() {

        System.out.println("please enter the row index for move");
        int row = scanner.nextInt();
        System.out.println("please enter the row index for move");
        int col = scanner.nextInt();

        return new Move(this,new Cell(row,col));
    }
}
