/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guutong.chapter2;

/**
 *
 * @author GuutonG
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] numbers = {78,4545,1,54,5,985,98,847,8};
        
        for(int i = 0; i<numbers.length-1 ; i++){
            for(int j = 0; j<numbers.length-1 ;j++){
                if(numbers[i] < numbers[j]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for(int numb : numbers){
             System.out.println(numb+",");
        }
       
    }
}