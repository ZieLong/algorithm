package iqy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Fly_Num {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String arg[] = bf.readLine().split("\\s");
        int nums = Integer.parseInt(arg[0]);
        int sums = Integer.parseInt(arg[1]);
        String array[] = bf.readLine().split("\\s");
        int[] arrays = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            arrays[i] = Integer.parseInt(array[i]);
        }
        int count = 0;
        for(int i = 0; i < nums; i++) {
            sums -= arrays[i];
            if(sums >= 0) {
                count++;
                continue;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
