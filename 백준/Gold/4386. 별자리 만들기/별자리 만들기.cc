#include<iostream>
#include<vector>
#include<queue>
#include<algorithm>
#include<cmath>

using namespace std;

vector<pair<int, double>> vec[101];
vector<pair<double, double>> vdd;
int visited[101];
int n;
double result=0;

double Find_Distance(double x, double y, double xx, double yy)
{
    double dx = (x - xx) * (x - xx);
    double dy = (y - yy) * (y - yy);
    double Dist = sqrt(dx + dy);
 
    return Dist;
}
 
void prim()
{
    for (int i = 0; i < n; i++)
    {
        double x = vdd[i].first;
        double y = vdd[i].second;
 
        for (int j = i + 1; j < n; j++)
        {
            double xx = vdd[j].first;
            double yy = vdd[j].second;
            double Dist = Find_Distance(x, y, xx, yy);
 
            vec[i].push_back({j, Dist});
            vec[j].push_back({i, Dist});
        }
    }
    
    priority_queue<pair<double, int>> pq;
    for (int i = 0; i < vec[0].size(); i++)
    {
        int Next = vec[0][i].first;
        double Cost = vec[0][i].second;
 
        pq.push({-Cost, Next});
    }
    visited[0] = 1;
 
    while (pq.empty() == 0)
    {
        double Cost = -pq.top().first;
        int Cur = pq.top().second;
        pq.pop();
 
        if (visited[Cur] == 0)
        {
            visited[Cur] = 1;
            result+= Cost;
            
            for (int i = 0; i < vec[Cur].size(); i++)
            {
                int Next = vec[Cur][i].first;
                double nCost = vec[Cur][i].second;
 
                if (visited[Next] == 0) 
                    pq.push({-nCost, Next});
            }
        }
    }
}
 
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    result = 0;
    cin >> n;
  
    for(int i=0;i<n;i++){
        double a,b;
        cin >> a >> b;
        vdd.push_back({a,b});
    }
    prim();
    cout << result;
    return 0;
}
