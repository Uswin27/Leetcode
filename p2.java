import java.util.List;
import java.util.ArrayList;
class p2
{
    public static void main(String[] args) {     
        Solution s=new Solution();
        s.spiralOrder();
    }
}
class Solution {
    public void  spiralOrder() {
        int[][] matrix={{2,5,8},{4,0,-1}};
        int top=0,right=matrix[0].length-1,bottom=matrix.length-1,left=0;
        List<Integer> list=new ArrayList();
        while(top <= bottom && left <= right){
            for(int column=top;column<=right;column++)
            {
                list.add(matrix[top][column]);
            }
            //incrementing 1st row to next row
            top++;
            for(int column=top;column<=bottom;column++)
            {
                list.add(matrix[column][right]);
            }
            //incrementing matrix.length to  column to before column 
            right--;
            if(top<=bottom)
            {
                for(int column=right;column>=left;column--)
                {
                list.add(matrix[bottom][column]);
                }
                bottom--;
            }
            //going down row so that +
            if(right>=left)
            {
                for(int column=bottom;column>=top;column--)
                {
                    list.add(matrix[column][left]);
                }
            left++;
            }
        }
        System.out.println(list);
}
}