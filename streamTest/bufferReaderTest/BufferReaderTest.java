package streamTest.bufferReaderTest;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderTest {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("text1.txt");
        BufferedReader br = new BufferedReader(fr);

        String temp = null;
        while ( (temp = br.readLine()) != null) {
            System.out.print(temp);
        }

        br.close();
    }
}
