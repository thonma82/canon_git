package p15;

import p19.baseball;
import p19.controller;
import p19.mario;

public class Start {

	public static void main(String[] args) {
		controller[] list = new controller[2];
		list[0] = new baseball();
		list[1] = new mario();

		for (controller con : list) {
			con.pushA();
			con.pushB();
			System.out.println("------------");
		}

	}
}