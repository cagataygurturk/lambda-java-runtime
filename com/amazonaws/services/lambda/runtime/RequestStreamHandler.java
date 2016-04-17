package com.amazonaws.services.lambda.runtime;

import com.amazonaws.services.lambda.runtime.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface RequestStreamHandler {
   void handleRequest(InputStream var1, OutputStream var2, Context var3) throws IOException;
}
