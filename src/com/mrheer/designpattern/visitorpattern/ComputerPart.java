package com.mrheer.designpattern.visitorpattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
