package com.polyanski.visitor;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 15:13
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
