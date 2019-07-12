package MutilThread.Thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 多线程下载图片
 */
public class DownLoadPicture {
    //下载
    public void download(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("不合法的url");
        }
    }
}
