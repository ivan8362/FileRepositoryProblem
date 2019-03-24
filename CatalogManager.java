package com.LIcompany;

import java.io.File;
import java.io.IOException;

public class CatalogManager implements CatalogManagerInterface{
    private String root;

    public CatalogManager(String root) {
        this.root = root;
    }

    @Override
    public void createCatalog(String name) throws IOException {
        File catalog = new File(root + System.getProperty("file.separator") + name);

        if (!catalog.exists()) {
            if (!catalog.mkdir()) {
                throw new IOException("we cannot create a catalog");
            }
        }
    }

    @Override
    public void readCatalog() {

    }

    @Override
    public void sort(SortType type) {

    }
}
