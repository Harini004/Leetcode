class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int c;
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
  int min =0;
         
        for(Map.Entry<Integer,Integer> en : hm.entrySet())
          
        {
           System.out.println(en.getValue());
            int temp = en.getValue();
            if(temp ==1)
                return -1; 
            c =0;
                while(temp >3)
                {
                    c=c+1;
                    temp = temp-3;
                }
            if(temp>0)
                c=c+1;
            min+=c;
                
            
            
        }
        return min;
    }
}