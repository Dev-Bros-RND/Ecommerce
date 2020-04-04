package org.server;

import io.undertow.server.HttpHandler;
import io.undertow.server.RoutingHandler;
import io.undertow.util.Methods;
import org.server.handler.HealthCheckHandler;

public final class Router {

    private Router() {}

    public static HttpHandler createRouter() {
        return new RoutingHandler()
                .add(Methods.GET, "/health", new HealthCheckHandler());
    }

}
