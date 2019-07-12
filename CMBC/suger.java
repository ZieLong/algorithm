package CMBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 分糖果；简单贪心
 */
public class suger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        List<Integer> listchild = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) !=' ') {
                listchild.add(str.charAt(i) - '0');
            }
        }
        BufferedReader bufferedReader1= new BufferedReader(new InputStreamReader(System.in));
        String str1 = bufferedReader1.readLine();
        List<Integer> suger = new ArrayList<>();
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) !=' ') {
                suger.add(str1.charAt(i) - '0');
            }
        }
        Collections.sort(listchild);
        Collections.sort(suger);
    }

}
