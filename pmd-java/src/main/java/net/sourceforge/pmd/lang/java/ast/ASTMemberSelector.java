/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast;

import net.sourceforge.pmd.annotation.InternalApi;

/** @deprecated not a node */
@Deprecated
public class ASTMemberSelector extends AbstractJavaNode {

    @InternalApi
    @Deprecated
    public ASTMemberSelector(int id) {
        super(id);
    }

    @InternalApi
    @Deprecated
    public ASTMemberSelector(JavaParser p, int id) {
        super(p, id);
    }

    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }


    @Override
    public <T> void jjtAccept(SideEffectingVisitor<T> visitor, T data) {
        visitor.visit(this, data);
    }
}
