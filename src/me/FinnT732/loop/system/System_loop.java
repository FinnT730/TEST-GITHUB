package me.FinnT732.loop.system;

import java.awt.RenderingHints;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;

public class System_loop extends LookupOp {

	public System_loop(LookupTable arg0, RenderingHints arg1) {
		super(arg0, arg1);
		arg1.clear();
	}

}
