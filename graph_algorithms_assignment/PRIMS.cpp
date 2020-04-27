#include<bits/stdc++.h>
using namespace std;
int V;
typedef pair<int,int> p;

class Graph{
    unordered_map<int,list<p> > graph;

public:

    void edge(int u,int v,int d){
        graph[u].push_back({v,d});
    }


    void prim(int src){
        vector<int> parent(V,-1);
        vector<bool> mst(V,false);
        vector<int> distance(V,INT_MAX);
        distance[src]=0;

        set<p> s;

        s.insert({0,src});

        while(!s.empty())
        {
            auto init=*s.begin();
            int node=init.second;
            mst[node]=true;
            s.erase(s.begin());

            for(auto &i : graph[node]){
                int v=i.first;
                int weight=i.second;

                if(mst[v]==false && weight < distance[v]){
                    parent[v]=node;
                    distance[v]=weight;
                    s.insert({distance[v],v});
                }
            }
        }

        cout<<endl<<"The selected edges are: "<<endl;
        for (int i = 1; i < V; i++)
        cout<<parent[i]<<" - "<<i<<"  Weight: "<<distance[i]<<endl;
    }

};


int main(){

    int e;
    cout<<"Number of vertices:"<<endl;
    cin>>V;
    cout<<"Number of edges:"<<endl;
    cin>>e;
    int v1,v2,d;
    Graph g;
    while(e>0)
    {
        cin>>v1>>v2>>d;
        g.edge(v1,v2,d);
        e--;
    }
    int initial;
    cout<<"Initial vertex:"<<endl;
    cin>>initial;

    g.prim(initial);

}
