class Solution 
{//O( (K logK)+ (N-K)log(N-K) )
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq=  new PriorityQueue((a, b)->{//we are creating a min heap, comparator customised sorting //DNS(Default Natural Sorting Order)
            return (int)a-(int)b;
        });
        
        for(int i= 0; i < k; i++)//inserting to the min heap and the peek or the root always be samllest about both the left and right subtree 
            pq.offer(nums[i]);
        //root <= left subtree min && right subtree min 
        /*
                    root
                /          \
            Left ST    Right ST
                                     */ //If we sort this it will be either Left Right Root or this Right Left Root (DESC)//3 size sliding window 
        
        for(int i= k; i<nums.length; i++)//traversing the array after kth index 
        {
            if(nums[i] > pq.peek())//only greater element than the peek(root of heap) affects the min heap, so only considering that case//while if we cosider the smaller element then it will not lead us to the kth largest Element 
            {    
                pq.poll();//polling the root of the min heap, since it is no longer valid//heap has a self balancing mechanism, it balances it according to the type of heap, in this case its min heap  
                pq.offer(nums[i]);//adding the node to the heap//heap balances itself
            }
        }   
        return pq.peek();//it returns the desired kth largest element in the Array 
    }
}//Please do Upvote, it helps a lot