package io.dojogeek.sayamapper;

import java.util.ArrayList;

public class FieldList extends ArrayList<String> {

    public FieldList toIgnore(String fieldName) {
        super.add(fieldName);

        return this;
    }

}
