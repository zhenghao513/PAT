import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Main {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static int nextInt() throws IOException {
        in.nextToken();
        return (int) in.nval;
    }

    static class Edge {
        int[] arr;

        public Edge(int[] arr) {
            this.arr = arr;
        }
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt(), m = nextInt();
        Edge[] edges = new Edge[n + 1];
        for (int i = 1; i <= n; i++) {
            int k = nextInt();
            int[] t = new int[k + 1];
            for (int j = 1; j <= k; j++) {
                t[j] = nextInt();
            }
            edges[i] = new Edge(t);
        }
        int[] backup = new int[101];
        int pos = 1;
        for (int i = 0; i < m; i++) {
            int k = nextInt();
            int v = nextInt();
            if (k == 0) {
                pos = edges[pos].arr[v];
            } else if (k == 1) {
                backup[v] = pos;
                System.out.println(pos);
            } else if (k == 2) {
                pos = backup[v];
            }
        }
        System.out.println(pos);
    }
}