package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	String[] details;
		String friend;
		List<Friend> fr = new ArrayList<Friend>();
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		for(int i=0;i<3;i++) {
			friend = sc.nextLine();
			details = friend.split(" ");
			Friend person = new Friend(details[0], details[1], details[2]);
			fr.add(person);
			}
		System.out.println(fr.toString());
		sc.close();
	}
		
}

