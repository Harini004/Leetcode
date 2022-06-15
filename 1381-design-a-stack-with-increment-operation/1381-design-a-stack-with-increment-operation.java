class  CustomStack {
    int []arr;
    int index;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        index = -1;
    }
    
    public void push(int x) {
        if(index!=arr.length-1)
        {
            index++;
            arr[index]=x;
        }
    }
    
    public int pop() {
        if(index==-1)
        {
            return -1;
        }
        else
        {
            int val = arr[index];
            arr[index--] = 0;
            return val;
        }
    }
    
   public void increment(int k, int val) {
        int size=0;
      
        if (index+1 <k)
        {
            for (int i=0;i<=index;i++)
            {
                arr[i]+=val;
            }
        }
        else
        {
            for (int i=0;i<k;i++)
            {
                arr[i]+=val;
            }
        }
    }
}


/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */