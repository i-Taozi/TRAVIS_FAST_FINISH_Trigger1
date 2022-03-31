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

import org.apache.cayenne.exp.Expression;
import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.exp.FunctionExpressionFactory;

/**
 * Interface (or "Trait") that provides basic functionality for comparable properties.
 *
 * @see org.apache.cayenne.exp.property
 * @since 4.2
 */
public interface ComparableProperty<E> extends Property<E> {

    /**
     * @param lower The lower bound.
     * @param upper The upper bound.
     * @return An expression checking for objects between a lower and upper bound inclusive
     */
    default Expression between(E lower, E upper) {
        return ExpressionFactory.betweenExp(getExpression(), lower, upper);
    }

    /**
     * @param lower The lower bound.
     * @param upper The upper bound.
     * @return An expression checking for objects between a lower and upper bound inclusive
     */
    default Expression between(ComparableProperty<?> lower, ComparableProperty<?> upper) {
        return ExpressionFactory.betweenExp(getExpression(), lower.getExpression(), upper.getExpression());
    }

    /**
     * @return A greater than Expression.
     */
    default Expression gt(E value) {
        return ExpressionFactory.greaterExp(getExpression(), value);
    }

    /**
     * @return Represents a greater than relationship between two attributes
     * (columns).
     */
    default Expression gt(ComparableProperty<?> value) {
        return ExpressionFactory.greaterExp(getExpression(), value.getExpression());
    }

    /**
     * @return A greater than or equal to Expression.
     */
    default Expression gte(E value) {
        return ExpressionFactory.greaterOrEqualExp(getExpression(), value);
    }

    /**
     * @return Represents a greater than or equal relationship between two
     * attributes (columns).
     */
    default Expression gte(ComparableProperty<?> value) {
        return ExpressionFactory.greaterOrEqualExp(getExpression(), value.getExpression());
    }

    /**
     * @return A less than Expression.
     */
    default Expression lt(E value) {
        return ExpressionFactory.lessExp(getExpression(), value);
    }

    /**
     * @return Represents a less than relationship between two attributes
     * (columns).
     */
    default Expression lt(ComparableProperty<?> value) {
        return ExpressionFactory.lessExp(getExpression(), value.getExpression());
    }

    /**
     * @return A less than or equal to Expression.
     */
    default Expression lte(E value) {
        return ExpressionFactory.lessOrEqualExp(getExpression(), value);
    }

    /**
     * @return Represents a less than or equal relationship between two
     * attributes (columns).
     */
    default Expression lte(ComparableProperty<?> value) {
        return ExpressionFactory.lessOrEqualExp(getExpression(), value.getExpression());
    }

    /**
     * @see FunctionExpressionFactory#maxExp(Expression)
     */
    default BaseProperty<E> max() {
        return PropertyFactory.createBase(FunctionExpressionFactory.maxExp(getExpression()), getType());
    }

    /**
     * @see FunctionExpressionFactory#minExp(Expression)
     */
    default BaseProperty<E> min() {
        return PropertyFactory.createBase(FunctionExpressionFactory.minExp(getExpression()), getType());
    }
}
