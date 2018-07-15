


public class SudokuGame {

    public static final String MENU = "Welcome to Sudoku Game. Insert the values to complete the board " +
            "or write SUDOKU to see a solution."+ '\n' +
            " Example: '1,2,7' - means that in column 1 and row 2 the value 7 will be inserted. Remember about the comma between the numbers ','." + '\n' +
            "In order to exit the game please type 'EXIT'";
    public static final String SET_INPUT_INFORMATION="Specify number of column, number of row and a value to start inserting values or type SUDOKU to complete the board";
    private SudokuBoard sB = new SudokuBoard();
    private ElementValidator elementValidator=new ElementValidator(sB);
    private int columnIndex;
    private int rowIndex;
    private int elementValue;

    public SudokuBoard getSB() {
        return sB;
    }

    public boolean setTheElement(String userInput) throws NumberFormatException{
        boolean isSet = true;
        String[] elementData = userInput.split(",");
        columnIndex = Integer.parseInt(elementData[0])-1;
        rowIndex = Integer.parseInt(elementData[1])-1;
        elementValue = Integer.parseInt(elementData[2]);
        if(elementValidator.userInputCheck(columnIndex, rowIndex,elementValue)) {
            if ((elementValidator.columnElementValidator(columnIndex, rowIndex, elementValue)) &&
                    (elementValidator.rowElementValidator(columnIndex, rowIndex, elementValue)) &&
                    (elementValidator.positionEValidator(columnIndex, rowIndex, elementValue))) {
                sB.getBoard().get(rowIndex).getRow().get(columnIndex).setValue(elementValue);
                System.out.println("Inserted.");
                isSet=true;
            } else {
                System.out.println("The value cannot be inserted: " + (elementValue) + " in filed: column: " +
                        (columnIndex + 1) + ", row: " + (rowIndex + 1));
                isSet=false;
            }
        }
        return isSet;
    }

    public boolean resolvingElementValidator(int valColumnIndex, int valRowIndex, int elementValue){
            if (elementValidator.columnResElValidator(valColumnIndex, elementValue) && elementValidator.rowResElValidator(valRowIndex, elementValue) &&
                    elementValidator.positionEValidator(valColumnIndex, valRowIndex, elementValue)) {
                sB.getBoard().get(valRowIndex).getRow().get(valColumnIndex).setValue(elementValue);
                return true;
            }
             return false;
    }

    public void printSudokuBoard (){
        for (SudokuRow r: sB.getBoard())
            System.out.println(r);
    }

    public boolean resolveSudoku(SudokuBoard sB) {
        for (int row=0;row<9;row++){
            for (int column=0; column<9; column++){
                if(sB.getBoard().get(row).getRow().get(column).getValue()==0) {
                    for (int e = 1; e < 10; e++) {
                        if (resolvingElementValidator(column, row, e) &&
                                resolveSudoku(sB)) {
                            return true;
                        }
                        sB.getBoard().get(row).getRow().get(column).setValue(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }
}