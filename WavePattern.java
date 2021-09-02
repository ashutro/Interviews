import java.util.Scanner;

public class WavePattern {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[][]  arr = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};

        int top = 0, bottom = arr.length-1;
        int  right = arr[top].length-1,left = 0;
        int count = (bottom+1)*(right+1),dir = 1;

        while(top<=bottom && left<=right ){
            if(count > 0){
                if(dir == 1){
                    for(int i=left;i<=right;i++){
                        System.out.print(arr[top][i]);
                        System.out.print(" ");
                        count--;
                    }
                    dir = 2;
                    top++;
                }
                if(count>0){
                    if(dir == 2){
                        for(int i = right; i >= left;i--){
                            System.out.print(arr[top][i]);
                            System.out.print(" ");
                            count--;
                        }
                        dir = 3;
                        top++;

                    }
                }
                if(count>0){
                    if(dir == 3){
                        for(int i = left;i<=right;i++){
                            System.out.print(arr[top][i]);
                            System.out.print(" ");
                            count--; 
                        }
                        dir = 4;
                        top++;
                    }
                }
                if(count>0){
                    if(dir == 4){
                        for(int i = right; i>=left;i--){
                            System.out.print(arr[top][i]);
                            System.out.print(" ");
                            count--;
                        }
                        dir = 1;
                        top++;
                    }
                }
            }
        }
    
       
    }
    
}
