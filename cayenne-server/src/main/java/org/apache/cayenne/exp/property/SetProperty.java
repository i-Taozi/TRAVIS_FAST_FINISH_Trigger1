/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/

package org.apache.cayenne.exp.property;

import java.util.Set;

import org.apache.cayenne.Persistent;
import org.apache.cayenne.exp.Expression;
import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.exp.parser.ASTPath;

/**
 * Property that represents to-many relationship mapped on {@link Set}.
 *
 * @see org.apache.cayenne.exp.property
 * @since 4.2
 */
public class SetProperty<V extends Persistent> extends CollectionProperty<V, Set<V>> {

    /**
     * Constructs a new property with the given name and expression
     *
     * @param name           of the property (will be used as alias for the expression)
     * @param expression     expression for property
     * @param entityType     type of related entity
     */
    protected SetProperty(String name, Expression expression, Class<V> entityType) {
        super(name, expression, Set.class, entityType);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetProperty<V> alias(String alias) {
        ASTPath exp = PropertyUtils.createPathExp(this.getName(), alias, getExpression().getPathAliases());
        return PropertyFactory.createSet(exp.getPath(), exp, this.getEntityType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetProperty<V> outer() {
        return getName().endsWith("+")
                ? this
                : PropertyFactory.createSet(getName() + "+", getEntityType());
    }

    /**
     * @return property that will be translated relative to parent query
     */
    public SetProperty<V> enclosing() {
        return PropertyFactory.createSet(null, ExpressionFactory.enclosingObjectExp(getExpression()), getEntityType());
    }
}
