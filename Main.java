package com.LIcompany;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        CatalogManagerInterface catalogManager = new CatalogManager(System.getProperty("user.dir"));
        catalogManager.createCatalog("testCatalog");
    }
}
