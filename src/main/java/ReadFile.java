/**
 * Created by yutao on 17/6/9.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FSDataInputStream;

public class ReadFile {
    public void readFile(String hdfs)throws IOException {
        Configuration conf =new Configuration();
        FileSystem fs = FileSystem.get(URI.create(hdfs),conf);
        FSDataInputStream hdfsInStream = fs.open(new Path(hdfs));

        BufferedReader br = new BufferedReader(new InputStreamReader(hdfsInStream));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        hdfsInStream.close();
        fs.close();
    }
}
