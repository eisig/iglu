/*
 * Copyright (c) 2012-2016 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package com.snowplowanalytics.iglu.core.circe

// Circe
import io.circe._

// This library
import com.snowplowanalytics.iglu.core.Containers._

/**
 * Having this in implicit scope allow [[SelfDescribingSchema]] with [[Json]]
 * to be normalized into Self-describing JSON Schema
 */
object NormalizeSchema extends NormalizeSchema[Json] {
  def normalize(schema: SelfDescribingSchema[Json]): Json =
    CirceIgluCodecs.encodeSchema(schema)
}
