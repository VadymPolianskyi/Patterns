package com.polyanski.visitor;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 15:11
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
