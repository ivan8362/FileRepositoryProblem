package com.LIcompany;

import java.io.IOException;

public interface CatalogManagerInterface {
    void createCatalog(String name) throws IOException;
    void readCatalog();
    void sort(SortType type);
}
