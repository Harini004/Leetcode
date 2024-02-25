/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer,Employee> m;
    public int getImportance(List<Employee> employees, int id) {
        m = new HashMap<>();
        for(Employee nei: employees)
        {
            m.put(nei.id, nei);
        }
        return dfs(id);
    }
    public int dfs(int id)
    {
        Employee emp = m.get(id);
        int ans = emp.importance;
        for(Integer subid : emp.subordinates)
        {
            ans+=dfs(subid);
        }
        return ans;
    }
}