package org.coy;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.coy.grpc.Author;
import org.coy.grpc.BookAuthorServiceGrpc;

@GrpcService
public class BookAuthorServerService extends BookAuthorServiceGrpc.BookAuthorServiceImplBase {
    @Override
    public void getAuthor(Author request, StreamObserver<Author> responseObserver) {
//        super.getAuthor(request, responseObserver);
    }
}
