package com.amazonaws.services.lambda.runtime;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public interface Context {
   String getAwsRequestId();

   String getLogGroupName();

   String getLogStreamName();

   String getFunctionName();

   String getFunctionVersion();

   String getInvokedFunctionArn();

   CognitoIdentity getIdentity();

   ClientContext getClientContext();

   int getRemainingTimeInMillis();

   int getMemoryLimitInMB();

   LambdaLogger getLogger();
}
