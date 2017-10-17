package filodb.kafka

import akka.remote.testkit.{MultiNodeConfig, MultiNodeSpec}
import akka.testkit.ImplicitSender
import com.typesafe.scalalogging.StrictLogging

import filodb.coordinator.FilodbCluster

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{BeforeAndAfterAll, FunSpecLike, Matchers}

abstract class ClusterSpec(config: MultiNodeConfig) extends MultiNodeSpec(config)
  with FunSpecLike with Matchers with BeforeAndAfterAll
  with StrictLogging
  with ImplicitSender with ScalaFutures {

  val cluster = FilodbCluster(system)
}