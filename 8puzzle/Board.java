import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Board {
    private final short dim;
    private final String stringBoard;
    private final short[] arr;
    private final int arrDim;
    public Board(int[][] blocks) {
        dim=(short) blocks.length;
        arrDim=dim*dim;
        short k=0;
        short[] arrBlocks=new short[arrDim];
        for (short i = 0; i <(blocks.length) ; i++) {
            for (short j = 0; j <(blocks[0].length) ; j++) {
                arrBlocks[k]=(short) blocks[i][j];
                k++;
            }
        }
        arr=Arrays.copyOf(arrBlocks,arrDim);
        stringBoard=toString();
    }          // construct a board from an n-by-n array of blocks
    // (where blocks[i][j] = block in row i, column j)
    public int dimension(){return (int) dim;}                 // board dimension n
    public int hamming(){return 0;}                   // number of blocks out of place
    public int manhattan(){return 0;}                 // sum of Manhattan distances between blocks and goal
    public boolean isGoal(){return true;}                // is this board the goal board?
    public Board twin(){return null;}                    // a board that is obtained by exchanging any pair of blocks
    public boolean equals(Object y){
        if(y==this) return true;
        if(y==null) return false;
        if(y.getClass()!=this.getClass()) return false;
        /*for (short i = 0; i <arrDim; i++) {
            if(this.arr[i]!=y.arr[i]) return false;
        }
        return true;*/
        if(this.toString().equals(y.toString())) return false;
        else return true;

    }        // does this board equal y?
    public Iterable<Board> neighbors() {return null;}     // all neighboring boards
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(dim + "\n");
        for (short k = 0; k <(dim*dim) ; k++) {
            s.append(String.format("%2d ", arr[k]));
            if((k+1)%dim==0) s.append("\n");
        }
        return s.toString();
    }               // string representation of this board (in the output format specified below)

    public static void main(String[] args) { // unit tests (not graded)
        StdOut.println("Board started.");
    }
    }
