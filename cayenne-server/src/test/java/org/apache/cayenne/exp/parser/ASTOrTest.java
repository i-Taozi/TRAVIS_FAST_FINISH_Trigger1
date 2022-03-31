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
package org.apache.cayenne.exp.parser;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.cayenne.exp.Expression;
import org.apache.cayenne.testdo.testmap.Artist;
import org.junit.Test;

public class ASTOrTest {

	@Test
	public void testEvaluateOR() {
		Expression e1 = new ASTEqual(new ASTObjPath("artistName"), "abc");
		Expression e2 = new ASTEqual(new ASTObjPath("artistName"), "xyz");

		ASTOr e = new ASTOr(new Object[] { e1, e2 });

		Artist match1 = new Artist();
		match1.setArtistName("abc");
		assertTrue("Failed: " + e, e.match(match1));

		Artist match2 = new Artist();
		match2.setArtistName("xyz");
		assertTrue("Failed: " + e, e.match(match2));

		Artist noMatch = new Artist();
		noMatch.setArtistName("123");
		assertFalse("Failed: " + e, e.match(noMatch));
	}

}
