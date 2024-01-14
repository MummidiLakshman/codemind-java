class Solution
{   
    public:
    vector<int> repeatedRows(vector<vector<int>> &matrix, int M, int N) 
    { 
        // Your code here
        map<vector<int>, int>mp;
        vector<int>v;
        int c=0;
        for(auto it:matrix)
        {
            if(mp.find(it)!=mp.end())
            {
                v.push_back(c);
            }
            mp[it]++;
            c+=1;
        }
        return v;
      
    } 
};
