package com.rohid.controller;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;

public class MyFirstVerticle extends AbstractVerticle {

  @Override
  public void start(Future<Void> fut) {
    vertx
        .createHttpServer()
        .requestHandler(r -> {
          r.response().end("<h1> Hello from Java </h1>");
        })
        .listen(8081, result -> {
          if (result.succeeded()) {
            fut.complete();
          } else {
            fut.fail(result.cause());
          }
        });
  }
  
  
  public static void main (String[] args)
  {
	  System.out.println("start of application");
	  
	  Vertx vertx = Vertx.vertx();
	  vertx.deployVerticle(new MyFirstVerticle());
	  
  }
}