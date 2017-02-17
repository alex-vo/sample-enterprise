/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rest;

import ejb3.interfaces.SampleBeanLocal;
import java.io.Serializable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/users")
public class Greeter implements Serializable {

    @GET
    public Response greet(){
        System.out.println("xxxxxxxxxxxxxx");
        try {
            Context ctx = new InitialContext();
            SampleBeanLocal b = (SampleBeanLocal) ctx.lookup("java:global/sample-enterprise/ejb/SampleBean");
            return Response.status(200).entity(b.method()).build();
        }catch (NamingException e) {
            e.printStackTrace();
        }
        return Response.status(400).entity("fail").build();

    }

}
