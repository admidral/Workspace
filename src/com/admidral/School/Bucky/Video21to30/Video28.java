package com.admidral.School.Bucky.Video21to30;

import com.admidral.School.Reference.Ref;
import com.admidral.School.Util.Input;

/**
 * Created by pevi18 on 1/11/2016.
 */
public class Video28 {



	
	public static void main(String[] args) {
		System.out.println("How many grades do you want to enter");
		int noofgrade = Input.positiveinteger();
		int nogrades[] = new int[noofgrade];

		for(int i =0; i<noofgrade;i++){
			System.out.println("Please enter your next grade");
			nogrades[i]=Input.integer();
		}
		
		System.out.println("");
		System.out.println(Ref.ENDING + Ref.NAME + " on " + "1/11/2016");
	}//end of main
}//end of class
