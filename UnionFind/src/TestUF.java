public class TestUF {
    public static void main(String[] args) {
        int N = 10000;
        QuickFindUF qf = new QuickFindUF(N);
        QuickUnionUF qu = new QuickUnionUF(N);
        QuickUnionWithPathCompressionUF qupc = new QuickUnionWithPathCompressionUF(N);
        WeightedQuickUnionUF wqu = new WeightedQuickUnionUF(N);
        WeightedQuickUnionWithPathCompressionUF wqupc = new WeightedQuickUnionWithPathCompressionUF(N);

        //Quick Find
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N-1; i++){
            qf.connected(i, i+1);
            qf.union(i, i+1);
            qf.connected(i, i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Quick Find: " + (endTime - startTime) + " milliseconds");

        //Quick Union
        startTime = System.currentTimeMillis();
        for (int i = 0; i < N-1; i++){
            qu.connected(i, i+1);
            qu.union(i, i+1);
            qu.connected(i, i+1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Quick Union: " + (endTime - startTime) + " milliseconds");

        //Quick Union with Path Compression
        startTime = System.currentTimeMillis();
        for (int i = 0; i < N-1; i++){
            qupc.connected(i, i+1);
            qupc.union(i, i+1);
            qupc.connected(i, i+1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Quick Union with Path Compression: " + (endTime - startTime) + " milliseconds");

        //Weighted Quick Union
        startTime = System.currentTimeMillis();
        for (int i = 0; i < N-1; i++){
            wqu.connected(i, i+1);
            wqu.union(i, i+1);
            wqu.connected(i, i+1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Weighted Quick Union: " + (endTime - startTime) + " milliseconds");

        //Weighted Quick Union with Path Compression
        startTime = System.currentTimeMillis();
        for (int i = 0; i < N-1; i++){
            wqupc.connected(i, i+1);
            wqupc.union(i, i+1);
            wqupc.connected(i, i+1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Weighted Quick Union with Path Compression: " + (endTime - startTime) + " milliseconds");
    }
}
