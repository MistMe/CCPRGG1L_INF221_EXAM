public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'R', 'E', 'I', 'M', 'A', 'E', 'R', 'S', 'G', 'T' },
                { 'E', 'V', 'D', 'B', 'D', 'V', 'I', 'A', 'B', 'I' },
                { 'E', 'L', 'R', 'O', 'F', 'S', 'A', 'W', 'U', 'K' },
                { 'B', 'G', 'C', 'E', 'I', 'L', 'C', 'J', 'H', 'T' },
                { 'S', 'S', 'K', 'G', 'D', 'Z', 'H', 'S', 'T', 'O' },
                { 'V', 'M', 'J', 'A', 'V', 'H', 'Z', 'S', 'I', 'K' },
                { 'C', 'H', 'I', 'L', 'L', 'T', 'O', 'P', 'G', 'M' },
                { 'Y', 'S', 'P', 'I', 'T', 'A', 'P', 'R', 'W', 'D' },
                { 'G', 'B', 'D', 'S', 'T', 'K', 'P', 'W', 'S', 'O' },
                { 'G', 'T', 'L', 'H', 'Q', 'X', 'Q', 'L', 'O', 'E' },
        };

       // // =============================================================
        // ALAK - (10 points)
        System.out.println(" ");
        System.out.println("1. ALAK ");
        for (int row = 0; row < 10; row++) {
            System.out.println("");
            for (int column = 0; column < 10; column++) {
                if (row == 7 && (column == 5)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 6 && (column == 4)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 5 && (column == 3)) {
                    System.out.print(array[row][column]);
                }
                else if (row == 4 && (column == 2)) {
                    System.out.print(array[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
                

        // =============================================================
        // GITHUB - (10 points)
        System.out.println(" ");
        System.out.println("2. GITHUB ");
        for (int rows = 0; rows < 10; rows++) {
            System.out.println("");
            for (int columns = 0; columns < 10; columns++) {
                if (rows == 6 && (columns == 8)) {
                    System.out.print(array[rows][columns]);
                }
                else if (rows == 5 && (columns == 8)) {
                    System.out.print(array[rows][columns]);
                }
                else if (rows == 4 && (columns == 8)) {
                    System.out.print(array[rows][columns]);
                }
                else if (rows == 3 && (columns == 8)) {
                    System.out.print(array[rows][columns]);
                }
                else if (rows == 2 && (columns == 8)) {
                    System.out.print(array[rows][columns]);
                }
                else if (rows == 1 && (columns == 8)) {
                    System.out.print(array[rows][columns]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        // =============================================================
        //SISIG - (10 points)
        System.out.println(" ");
        System.out.println("3. SISIG ");
        for (int arow = 0; arow < 10; arow++) {
            System.out.println("");
            for (int acolumn = 0; acolumn < 10; acolumn++) {
                if (arow == 0 && (acolumn == 7)) {
                    System.out.print(array[arow][acolumn]);
                }
                else if (arow == 1 && (acolumn == 6)) {
                    System.out.print(array[arow][acolumn]);
                }
                else if (arow == 2 && (acolumn == 5)) {
                    System.out.print(array[arow][acolumn]);
                }
                else if (arow == 3 && (acolumn == 4)) {
                    System.out.print(array[arow][acolumn]);
                }
                else if (arow == 4 && (acolumn == 3)) {
                    System.out.print(array[arow][acolumn]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        // =============================================================
        // VSCODE - (10 points)
        System.out.println(" ");
        System.out.println("4. VSCODE ");
        for (int srow = 0; srow < 10; srow++) {
            System.out.println("");
            for (int scolumn = 0; scolumn < 10; scolumn++) {
                if (srow == 5 && (scolumn == 0)) {
                    System.out.print(array[srow][scolumn]);
                }
                else if (srow == 4 && (scolumn == 1)) {
                    System.out.print(array[srow][scolumn]);
                }
                else if (srow == 3 && (scolumn == 2)) {
                    System.out.print(array[srow][scolumn]);
                }
                else if (srow == 2 && (scolumn == 3)) {
                    System.out.print(array[srow][scolumn]);
                }
                else if (srow == 1 && (scolumn == 4)) {
                    System.out.print(array[srow][scolumn]);
                }
                else if (srow == 0 && (scolumn == 5)) {
                    System.out.print(array[srow][scolumn]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        // =============================================================
        // BEER - (10 points)
        System.out.println(" ");
        System.out.println("5. BEER ");
        for (int rowd = 0; rowd < 10; rowd++) {
            System.out.println("");
            for (int columnd = 0; columnd < 10; columnd++) {
                if (rowd == 3 && (columnd == 0)) {
                    System.out.print(array[rowd][columnd]);
                }
                else if (rowd == 2 && (columnd == 0)) {
                    System.out.print(array[rowd][columnd]);
                }
                else if (rowd == 1 && (columnd == 0)) {
                    System.out.print(array[rowd][columnd]);
                }
                else if (rowd == 0 && (columnd == 0)) {
                    System.out.print(array[rowd][columnd]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        // =============================================================
        // JAVA - (10 points)
        System.out.println(" ");
        System.out.println("6. JAVA ");
        for (int rowq = 0; rowq < 10; rowq++) {
            System.out.println("");
            for (int columnq = 0; columnq < 10; columnq++) {
                if (rowq == 3 && (columnq == 7)) {
                    System.out.print(array[rowq][columnq]);
                }
                else if (rowq == 2 && (columnq == 6)) {
                    System.out.print(array[rowq][columnq]);
                }
                else if (rowq == 1 && (columnq == 5)) {
                    System.out.print(array[rowq][columnq]);
                }
                else if (rowq == 0 && (columnq == 4)) {
                    System.out.print(array[rowq][columnq]);
                }
                 else{
                    System.out.print(" ");
                }
            }
        }
        // =============================================================
        // TIKTOK - (10 points)
        System.out.println(" ");
        System.out.println("7. TIKTOK ");
        for (int rowe = 0; rowe < 10; rowe++) {
            System.out.println("");
            for (int columne = 0; columne < 10; columne++) {
                if (rowe == 0 && (columne == 9)) {
                    System.out.print(array[rowe][columne]);
                }
                else if (rowe == 1 && (columne == 9)) {
                    System.out.print(array[rowe][columne]);
                }
                else if (rowe == 2 && (columne == 9)) {
                    System.out.print(array[rowe][columne]);
                }
                else if (rowe == 3 && (columne == 9)) {
                    System.out.print(array[rowe][columne]);
                }
                else if (rowe == 4 && (columne == 9)) {
                    System.out.print(array[rowe][columne]);
                }
                else if (rowe == 5 && (columne == 9)) {
                    System.out.print(array[rowe][columne]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        // =============================================================
        // CHILLTOP - (10 points)
        System.out.println(" ");
        System.out.println("8. CHILLTOP ");
        for (int rowx = 0; rowx < 10; rowx++) {
            System.out.println("");
            for (int columnx = 0; columnx < 10; columnx++) {
                if (rowx == 6 && (columnx == 0)) {
                    System.out.print(array[rowx][columnx]);
                }
                else if (rowx == 6 && (columnx == 1)) {
                    System.out.print(array[rowx][columnx]);
                }
                else if (rowx == 6 && (columnx == 2)) {
                    System.out.print(array[rowx][columnx]);
                }
                else if (rowx == 6 && (columnx == 3)) {
                    System.out.print(array[rowx][columnx]);
                }
                else if (rowx == 6 && (columnx == 4)) {
                    System.out.print(array[rowx][columnx]);
                }
                else if (rowx == 6 && (columnx == 5)) {
                    System.out.print(array[rowx][columnx]);
                }
                else if (rowx == 6 && (columnx == 6)) {
                    System.out.print(array[rowx][columnx]);
                }
                else if (rowx == 6 && (columnx == 7)) {
                    System.out.print(array[rowx][columnx]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        // =============================================================
        // REDHORSE - (10 points)
        System.out.println(" ");
        System.out.println("9. REDHORSE ");
        for (int rowy = 0; rowy < 10; rowy++) {
            System.out.println("");
            for (int columny = 0; columny < 10; columny++) {
                if (rowy == 2 && (columny == 2)) {
                    System.out.print(array[rowy][columny]);
                }
                else if (rowy == 3 && (columny == 3)) {
                    System.out.print(array[rowy][columny]);
                }
                else if (rowy == 4 && (columny == 4)) {
                    System.out.print(array[rowy][columny]);
                }
                else if (rowy == 5 && (columny == 5)) {
                    System.out.print(array[rowy][columny]);
                }
                else if (rowy == 6 && (columny == 6)) {
                    System.out.print(array[rowy][columny]);
                }
                else if (rowy == 7 && (columny == 7)) {
                    System.out.print(array[rowy][columny]);
                }
                else if (rowy == 8 && (columny == 8)) {
                    System.out.print(array[rowy][columny]);
                }
                else if (rowy == 9 && (columny == 9)) {
                    System.out.print(array[rowy][columny]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    
        // =============================================================
        // TIPSY - (10 points)
        System.out.println(" ");
        System.out.println("10. TIPSY ");
        for (int rowo = 0; rowo < 10; rowo++) {
            System.out.println("");
            for (int columno = 0; columno < 10; columno++) {
                if (rowo == 7 && (columno == 4)) {
                    System.out.print(array[rowo][columno]);
                }
                else if (rowo == 7 && (columno == 3)) {
                    System.out.print(array[rowo][columno]);
                }
                else if (rowo == 7 && (columno == 2)) {
                    System.out.print(array[rowo][columno]);
                }
                else if (rowo == 7 && (columno == 1)) {
                    System.out.print(array[rowo][columno]);
                }
                else if (rowo == 7 && (columno == 0)) {
                    System.out.print(array[rowo][columno]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    

        // =============================================================

        // BONUS
        // SLY starts to learn programming. The first task is drawing a fox! However, that turns out to be too hard for a beginner, so she decides to draw a snake instead.

        // A snake is a pattern on a n by m table. Denote c-th cell of r-th row as (r, c). The tail of the snake is located at (1, 1), then it's body extends to (1, m), then goes down 2 rows to (3, m), then goes left to (3, 1) and so on.

        // Your task is to draw this snake for Fox Ciel: the empty cells should be represented as dot characters ('.') and the snake cells should be filled with number signs ('#').

        // Consider sample tests in order to understand the snake pattern.
        
        
        // Input
        // The only line contains two integers: n and m (3 ≤ n, m ≤ 50).

        // n is an odd number.

        // Output
        // Output n lines. Each line should contain a string consisting of m characters. Do not output spaces.
        
        // Example
        // Input: 3 3
        
        // ###
        // ..#
        // ###
        // #..
        // ###
        
        
//         Input: 9 9
            
// #########
// ........#
// #########
// #........
// #########
// ........#
// #########
// #........
// #########
    }
}
    

