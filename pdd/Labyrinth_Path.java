package pdd;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * 假设一个探险家被困在了地底的迷宫之中，
 * 要从当前位置开始找到一条通往迷宫出口的路径。
 * 迷宫可以用一个二维矩阵组成，有的部分是墙，
 * 有的部分是路。迷宫之中有的路上还有门，
 * 每扇门都在迷宫的某个地方有与之匹配的钥匙，
 * 只有先拿到钥匙才能打开门。请设计一个算法，
 * 帮助探险家找到脱困的最短路径。如前所述，
 * 迷宫是通过一个二维矩阵表示的
 * ，每个元素的值的含义如下 0-墙，1-路，2-探险家的起始位置，
 * 3-迷宫的出口，
 * 大写字母-门，小写字母-对应大写字母所代表的门的钥匙
 */
public class Labyrinth_Path {
    static int rows; static int cols; static char[][]maze;
    static int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] rowAndcol = bufferedReader.readLine().split("\\s");
        rows = Integer.parseInt(rowAndcol[0]);
        cols = Integer.parseInt(rowAndcol[1]);
        maze = new char[rows][cols];
        for(int i = 0; i < rows; i++) {
            maze[i] = bufferedReader.readLine().toCharArray();
        }
        Node result = null;
        int row = 0;
        for(char[] r:maze){
            int col = 0;
            for(char c:r){
                if(c=='2'){
                    result = bfs(row,col);
                    break;
                }
                col++;
            }
            row++;
        }
        System.out.println(result.step);
    }

    public static Node bfs(int row, int col) {
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(new Node(row,col,0,0));
        Node.visit[row][col][0] = true;
        while(!queue.isEmpty()) {
            Node node = queue.pop();
            for(int i = 0; i< direction.length;i++) {
                int nrow = node.row + direction[i][0];
                int ncol = node.col + direction[i][1];
                if(nrow < 0 || nrow >= rows || ncol < 0 || ncol >= cols || maze[nrow][ncol] == '0') continue;
                char c = maze[nrow][ncol];
                if(c == '3')  return new Node(nrow,ncol,node.keys,node.step + 1);
                if(c<='Z'&&c>='A'&&
                        (node.keys&(1<<c-'A'))==0)continue;
                //如果是门，并且没有钥匙，则逃过
                int keys = node.keys;
                if(c<='z'&&c>='a')
                    keys = keys|(1<<c-'a');
                //具有相同的钥匙数时，不能往回走
                //只有拿到新的钥匙，才能判定这可能是有效路径，才能往回走
                if(!Node.visit[nrow][ncol][keys]){
                    Node.visit[nrow][ncol][keys] = true;
                    queue.add(new Node(nrow,ncol,keys,node.step+1));
                }
            }
        }
        return null;
    }

    static class Node{
        static boolean[][][] visit;
        int keys;
        int step;
        int col;
        int row;
        public Node(int row, int col, int keys, int step) {
            this.row = row;
            this.col = col;
            this.step = step;
            this.keys = keys;
            if(visit == null) {
                visit = new boolean[rows][cols][1024];
            }
        }
        public String toString() {
            return maze[row][col] + "";
        }
    }
}
