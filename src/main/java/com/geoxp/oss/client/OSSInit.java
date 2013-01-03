/*
 * Copyright 2012-2013 Mathias Herberts 
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.geoxp.oss.client;

public class OSSInit {
  public static void main(String[] args) throws Exception {
    
    if (2 != args.length) {
      System.err.println("OSSInit OSS_INIT_URL SSH_SIGNING_KEY_FINGERPRINT");
      System.exit(1);
    }

    OSSClient.init(args[0], args[1]);    

    System.out.println("Open Secret Server initialized successfully");
  }
}