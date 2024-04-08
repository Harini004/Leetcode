class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length;
        Queue<Integer> stq = new LinkedList<>();
        Stack<Integer> sas = new Stack<>();
        for(int i = 0;i<len;i++)
            
        {
            sas.push(sandwiches[len-i-1]);
            stq.offer(students[i]);
            
        }
        int last = 0;
        while(stq.size()>0 && last <stq.size())
        {
            if(sas.peek()==stq.peek())
            {
                sas.pop();
                stq.poll();
                last = 0;
            }
            else
            {
                stq.offer(stq.poll());
                last++;
            }
        }
        return stq.size();
    }
}