class Solution {
    public int findCircleNum(int[][] M) {
        DSU dsu = new DSU(M.length);
        for (int i = 0; i < M.length; ++i) {
            for (int j = i; j < M[i].length; ++j)
                if (M[i][j] == 1) dsu.union(i, j);
        }
        return dsu.getNumFrdCir();
    }
}

class DSU {
    private int[] par = null, rnk = null;
    private int numFrdCir = 0;

    public DSU(int len) {
        this.numFrdCir = len;
        this.par = new int[len];
        this.rnk = new int[len];
        for (int i = 0; i < len; ++i)
			this.par[i] = i;
    }

    public int find(int x) {
        if (this.par[x] != x)
			this.par[x] = this.find(this.par[x]);
        return this.par[x];
    }

    public void union(int x, int y) {
        int xr = this.find(x),
            yr = this.find(y);
        if (xr == yr)
			return;
        else if (this.rnk[xr] < this.rnk[yr])
			this.par[xr] = yr;
        else if (this.rnk[xr] > this.rnk[yr])
			this.par[yr] = xr;
        else {
            this.par[yr] = xr;
            this.rnk[xr]++;
        }
        this.numFrdCir--;
    }
    
    public int getNumFrdCir() {
        return this.numFrdCir;
    }
}