package com.myword.app.author;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

public class AuthorEntity {

    private UUID id;
    private  String name;
    private Set<String> alias;
    private LocalDate birthday;
    private LocalDate deceasedDate;
}
