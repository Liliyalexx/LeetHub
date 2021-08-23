/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> map=new HashMap<>();
        if(node==null){
            return null;
        }
        map.put(node,new Node(node.val,new ArrayList<>()));
        dfs(map,node);
        return map.get(node);
    }
    public static void dfs(HashMap<Node,Node> map,Node node){
        for(Node neighbor: node.neighbors){
            if(!map.containsKey(neighbor)){
                map.put(neighbor,new Node(neighbor.val,new ArrayList<>()));
                 dfs(map,neighbor);
            }
           
            map.get(node).neighbors.add(map.get(neighbor));
            
        }
    }
}