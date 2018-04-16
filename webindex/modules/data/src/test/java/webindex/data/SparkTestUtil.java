/*
 * Copyright 2015 Webindex authors (see AUTHORS)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package webindex.data;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkTestUtil {

  public static JavaSparkContext getSparkContext(String appName) {
    SparkConf sparkConf = new SparkConf();
    sparkConf.setMaster("local");
    sparkConf.setAppName(appName);
    sparkConf.set("spark.app.id", appName);
    sparkConf.set("spark.ui.port", "4444");
    return new JavaSparkContext(sparkConf);
  }

}
