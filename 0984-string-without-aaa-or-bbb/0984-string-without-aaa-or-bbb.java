class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int countA =0,countB = 0;
        while(a>0 && b>0)
        {
            
           if(a>=b && countA <2)
           {
               sb.append('a');
               countA++;
               countB = 0;
               a--;
           }
            
           else if(a>=b && countA ==2)
           {
               sb.append('b');
               countB++;
               countA = 0;
               b--;
           }
            
           else if(b>=a && countB <2)
           {
               sb.append('b');
               countB++;
               countA = 0;
               b--;
           }
            
           else if(b>=a && countB ==2)
           {
               sb.append('a');
               countA++;
               countB = 0;
               a--;
           }
            
        }
        while(b>0)
        {
            sb.append('b');
            b--;
        }
        while(a>0)
        {
            sb.append('a');
            a--;
        }

        return sb.toString();
    }
}