package ast;

import lexer.Symbol;
import lexer.Token;
import visitor.*;

public class TimestampTree extends AST {
    private Symbol symbol;

    public TimestampTree(Token tok) {
        this.symbol = tok.getSymbol();
    }

    public Object accept(ASTVisitor v) {
        return v.visitTimestampTypeTree(this);
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
