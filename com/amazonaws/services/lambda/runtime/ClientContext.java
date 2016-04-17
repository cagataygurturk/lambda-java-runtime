package com.amazonaws.services.lambda.runtime;

import com.amazonaws.services.lambda.runtime.Client;
import java.util.Map;

public interface ClientContext {
   Client getClient();

   Map getCustom();

   Map getEnvironment();
}
