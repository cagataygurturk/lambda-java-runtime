package lambdainternal.api;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import lambdainternal.LambdaRuntime;

public class LambdaContextLogger implements LambdaLogger {
   public void log(String var1) {
      LambdaRuntime.sendContextLogs(var1);
   }
}
