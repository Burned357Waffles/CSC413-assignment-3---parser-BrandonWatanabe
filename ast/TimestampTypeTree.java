package ast;

import visitor.*;

public class TimestampTypeTree extends AST{

    @Override
    public Object accept(ASTVisitor v) {
        return v. visitTimestampTypeTree(this);
    }
}
