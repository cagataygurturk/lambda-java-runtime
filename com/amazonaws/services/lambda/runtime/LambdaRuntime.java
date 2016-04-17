package com.amazonaws.services.lambda.runtime;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

public final class LambdaRuntime {
   private static volatile LambdaLogger logger = new LambdaLogger() {
      public void log(String string) {
         System.out.print(string);
      }
   };

   public static LambdaLogger getLogger() {
      return logger;
   }
}
