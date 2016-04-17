package com.amazonaws.services.lambda.runtime;

import com.amazonaws.services.lambda.runtime.Context;

public interface RequestHandler {
   Object handleRequest(Object var1, Context var2);
}
