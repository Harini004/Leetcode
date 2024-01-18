class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int c=0;
        for(int i:tasks)
        {
            if(!hm.containsKey(i))
            {
             
                hm.put(i,1);
            }
            else
            {
                hm.put(i,hm.get(i)+1);
             
            }
        }
         
        for(Map.Entry<Integer,Integer> en : hm.entrySet())
          
        {
           System.out.println(en.getValue());
            int temp = en.getValue();
            if(temp ==1)
                return -1; 
           c += (temp+2) /3;
                
            
            
        }
        return c;
    }
}