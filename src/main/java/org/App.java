package org;

import org.server.Server;

public class App {

    public static void main(String ...args) {

        Server.start(9000, "localhost");

    }

}
