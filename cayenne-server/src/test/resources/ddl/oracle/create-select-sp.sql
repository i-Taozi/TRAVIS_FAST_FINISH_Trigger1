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
CREATE OR REPLACE FUNCTION cayenne_tst_select_proc (a_name IN VARCHAR2, painting_price IN NUMBER)
    RETURN cayenne_types.ref_cursor
AS
   artists cayenne_types.ref_cursor;
BEGIN
      SET TRANSACTION READ WRITE;
      UPDATE PAINTING SET ESTIMATED_PRICE = ESTIMATED_PRICE * 2
      WHERE ESTIMATED_PRICE < painting_price;
      COMMIT;
 
     OPEN artists FOR
     SELECT DISTINCT A.ARTIST_ID, A.ARTIST_NAME, A.DATE_OF_BIRTH
     FROM ARTIST A, PAINTING P
     WHERE A.ARTIST_ID = P.ARTIST_ID AND
     RTRIM(A.ARTIST_NAME) = a_name
     ORDER BY A.ARTIST_ID;

     RETURN artists;
END;

