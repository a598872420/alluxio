/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.client.file.options;

import alluxio.CommonTestUtils;
import alluxio.thrift.ListStatusTOptions;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for the {@link ListStatusOptions} class.
 */
public class ListStatusOptionsTest {
  @Test
  public void defaultsTest() {
    ListStatusOptions options = ListStatusOptions.defaults();

    Assert.assertTrue(options.isLoadDirectChildren());
  }

  @Test
  public void fieldsTest() {
    ListStatusOptions options = ListStatusOptions.defaults();
    Assert.assertEquals(true, options.isLoadDirectChildren());
  }

  @Test
  public void toThriftTest() {
    ListStatusOptions options = ListStatusOptions.defaults();
    ListStatusTOptions thriftOptions = options.toThrift();
    Assert.assertEquals(true, options.isLoadDirectChildren());
  }

  @Test
  public void equalsTest() throws Exception {
    CommonTestUtils.testEquals(ListStatusOptions.class);
  }
}
