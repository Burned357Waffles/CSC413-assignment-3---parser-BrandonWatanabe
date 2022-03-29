package lexer;
 
/**
 *  This file is automatically generated<br>
 *  it contains the table of mappings from token
 *  constants to their Symbols
*/
public class TokenType {
   public static java.util.HashMap<Tokens,Symbol> tokens = new java.util.HashMap<Tokens,Symbol>();
   public TokenType() {
     tokens.put(Tokens.Program, Symbol.symbol("program",Tokens.Program));
     tokens.put(Tokens.Int, Symbol.symbol("int",Tokens.Int));
     tokens.put(Tokens.BOOLean, Symbol.symbol("boolean",Tokens.BOOLean));
     tokens.put(Tokens.If, Symbol.symbol("if",Tokens.If));
     tokens.put(Tokens.Then, Symbol.symbol("then",Tokens.Then));
     tokens.put(Tokens.Else, Symbol.symbol("else",Tokens.Else));
     tokens.put(Tokens.While, Symbol.symbol("while",Tokens.While));
     tokens.put(Tokens.Function, Symbol.symbol("function",Tokens.Function));
     tokens.put(Tokens.Return, Symbol.symbol("return",Tokens.Return));
     tokens.put(Tokens.Identifier, Symbol.symbol("<id>",Tokens.Identifier));
     tokens.put(Tokens.INTeger, Symbol.symbol("<int>",Tokens.INTeger));
     tokens.put(Tokens.LeftBrace, Symbol.symbol("{",Tokens.LeftBrace));
     tokens.put(Tokens.RightBrace, Symbol.symbol("}",Tokens.RightBrace));
     tokens.put(Tokens.LeftParen, Symbol.symbol("(",Tokens.LeftParen));
     tokens.put(Tokens.RightParen, Symbol.symbol(")",Tokens.RightParen));
     tokens.put(Tokens.LeftBracket, Symbol.symbol("[",Tokens.LeftBracket));
     tokens.put(Tokens.RightBracket, Symbol.symbol("]",Tokens.RightBracket));
     tokens.put(Tokens.Comma, Symbol.symbol(",",Tokens.Comma));
     tokens.put(Tokens.Assign, Symbol.symbol("=",Tokens.Assign));
     tokens.put(Tokens.Equal, Symbol.symbol("==",Tokens.Equal));
     tokens.put(Tokens.NotEqual, Symbol.symbol("!=",Tokens.NotEqual));
     tokens.put(Tokens.Greater, Symbol.symbol(">",Tokens.Greater));
     tokens.put(Tokens.GreaterEqual, Symbol.symbol(">=",Tokens.GreaterEqual));
     tokens.put(Tokens.Less, Symbol.symbol("<",Tokens.Less));
     tokens.put(Tokens.LessEqual, Symbol.symbol("<=",Tokens.LessEqual));
     tokens.put(Tokens.Plus, Symbol.symbol("+",Tokens.Plus));
     tokens.put(Tokens.Minus, Symbol.symbol("-",Tokens.Minus));
     tokens.put(Tokens.Or, Symbol.symbol("|",Tokens.Or));
     tokens.put(Tokens.And, Symbol.symbol("&",Tokens.And));
     tokens.put(Tokens.Multiply, Symbol.symbol("*",Tokens.Multiply));
     tokens.put(Tokens.Divide, Symbol.symbol("/",Tokens.Divide));
     tokens.put(Tokens.Comment, Symbol.symbol("//",Tokens.Comment));
     tokens.put(Tokens.Hash, Symbol.symbol("#",Tokens.Hash));
     tokens.put(Tokens.Begin, Symbol.symbol("begin",Tokens.Begin));
     tokens.put(Tokens.End, Symbol.symbol("end",Tokens.End));
     tokens.put(Tokens.In, Symbol.symbol("in",Tokens.In));
     tokens.put(Tokens.Utf16String, Symbol.symbol("utf16string",Tokens.Utf16String));
     tokens.put(Tokens.Utf16StringLit, Symbol.symbol("<utf16string>",Tokens.Utf16StringLit));
     tokens.put(Tokens.TimestampType, Symbol.symbol("timestamp",Tokens.TimestampType));
     tokens.put(Tokens.TimestampLit, Symbol.symbol("<timestamp>",Tokens.TimestampLit));
   }
}
