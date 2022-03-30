package ast;

import visitor.*;

public class Utf16StringTypeTree extends AST{

    @Override
    public Object accept(ASTVisitor v) {
        return v.visitUtf16StringTypeTree(this);
    }
}
