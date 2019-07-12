package MutilThread.Runnable;

import MutilThread.Thread.DownLoadPicture;

public class iDownload implements Runnable{
    private String url;
    private String name;

    public iDownload(String url, String name) {
        this.url = url;
        this.name = name;
    }
    @Override
    public void run() {
        DownLoadPicture downLoadPicture = new DownLoadPicture();
        downLoadPicture.download(url,name);
    }

    public static void main(String[] args) {
        new Thread(new iDownload("http://image.zhangxinxu.com/image/study/s/s256/mm1.jpg","picture1.jpg")).start();
        new Thread(new iDownload("http://image.zhangxinxu.com/image/study/s/s256/mm2.jpg","picture2.jpg")).start();
        new Thread(new iDownload("http://image.zhangxinxu.com/image/study/s/s256/mm3.jpg","picture3.jpg")).start();
    }
}
