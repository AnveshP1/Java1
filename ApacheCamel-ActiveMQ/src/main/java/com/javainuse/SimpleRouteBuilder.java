package com.javainuse;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C:/inputfolder?noop=true").split().tokenize("\n").to("jms:queue:apachecamel");
    }

}