/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guutong.chapter2;

import java.util.Scanner;

/**
 *
 * @author GuutonG
 */
public class ShowEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
                if (i%2==0){
                    System.out.println(""+i);
                }
    }
    }
}
