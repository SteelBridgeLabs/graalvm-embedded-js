package org.graalvm.demo;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Engine;

public class Application {

    public static void main(String[] args) {
        // create engine instance
        try (Engine engine = Engine.create("js")) {
            // create context
            try (var context = Context.newBuilder().engine(engine).build()) {
                // execute script
                context.eval("js", "print('Hello, World!');");
            }
        }
    }
}
