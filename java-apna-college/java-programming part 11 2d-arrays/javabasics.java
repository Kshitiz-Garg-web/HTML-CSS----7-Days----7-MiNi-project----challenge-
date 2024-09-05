import java.util.*;

public class javabasics {

    // ........to find a key
    // public static boolean search( int matrix[][],int key){
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[0].length; j++) {
    // if(matrix[i][j]==key){
    // System.out.println(i+" , "+j);
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // .............to fina a max and min no. from 2d array
    // public static void max(int matrix[][]){
    // int max=Integer.MIN_VALUE;
    // int min=Integer.MAX_VALUE;
    // for(int i=0;i<matrix.length;i++){
    // for(int j=0;j<matrix[0].length;j++){
    // max=Math.max(max,matrix[i][j]);
    // min=Math.min(min,matrix[i][j]);
    // }

    // }
    // System.out.println(max);
    // System.out.println(min);

    // }

    // ..................................to find a diagonal elemnts
    // .................................................................app1 brut
    // force
    // public static void diagonalsum(int mat[][]){
    // int sum=0;
    // for(int i=0;i<mat.length;i++){
    // for(int j=0;j<mat[0].length;j++){
    // if(i==j || (i+j) == (mat.length-1)){
    // sum=sum+mat[i][j];
    // }
    // }
    // }
    // System.out.println(sum);
    // }

    // ...............................APPROACH 2
    public static void diagonalsum(int mat[][]){
    int sum=0;
    for(int i=0;i<mat.length;i++){
    sum=sum+mat[i][i];
    if(i!=mat.length-1-i){
    sum=sum+mat[i][mat.length-1-i];
    }
    }
    System.out.println(sum);

    }

    // ..................................................................ass ques

    // ...........................ques 1
    // public static void countnum(int mat[][], int key){
    // int count=0;
    // for(int i=0;i<mat.length;i++){
    // for(int j=0;j<mat[0].length;j++){
    // if(mat[i][j]==key){
    // count++;
    // }
    // }
    // }
    // System.out.println(count);
    // }

    // ...........................ques 2
    // public static void sumrow(int mat[][],int row){
    // int sum=0;
    // for(int j=0;j<mat[0].length;j++){
    // sum=sum+mat[row][j];
    // }
    // System.out.println(sum);
    // }

    // ...............................ques 3
    // public static void transpose(int mato[][]){
    // int m =mato.length;
    // int n = mato[0].length;
    // for(int i=0;i<m;i++){
    // for(int j=0;j<n;j++){
    // int temp=m;
    // m=n;
    // n=temp;

    // if(i!=j){
    // int tempp=mato[i][j];
    // mato[i][j]=mato[j][i];
    // mato[j][i]=tempp;

    // }
    // System.out.print(mato[i][j]);

    // }
    // System.out.println();
    // }
    // }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // ..................output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();

        }

        // ..................to fina a key
        // search(matrix,1);
        // .............to find max and min out from 2d arrays
        // max(matrix);

        // ......................diagonal sum
        // int mat[][]={{1,2,3,4},
        // {5,6,7,8},
        // {9,10,11,12},
        // {13,14,15,16}};

        // int mat[][]={{1,2,3},
        // {4,5,6},
        // {7,8,9}};
        // diagonalsum(mat) ;

        // ................................................ass ques
        // ................................ques 1
        // int mat[][]={{1,2,3,4},
        // {-1,15,7,8},
        // {9,10,-1,12},
        // {-1,14,-1,15}};
        // countnum(mat,-1);

        // ...........................ques 2
        // int mat[][]={{1,2,3,4},
        // {-1,15,7,8},
        // {9,10,-1,12},
        // {-1,14,-1,15}};
        // sumrow(mat,0) ;

        // ........................ques 3
        // int mato[][]={{1,2,3},
        // {4,5,6},
        // {7,8,9}};

        // transpose(mato);

    }

}
