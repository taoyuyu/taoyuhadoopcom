import java.io.IOException;

/**
 * Created by yutao on 17/6/9.
 */
public class TestHDFS {
    public static void main(String[] args) throws IOException {
        ReadFile rf = new ReadFile();
        rf.readFile("hdfs://localhost:9000/user/taoyu/test");
    }
}
