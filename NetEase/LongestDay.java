package NetEase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 小易为了向他的父母表现他已经长大独立了,他决定搬出去自己居住一段时间。一个人生活增加了许多花费:
 * 小易每天必须吃一个水果并且需要每天支付x元的房屋租金。当前小易手中已经有f个水果和d元钱,
 * 小易也能去商店购买一些水果,商店每个水果售卖p元。
 * 小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,小易希望你来帮他计算一下他最多能独立生活多少天。
 */

public class LongestDay {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int f = Integer.parseInt(str[1]);
        int d = Integer.parseInt(str[2]);
        int p = Integer.parseInt(str[3]);
        int day;
        if(x * f > d) {
            day = d / x;
        }else {
            day = f + (d - x * f) / (p + x);
        }
        System.out.println(day);
    }
}
