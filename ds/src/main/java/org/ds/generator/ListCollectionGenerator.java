package org.ds.generator;

import org.ds.builder.CollectionBuilder;
import org.ds.enums.ListCollectionsEnum;
import org.ds.factory.DataStructureFactory;
import org.ds.list.ArrayListOperations;

public class ListCollectionGenerator extends DataStructureFactory {

    CollectionBuilder collectionBuilder;

    @Override
    public CollectionBuilder performDsOperations(String type) {
        switch(ListCollectionsEnum.valueOf(type)) {
            case ARRAYLIST -> collectionBuilder = new ArrayListOperations();
        }
        return null;
    }
}
