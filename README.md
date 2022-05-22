# Introduction to gRPC

## Introduction
gRPC is a high performance, open source RPC framework initially developed by Google. It helps 
in eliminating boilerplate code and helps in connecting polyglot services in and across
date centers.

## Overview
The framework is based on a client-server model of remote procedure calls. A client application can directly call methods on a server application as if it was a local object.

We will use following steps to create a typical client-server application using gRPC:
1. Define a service in a .proto file
2. Generate server and client code using the protocol buffer compiler
3. Create the server application, implementing the generated service interfaces and spawning the gRPC server
4. Create the client application, making RPC calls using generated stubs

## Maven Dependencies
```xml
    <dependencies>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-netty</artifactId>
            <version>1.46.0</version>
        </dependency>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-protobuf</artifactId>
            <version>1.46.0</version>
        </dependency>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-stub</artifactId>
            <version>1.46.0</version>
        </dependency>
    </dependencies>
```