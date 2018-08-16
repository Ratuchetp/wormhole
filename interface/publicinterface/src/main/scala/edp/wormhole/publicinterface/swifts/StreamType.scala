/*-
 * <<
 * wormhole
 * ==
 * Copyright (C) 2016 - 2018 EDP
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * >>
 */

package edp.wormhole.publicinterface.swifts

object StreamType extends Enumeration {
  type StreamType = Value
  val BATCHFLOW = Value("batchflow")
  val HDFSLOG = Value("hdfslog")
  val ROUTER = Value("router")

  def streamType(s: String) = StreamType.withName(s.toLowerCase)

}


object InputDataProtocolBaseType extends Enumeration {
  type InputDataProtocolBaseType = Value
  val INITIAL = Value("initial")
  val INCREMENT = Value("increment")
  val BATCH = Value("batch")

  def inputDataRequirement(s: String) = InputDataProtocolBaseType.withName(s.toLowerCase)

}