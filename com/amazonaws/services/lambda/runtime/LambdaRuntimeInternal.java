package com.amazonaws.services.lambda.runtime;

public final class LambdaRuntimeInternal {
   private static boolean useLog4jAppender;

   public static void setUseLog4jAppender(boolean useLog4j) {
      useLog4jAppender = useLog4j;
   }

   public static boolean getUseLog4jAppender() {
      return useLog4jAppender;
   }
}
