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

package org.apache.cayenne.modeler.event;

import org.apache.cayenne.configuration.DataChannelDescriptor;
import org.apache.cayenne.map.DataMap;
import org.apache.cayenne.map.Procedure;
import org.apache.cayenne.map.ProcedureParameter;

/**
 */
public class ProcedureParameterDisplayEvent extends ProcedureDisplayEvent {

    protected ProcedureParameter[] procedureParameters;

    public ProcedureParameterDisplayEvent(
        Object src,
        ProcedureParameter procedureParameter,
        Procedure procedure,
        DataMap map,
        DataChannelDescriptor domain) {
        	
        super(src, procedure, map, domain);
        this.procedureParameters = new ProcedureParameter[] { procedureParameter };
    }
    
    public ProcedureParameterDisplayEvent(
            Object src,
            ProcedureParameter[] procedureParameters,
            Procedure procedure,
            DataMap map,
            DataChannelDescriptor domain) {
                
            super(src, procedure, map, domain);
            this.procedureParameters = procedureParameters;
    }

    public ProcedureParameter[] getProcedureParameters() {
        return procedureParameters;
    }

    public void setProcedureParameters(ProcedureParameter[] parameters) {
        procedureParameters = parameters;
    }
}
