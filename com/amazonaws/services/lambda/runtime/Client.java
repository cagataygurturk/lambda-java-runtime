package com.amazonaws.services.lambda.runtime;

public interface Client {
   String getInstallationId();

   String getAppTitle();

   String getAppVersionName();

   String getAppVersionCode();

   String getAppPackageName();
}
