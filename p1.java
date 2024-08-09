import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String args[])
    {
        int countable=0;
        int[][]  matrix ={{3,7,8},{9,11,13},{15,16,17}};
        int[] val=new int[matrix.length];
        int[] counting=new int[matrix.length];
        List<Integer> finalValue=new ArrayList();
        for(int i=0;i<matrix.length;i++)
        {       
            int[] row=new int[matrix[i].length]; 
            //checking with column
            for(int j=0;j<matrix[i].length;j++)
            {
                row[j]=matrix[i][j];
            }
            ismini(row,val,counting,countable);
            countable++;
        }
        ismax(matrix,val,counting,finalValue);
        
}
public static  void ismini(int[] arr,int[] val,int[] counting,int countable)
{
    int minimum=0;
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        minimum=arr[i];
     for(int j=i+1;j<arr.length;j++)
        {
            if(minimum>arr[j])
            {
                minimum=arr[j];
            }
        }
        break;
    }
    for(int i=0;i<arr.length;i++,count++)
    {
        if(arr[i]==minimum)break;
    }
    val[countable]=minimum;
    counting[countable]=count;
    

    
}
        
public static void ismax(int[][] arr,int[] val,int[] counting,List finalValue)
{
    int j=0;
    for(int i=0;i<arr.length;i++)
    {
        for(j=0;j<arr.length;j++)
        {
            if(val[i]==arr[j][counting[i]])continue;
            if(val[i]<arr[j][counting[i]])break;
        } 
        if(j==arr.length)System.out.println(val[i]);
    }
}
}




