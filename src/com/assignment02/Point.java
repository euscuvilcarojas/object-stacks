package com.assignment02;

public class Point {
    int column;
    int row;

    public Point (int row, int column){
        setRow(row);
        setColumn(column);
    }

    @Override
    public String toString(){
        return String.format("[%d, %d]", getRow(), getColumn());
    }

    // Self generated code

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}

