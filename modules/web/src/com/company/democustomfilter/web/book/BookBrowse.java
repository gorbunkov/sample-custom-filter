package com.company.democustomfilter.web.book;

import com.company.democustomfilter.entity.Book;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import java.util.*;

public class BookBrowse extends AbstractLookup {

    @Inject
    private LookupField authorFirstNameLookup;

    @Inject
    private LookupField authorLastNameLookup;

    @Inject
    private CollectionDatasource<Book, UUID> booksDs;

    @Override
    public void init(Map<String, java.lang.Object> params) {
        super.init(params);
        authorFirstNameLookup.setOptionsList(getPossibleFirstNames());
        authorLastNameLookup.setOptionsList(getPossibleLastNames());
    }

    private List<String> getPossibleFirstNames() {
        return Arrays.asList("Leo", "Alexandre", "George", "Jack");
    }

    private List<String> getPossibleLastNames() {
        return Arrays.asList("Tolstoy", "Dumas");
    }

    public void applyCustomFilter() {
        Map<String, Object> params = new HashMap<>();
        params.put("authorFirstName", authorFirstNameLookup.getValue());
        params.put("authorLastName", authorLastNameLookup.getValue());
        booksDs.refresh(params);
    }
}