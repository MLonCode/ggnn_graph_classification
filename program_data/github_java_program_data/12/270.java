/**********************************************************************
 * Copyright (C) 2007-2009  Stephan Schwiebert
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 * 
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301, USA.
 **********************************************************************/
package org.schwiebert.abl4j.suffixtree;

import org.apache.log4j.Logger;
import org.schwiebert.abl4j.data.ITreeBank;


public class Suffixtree {

	public int fix = 0;
	
	private Logger logger = Logger.getLogger(Suffixtree.class);

	public Suffixtree(ITreeBank tb, boolean prefixTree) {
		fix = prefixTree ? 1 : 0;
	}

	public void construct(int i) {
		logger.error("Suffixtree not yet implemented!! " + i);

	}

	public void align(Ftree[] ftrees) {
		logger.error("Suffixtree not implemented!!");
		// TODO Auto-generated method stub

	}

}
