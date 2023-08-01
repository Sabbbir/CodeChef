import java.util.Scanner;

/**
 * A_Beautiful_Matrix
 */
public class A_Beautiful_Matrix {

    public static void main(String[] args) {
        int row=5,col=5,i, cons = 13, movi, movj, count = 0;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];

        for(i = 0; i<5;i++) {
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
                count++;
                if(arr[i][j]==1){
                    cons=count;
                }
            }
        }
        for(i = 0; i<5;i++) {
            for(int j=0;j<5;j++){
                 if(arr[i][j] == 1){
                    row = i;
                    col = j;

                 }
                
            }
            
            }
            if(row>2){
                movi = row-2;
            }
            else if(row==2){
                movi =0;
            }
            else{
                movi = 2-row;
            }
            if(col>2){
                movj = col-2;
            }
            else if(col==2){
            movj = 0;
            }
            else{
                movj=2-col;
            }

            System.out.println(movi+movj);

            }

        }
            
      

    
