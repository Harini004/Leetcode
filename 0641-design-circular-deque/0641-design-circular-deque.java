class MyCircularDeque {
    static Deque<Integer> dq;
    static int len;
    public MyCircularDeque(int k) {
        dq = new LinkedList<>();
        len = k;
    }
    
    public boolean insertFront(int value) {
        if(dq.size()<len)
        {
            dq.addFirst(value);
            return true;
        }
        return false;
        
    }
    
    public boolean insertLast(int value) {
        if(dq.size()<len)
        {
            dq.addLast(value);
            return true;
        }
        return false;        
    }
    
    public boolean deleteFront() {
        if(dq.size()>0)
        {
            dq.removeFirst();
            return true;
        }
        return false;        
    }
    
    public boolean deleteLast() {
        if(dq.size()>0)
        {
            dq.removeLast();
            return true;
        }
        return false;        
    }
    
    public int getFront() {
        if(dq.size()<=0)
        { 
            return -1;
        }
        return dq.getFirst();      
    }
    
    public int getRear() {
        if(dq.size()<=0)
        { 
            return -1;
        }
        return dq.getLast();          
    }
    
    public boolean isEmpty() {
        if(dq.size()<=0)
        { 
            return true;
        }
        return false;          
    }
    
    public boolean isFull() {
        if(dq.size()==len)
        { 
            return true;
        }
        return false;          
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */