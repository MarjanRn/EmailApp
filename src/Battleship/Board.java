package Battleship;

public class Board {
    private int noOfRows;
    private int noOfColumns;
    public enum  CellStatus{AVAILABLE , HIT, FAIL}

    public Board(){

        //get no of rows and columns


    }

    //initiate board
    public void initBoard(int noOfRows, int noOfColumns){
        CellStatus[][] waterBoard = new CellStatus[noOfRows-1][noOfColumns-1];
        CellStatus[] cellStatus = CellStatus.values();
        for (int i = 0; i < noOfRows ; i++)
            for (int j = 0; j < noOfColumns ; j++){
                waterBoard[i][j] = cellStatus[0];
            }

//            showBoard(waterBoard.);
    }

    public void showBoard(Board board){
        System.out.println(board);
    }


    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }
}
