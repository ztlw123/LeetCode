package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * @Author zjh
 * @Date 2018/09/16,20:52
 */
public class Test {
    public static void main(String[] args) throws IOException {

        int port = 19030;

        ServerSocket server = new ServerSocket(port);

        InputStream is;
        InputStreamReader isr;
        BufferedReader br;

        String str = null;

        Socket client;
        while(true) {

            client = server.accept();
            is = client.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            while ((str = br.readLine()) != null) {
                char s = str.charAt(0);
                System.out.println(s);
            }
            client.shutdownInput();//πÿ±’ ‰»Î¡˜

            br.close();
            isr.close();
            is.close();
            client.close();
        }

    }
}
