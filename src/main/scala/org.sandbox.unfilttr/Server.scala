package org.sandbox.unfilttr

object Server {
  def main(args: Array[String]): Unit = {
    unfiltered.jetty.Server.local(8080).plan(App).run { srv =>
      unfiltered.util.Browser.open(srv.portBindings.head.url)
    }
  }
}