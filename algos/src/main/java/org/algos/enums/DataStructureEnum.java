package org.algos.enums;

import java.util.HashMap;
import java.util.Map;

public enum DataStructureEnum {

    INTEGER_ARRAY("integerArray"),

    INTEGER_2D_ARRAY("integer2DArray"),

    INTEGER_3D_ARRAY("integer3DArray"),

    STRING_ARRAY("stringArray"),

    STRING_2D_ARRAY("string2DArray"),

    STRING_3D_ARRAY("string3DArray"),

    INTEGER_LIST("integerList"),

    STRING_LIST("stringList"),

    INTEGER_LINKED_LIST("integerLinkedList"),

    STRING_LINKED_LIST("stringLinkedList"),

    STRING_MAP("stringMap");



    private final String type;


    private static final Map<String, DataStructureEnum> BY_LABEL = new HashMap<>();

    static {
        for (DataStructureEnum e: values()) {
            BY_LABEL.put(e.type, e);
        }
    }

    DataStructureEnum(String type) {
        this.type = type;
    }

    public static DataStructureEnum valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }


}
