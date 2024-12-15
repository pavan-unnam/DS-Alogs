package org.ds.factory;

import org.ds.builder.CollectionBuilder;

public abstract class DataStructureFactory {
    public abstract CollectionBuilder performDsOperations(String type);
}
