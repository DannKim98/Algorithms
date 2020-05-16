public class QuickUnionWithPathCompressionUF {
    private int[] id;

    public QuickUnionWithPathCompressionUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    private int root(int i){
        while(id[i] != i){
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int rp = root(p);
        int rq = root(q);
        id[rp] = rq;
    }
}
