package com.wzy.design.entity;

import com.wzy.design.base.AbstractEntity;

public class FilePath extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	/**
	 * 祖先文件夹
	 */
	private FileInfo ancestor;
	
	/**
	 * 子孙文件夹及文件
	 */
	private FileInfo descendant;
	
	public FileInfo getAncestor() {
		return ancestor;
	}
	public void setAncestor(FileInfo ancestor) {
		this.ancestor = ancestor;
	}
	public FileInfo getDescendant() {
		return descendant;
	}
	public void setDescendant(FileInfo descendant) {
		this.descendant = descendant;
	}
}
