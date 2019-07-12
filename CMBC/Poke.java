package CMBC;

import java.util.*;
public class Poke{
    public static void main(String[] args){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=1;i<=13;i++){
            map.put(i,4);
        }
        int sum1=0;
        int sum2=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            Integer key=sc.nextInt();
            if(i<3)
                sum1+=key;
            else
                sum2+=key;

            map.put(key,map.get(key)-1);
        }
        int num=0;
        for(Map.Entry<Integer,Integer> M:map.entrySet()){
            if(M.getValue()==0)
                continue;
            map.put(M.getKey(),M.getValue()-1);//这里的M.getValue() 会取到跟新后的值
            for(Map.Entry<Integer,Integer> m:map.entrySet()){
                if(m.getValue()==0)
                    continue;
                if(m.getKey()+sum2<M.getKey()+sum1)
                    num+=m.getValue()*(M.getValue()+1);//千万注意这里 刚拿走一 这里要加上
            }
            map.put(M.getKey(),M.getValue()+1);//拿走后 这里要加上
        }
        System.out.printf("%.4f\n", num*1.0/(46*45));
    }
}