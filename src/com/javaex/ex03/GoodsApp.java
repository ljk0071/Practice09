package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String str;
    	String[] details;
    	int sum=0;
    	System.out.println("상품을 입력해주세요(종료 q)");
    	List<Goods> goods = new ArrayList<Goods>();
    	while(true) {
	    	str = sc.nextLine();
	    	details = str.split(",");
	    	if (details[0].equals("q")) {
	    		break;
	    	}else {
	    		Goods stuff = new Goods(details[0],Integer.valueOf(details[1]),Integer.valueOf(details[2]));
	    		goods.add(stuff);
	    	}
    	}
    	System.out.println("[입력완료]\n=================");
    	for(int i=0;i<goods.size();i++) {
    		System.out.println(goods.get(i).getName()+"(가격:"+goods.get(i).getPrice()+")이"+goods.get(i).getCount()+" 개 입고 되었습니다.");
    		sum += goods.get(i).getCount();
    	}
    	System.out.println("모든 상품의 갯수는 "+sum+"입니다.");
    	sc.close();
    	
    	
    	
    
    }

}
