package org.server.handler;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

public class HealthCheckHandler implements HttpHandler {

    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseSender().send("{\"msg\":\"Healthy connection\"}");
    }

}
