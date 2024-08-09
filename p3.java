//https://leetcode.com/problems/search-insert-position/

public class p3 {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.searchInsert());
    }
}
class Solution {
    public int searchInsert() {
        int[] nums={2,3,4,8,10};
        int target=6;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)break;
            else if(nums[i]+1==target)
            { 
                count++;
                break;
            }
            else if(nums[i]-1==target || nums[i]>target)break;
            else count++;
        }
        return count;
    }
}
//https://leetcode.com/problemset/?difficulty=EASY&page=1&topicSlugs=linked-list&sorting=W3sic29ydE9yZGVyIjoiQVNDRU5ESU5HIiwib3JkZXJCeSI6IkRJRkZJQ1VMVFkifV0%3D


