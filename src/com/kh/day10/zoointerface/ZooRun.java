package com.kh.day10.zoointerface;

// µ¿¹°¿ø
public class ZooRun {
	public static void main(String [] args) {
		ZooKeeper zk = new ZooKeeper();
		zk.feed();
		zk.feed(new Tiger());
		zk.feed(new Lion());
		zk.feed(new Bear());
	}
}
