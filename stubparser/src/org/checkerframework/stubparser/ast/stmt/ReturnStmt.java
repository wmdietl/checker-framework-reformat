/*
 * Copyright (C) 2007 Júlio Vilmar Gesser.
 *
 * This file is part of Java 1.5 parser and Abstract Syntax Tree.
 *
 * Java 1.5 parser and Abstract Syntax Tree is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Java 1.5 parser and Abstract Syntax Tree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Java 1.5 parser and Abstract Syntax Tree.  If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Created on 04/11/2006
 */
package org.checkerframework.stubparser.ast.stmt;

import org.checkerframework.stubparser.ast.expr.Expression;
import org.checkerframework.stubparser.ast.visitor.GenericVisitor;
import org.checkerframework.stubparser.ast.visitor.VoidVisitor;

/**
 * @author Julio Vilmar Gesser
 */
public final class ReturnStmt extends Statement {

    private Expression expr;

    public ReturnStmt() {}

    public ReturnStmt(Expression expr) {
        this.expr = expr;
    }

    public ReturnStmt(int beginLine, int beginColumn, int endLine, int endColumn, Expression expr) {
        super(beginLine, beginColumn, endLine, endColumn);
        this.expr = expr;
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    public Expression getExpr() {
        return expr;
    }

    public void setExpr(Expression expr) {
        this.expr = expr;
    }
}
