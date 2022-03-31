/**
 * Copyright (C) 2017 drrb
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.drrb.rust.netbeans.util;

import java.lang.reflect.Array;
import java.util.Collection;

/**
 *
 */
public class Lists {

    public static <T> T[] toArray(Collection<T> collection, Class<T> type) {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(type, collection.size());
        return collection.toArray(array);
    }

    private Lists() {
    }
}