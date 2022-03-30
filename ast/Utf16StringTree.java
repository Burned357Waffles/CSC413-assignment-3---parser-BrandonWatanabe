package ast;

import lexer.Symbol;
import lexer.Token;
import visitor.*;

public class Utf16StringTree extends AST {
    private Symbol symbol;

    public Utf16StringTree(Token tok) {
        this.symbol = tok.getSymbol();
    }

    public Object accept(ASTVisitor v) {
        return v.visitUtf16StringTree(this);
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
