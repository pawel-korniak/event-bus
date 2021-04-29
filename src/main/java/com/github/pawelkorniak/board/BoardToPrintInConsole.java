package com.github.pawelkorniak.board;

class BoardToPrintInConsole implements BoardToPrint {
    private String content;

    public BoardToPrintInConsole(String content) {
        this.content = content;
    }

    public String printBoard() {
        return content;
    }
}

