package com.java.collectionsMap;

import java.util.Comparator;

public abstract class myComparator implements Comparator<Integer> {

	
	public int compare(Integer I1, Integer I2) {
		if (I1 > I2) {
			return -1;
		} else if (I1 < I2) {
			return +1;
		} else {
			return 0;
		}
	}
}
