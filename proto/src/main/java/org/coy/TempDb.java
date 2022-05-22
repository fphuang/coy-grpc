package org.coy;

import org.coy.grpc.Author;
import org.coy.grpc.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TempDb {
    public static List<Author> getAuthorFromDb() {
        return Arrays.asList(
                Author.newBuilder()
                        .setAuthorId(1)
                        .setFirstName("Charles")
                        .setLastName("Dickens")
                        .setGender("Male")
                        .build(),
                Author.newBuilder()
                        .setAuthorId(2)
                        .setFirstName("William")
                        .setLastName("Shakespeare")
                        .setGender("Male")
                        .build(),
                Author.newBuilder()
                        .setAuthorId(3)
                        .setFirstName("JK")
                        .setLastName("Rowling")
                        .setGender("Female")
                        .build(),
                Author.newBuilder()
                        .setAuthorId(4)
                        .setFirstName("Virginia")
                        .setLastName("Woolf")
                        .setGender("Female")
                        .build()
        );
    }

    public static List<Book> getBooksFromTempDb() {
        return new ArrayList<>(Arrays.asList(
               Book.newBuilder().setBookId(1).setAuthorId(1).setTitle("Oliver Twist").setPrice(123.3f).setPages(300).build(),
                Book.newBuilder().setBookId(2).setAuthorId(1).setTitle("A Christma Carol").setPrice(223.3f).setPages(300).build(),
                Book.newBuilder().setBookId(3).setAuthorId(2).setTitle("Hamlet").setPrice(323.3f).setPages(250).build(),
                Book.newBuilder().setBookId(4).setAuthorId(3).setTitle("Harry Potter").setPrice(423.3f).setPages(300).build(),
                Book.newBuilder().setBookId(5).setAuthorId(3).setTitle("The Casula Vacancy").setPrice(523.3f).setPages(300).build(),
                Book.newBuilder().setBookId(6).setAuthorId(4).setTitle("Mrs. Dalloway").setPrice(623.3f).setPages(300).build()
                ));
    }
}
