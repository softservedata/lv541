package com.softserve.edu07d;

import com.softserve.edu07c.Parent;

public class Child extends Parent {
	
    //@Override
	public int f() {
		return 2;
	}
	
	public int useF2() {
		return useF();
	}
}
