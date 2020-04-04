package org.server;

import io.undertow.Undertow;

public final class Server {

    private Server() {}

    public static void start(int port, String host) {

        Undertow.builder()
                .addHttpListener(port, host)
                .setHandler(Router.createRouter())
                .build()
                .start();

    }

}
