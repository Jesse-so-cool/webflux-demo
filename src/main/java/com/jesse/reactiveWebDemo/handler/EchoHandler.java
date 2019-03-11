package com.jesse.reactiveWebDemo.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Component
public class EchoHandler implements WebSocketHandler {

    static Map<String, WebSocketSession> map = new HashMap<>();

    @Override
    public Mono<Void> handle(final WebSocketSession session) {
        String id = session.getId();
        map.put(id, session);
        map.get(id).textMessage("fff");
        return session.send(
                session.receive()
                        .map(msg -> session.textMessage("Server:connected OK!your id is " + id)));
    }
}