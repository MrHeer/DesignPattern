package com.mrheer.designpattern.visitorpattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
