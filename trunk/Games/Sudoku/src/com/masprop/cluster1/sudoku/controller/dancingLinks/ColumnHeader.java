package com.masprop.cluster1.sudoku.controller.dancingLinks;

public class ColumnHeader extends Node {



	int size;
	String name;
	
	  public void addNode(final Node node) {
	        node.columnHeader = this;
	        node.down = this;
	        node.up = this.up;
	        up.down = node;
	        up = node;
	        size++;
	    }
	  
		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

//choose column
/*
 *  set s <- infinity.
 *   for each j <- R[h], R[R[h]], ..., while j != h,
 *       if S[j] < s    set c <- j and s <- S[j].
 */
public void chooseColumn()
{
//	   int s = Integer.MAX_VALUE;
//        ColumnHeader cHeadForColumn = null;
//
//        for (ColumnHeader nextColumnHeader = (ColumnHeader)rootNode.right;
//        nextColumnHeader != rootNode;
//        nextColumnHeader = (ColumnHeader) nextColumnHeader.right) {
//            if (nextColumnHeader.size < s) {
//                s = nextColumnHeader.size;
//                cHeadForColumn = nextColumnHeader;
//            }
//        }
//
//        return cHeadForColumn;
}
	
	
}
