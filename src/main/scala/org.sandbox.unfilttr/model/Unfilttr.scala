package org.sandbox.unfilttr.model

import java.time.Instant

case class Unfilttr(userId: Long, content: String) {
  val date = Instant.now().toEpochMilli
}