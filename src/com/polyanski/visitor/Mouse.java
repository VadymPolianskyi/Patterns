package com.polyanski.visitor;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 15:14
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
