/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faceatendancesystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author amine gasa
 */
public class FaceAtendanceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
       int test=x.nextInt();
        for (int t = 1; t <= test; t++) {
            ArrayList<Integer> list=new ArrayList<Integer>();
             ArrayList<Integer> queue=new ArrayList<Integer>();
             int n=x.nextInt();
             long X=x.nextInt();
             long ar[]=new long[n];
             for (int i = 0; i < n; i++) {
                ar[i]=x.nextInt();
                queue.add(i+1);
            }
             while(queue.size()!=0){
               if(ar[queue.get(0)-1]-X>0){
                   ar[queue.get(0)-1]=ar[queue.get(0)-1]-X;
                   queue.add(queue.remove(0));
               }else{
                   list.add(queue.remove(0));
               }
             }String s="";
            for (int i = 0; i < list.size(); i++) {
                s+=list.get(i)+" ";
            }
            System.out.println("Case #"+t+": "+s);
        }
    }
    
}
