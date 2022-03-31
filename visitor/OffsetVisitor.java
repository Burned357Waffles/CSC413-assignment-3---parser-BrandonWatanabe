package visitor;

import ast.*;
import java.util.HashMap;

public class OffsetVisitor extends ASTVisitor {
    private int[] currentOffset = new int[100];

    private HashMap<AST, Integer> astOffset = new HashMap<>();
    
    private int depth = 0;
    private int maxDepth = 0;

    private void offset(AST t) {

        if (depth > maxDepth)
        {
            maxDepth = depth;
        }
        astOffset.put(t, currentOffset[depth]);
        currentOffset[depth] += 2;

        depth++;
        visitKids(t);
        depth--;

        if (t.kidCount() > 0)
        {
            AST leftChild = t.getKid(1);
            AST rightChild = t.getKid(t.kidCount());
            int parentOffset = (astOffset.get(leftChild) + astOffset.get(rightChild)) / 2;

            if (astOffset.get(t) != null)
            {
                if (parentOffset < astOffset.get(t))
                {
                    int offsetDifference = astOffset.get(t) - parentOffset;
                    shiftKids(t, offsetDifference);
                }
                else
                {
                    astOffset.put(t, parentOffset);
                    currentOffset[depth] = astOffset.get(t) + 2;
                }
            }
        }
    }

    private void shiftKids(AST t, int offsetDifference) {
        if (astOffset.get(t) != null) {
            if (t.kidCount() == 0)
            {
                return;
            }

            for (int i = 1; i <= t.kidCount(); i++) {
                astOffset.put(t.getKid(i), astOffset.get(t.getKid(i)) + offsetDifference);
            }
            currentOffset[depth + 1] = astOffset.get(t.getKid(t.kidCount())) + 2;
            for (AST kid : t.getKids()) {
                depth++;
                shiftKids(kid, offsetDifference);
                depth--;
            }
        }
    }


    public HashMap<AST, Integer> getOffsetMap() {
        HashMap<AST, Integer> offset = astOffset;
        return offset;
    }


    public Object visitProgramTree(AST t) {
        offset(t);
        return null;
    }


    public Object visitBlockTree(AST t) {
        offset(t);
        return null;
    }


    public Object visitFunctionDeclTree(AST t) {
        offset(t);
        return null;
    }


    public Object visitCallTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitDeclTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitIntTypeTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitBoolTypeTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitFormalsTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitActualArgsTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitIfTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitWhileTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitReturnTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitAssignTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitIntTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitIdTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitRelOpTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitAddOpTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitMultOpTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitUtf16StringTypeTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitUtf16StringTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitTimestampTypeTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitTimestampTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitSwitchTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitSwitchBlockTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitCaseTree(AST t) {
        offset( t );
        return null;
    }


    public Object visitDefaultTree(AST t) {
        offset( t );
        return null;
    }
}