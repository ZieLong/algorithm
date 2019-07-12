package MutilThread.Thread;

public class TDownload extends Thread{

    private String url; //远程路径
    private String name; //存储名字

    public TDownload(String url, String name) {
        this.name = name;
        this.url = url;
    }

    @Override
    public void run() {
        DownLoadPicture loadPicture = new DownLoadPicture();
        loadPicture.download(url,name);
    }

    public static void main(String[] args) {
        TDownload td1 = new TDownload("http://image.zhangxinxu.com/image/study/s/s256/mm1.jpg","picture1.jpg");
        TDownload td2 = new TDownload("http://image.zhangxinxu.com/image/study/s/s256/mm2.jpg","picture2.jpg");
        TDownload td3 = new TDownload("http://image.zhangxinxu.com/image/study/s/s256/mm3.jpg","picture3.jpg");

        td1.start();
        td2.start();
        td3.start();
    }

}
