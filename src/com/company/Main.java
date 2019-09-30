package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.println("NHAP SO TIEN VND: ");
        float vnd=scanner.nextFloat();
         System.out.println(vnd+"vnd = "+ vndTousd(vnd)+" usd");
        System.out.println("nhap so tien usd: ");
        float usd=scanner.nextFloat();
         System.out.println(usd+"usd= "+usdTovnd(usd)+" vnd");
    }
    public static float usdTovnd(float usd){
        return  usd*23000;
    }
    public static float vndTousd(float vnd){
        return vnd/23000;
    }
}
