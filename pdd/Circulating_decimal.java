package pdd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 给出被除数和除数，求出循环小数的开始位置与循环长度
 *
 * 思想，模拟长除法的计算过程
 * mod = a % b
 * 小数 = （mod * 10）/b
 * mod = (mod * 10) % b
 * 当出现重复余数时，循环节开始
 */
public class Circulating_decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double aa = a;
        double bb = b;
        Map<Integer,Integer> map= new HashMap<>();
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(aa / bb);
        int mod = a % b;
        int startindex = 0;
        int criclelength = 0;
        stringBuffer.append(mod);
        map.put(mod,0);
        while(mod != 0) {
            mod = mod * 10 % b;
            if(map.containsKey(mod)) {
                startindex = map.get(mod);
                criclelength = stringBuffer.length() - stringBuffer.indexOf(""+mod);
                System.out.println(startindex+"&"+criclelength);
                break;
            }else if(mod == 0){
                System.out.println(stringBuffer.length()+"&"+criclelength);
            }
            map.put(mod,stringBuffer.length() - 1);
            stringBuffer.append(mod);
        }

    }
}
