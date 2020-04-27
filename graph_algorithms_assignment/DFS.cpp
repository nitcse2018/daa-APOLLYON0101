#include<iostream>
#include<vector>
#include<stack>
using namespace std;
int V;
vector<int> *vec;

void DFS(int initial, int visited[])
{
    visited[initial]=1;
    cout<<initial<<" ";
    for(auto i=vec[initial].begin();i!=vec[initial].end();i++)
        if(visited[*i]==0)
            DFS(*i,visited);

}

int main()
{
    int edge,initial;
    cout<<"Number of vertices:"<<endl;
    cin>>V;
    int visited[V]={0};
    vec=new vector<int>[V];
    cout<<"Number of edges:"<<endl;
    cin>>edge;
    int v1,v2;
    while(edge>0)
    {
        cin>>v1>>v2;
        vec[v1].push_back(v2);
        edge--;
    }
    cout<<"Initial vertex:"<<endl;
    cin>>initial;

    cout<<"The DFS traversal is : ";
    DFS(initial,visited);

    cout<<endl;
    return 0;
}
