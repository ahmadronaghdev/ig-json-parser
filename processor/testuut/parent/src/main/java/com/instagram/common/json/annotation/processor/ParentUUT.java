// Copyright 2004-present Facebook. All Rights Reserved.

package com.instagram.common.json.annotation.processor.parent;

import com.instagram.common.json.annotation.JsonField;
import com.instagram.common.json.annotation.JsonType;

/**
 * Parent class.
 */
@JsonType
public class ParentUUT {
  public static final String PARENT_STRING_KEY = "parent_string";
  public static final String PARENT_INT_KEY = "parent_int";

  @JsonField(fieldName = PARENT_STRING_KEY)
  public String parentString;

  @JsonField(fieldName = PARENT_INT_KEY)
  public int parentInt;
}
