package org.algos.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter
public final class DataStructure {


    public String dataStructureName;

    public Integer [] intArray;

    public String [] stringArray;
    public Integer [][] intTwoDArray;

    public String [][] stringTwoDArray;

    public Integer [][][] intThreeDArray;

    public String [][][] stringThreeDArray;
    public List<Integer> intList;

    public List<String> stringList;

    public LinkedList<Integer> intLinkedList;

    public LinkedList<String> stringLinkedList;

    public Set<Integer> intSet;

    public Set<String> stringSet;

    public TreeSet<Integer> intTreeSet;

    public TreeSet<String> stirngTreeSet;

    public Map<Integer, Integer> intMap;

    public Map<String, String> StringMap;

    public Map<Integer, String> intStringMap;

    public TreeMap<Integer, String> intStringTreeMap;

    public DataStructure(String[] stringArray, Integer[] intArray, String dataStructureName, Integer[][] intTwoDArray,
                         String[][] stringTwoDArray, LinkedList<Integer> intLinkedList, Integer[][][] intThreeDArray,
                         String[][][] stringThreeDArray, List<Integer> intList, List<String> stringList,
                         LinkedList<String> stringLinkedList, Set<Integer> intSet, Set<String> stringSet,
                         TreeSet<Integer> intTreeSet, TreeSet<String> stirngTreeSet, Map<Integer, Integer> intMap,
                         Map<String, String> stringMap, Map<Integer, String> intStringMap, TreeMap<Integer, String> intStringTreeMap) {
        this.stringArray = stringArray;
        this.intArray = intArray;
        this.dataStructureName = dataStructureName;
        this.intTwoDArray = intTwoDArray;
        this.stringTwoDArray = stringTwoDArray;
        this.intLinkedList = intLinkedList;
        this.intThreeDArray = intThreeDArray;
        this.stringThreeDArray = stringThreeDArray;
        this.intList = intList;
        this.stringList = stringList;
        this.stringLinkedList = stringLinkedList;
        this.intSet = intSet;
        this.stringSet = stringSet;
        this.intTreeSet = intTreeSet;
        this.stirngTreeSet = stirngTreeSet;
        this.intMap = intMap;
        StringMap = stringMap;
        this.intStringMap = intStringMap;
        this.intStringTreeMap = intStringTreeMap;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataStructure that = (DataStructure) o;
        return Objects.equals(dataStructureName, that.dataStructureName) && Objects.deepEquals(intArray, that.intArray)
                && Objects.deepEquals(stringArray, that.stringArray) && Objects.deepEquals(intTwoDArray, that.intTwoDArray)
                && Objects.deepEquals(stringTwoDArray, that.stringTwoDArray) && Objects.deepEquals(intThreeDArray, that.intThreeDArray)
                && Objects.deepEquals(stringThreeDArray, that.stringThreeDArray) && Objects.equals(intList, that.intList)
                && Objects.equals(stringList, that.stringList) && Objects.equals(intLinkedList, that.intLinkedList)
                && Objects.equals(stringLinkedList, that.stringLinkedList) && Objects.equals(intSet, that.intSet)
                && Objects.equals(stringSet, that.stringSet) && Objects.equals(intTreeSet, that.intTreeSet)
                && Objects.equals(stirngTreeSet, that.stirngTreeSet) && Objects.equals(intMap, that.intMap)
                && Objects.equals(StringMap, that.StringMap) && Objects.equals(intStringMap, that.intStringMap)
                && Objects.equals(intStringTreeMap, that.intStringTreeMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStructureName, Arrays.hashCode(intArray), Arrays.hashCode(stringArray),
                Arrays.deepHashCode(intTwoDArray), Arrays.deepHashCode(stringTwoDArray), Arrays.deepHashCode(intThreeDArray),
                Arrays.deepHashCode(stringThreeDArray), intList, stringList, intLinkedList, stringLinkedList, intSet,
                stringSet, intTreeSet, stirngTreeSet, intMap, StringMap, intStringMap, intStringTreeMap);
    }

    @Override
    public String toString() {
        return "DataStructure{" +
                "intArray=" + Arrays.toString(intArray) +
                ", stringArray=" + Arrays.toString(stringArray) +
                ", intTwoDArray=" + Arrays.toString(intTwoDArray) +
                ", stringTwoDArray=" + Arrays.toString(stringTwoDArray) +
                ", intThreeDArray=" + Arrays.toString(intThreeDArray) +
                ", stringThreeDArray=" + Arrays.toString(stringThreeDArray) +
                ", intList=" + intList +
                ", stringList=" + stringList +
                ", intLinkedList=" + intLinkedList +
                ", stringLinkedList=" + stringLinkedList +
                ", intSet=" + intSet +
                ", stringSet=" + stringSet +
                ", intTreeSet=" + intTreeSet +
                ", stirngTreeSet=" + stirngTreeSet +
                ", intMap=" + intMap +
                ", StringMap=" + StringMap +
                ", intStringMap=" + intStringMap +
                ", intStringTreeMap=" + intStringTreeMap +
                ", dataStructureName=" + dataStructureName+
                '}';
    }

    public String getDataStructureName() {
        return dataStructureName;
    }

    public void setDataStructureName(String dataStructureName) {
        this.dataStructureName = dataStructureName;
    }

    public Integer[] getIntArray() {
        return intArray;
    }

    public void setIntArray(Integer[] intArray) {
        this.intArray = intArray;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }

    public Integer[][] getIntTwoDArray() {
        return intTwoDArray;
    }

    public void setIntTwoDArray(Integer[][] intTwoDArray) {
        this.intTwoDArray = intTwoDArray;
    }

    public String[][] getStringTwoDArray() {
        return stringTwoDArray;
    }

    public void setStringTwoDArray(String[][] stringTwoDArray) {
        this.stringTwoDArray = stringTwoDArray;
    }

    public Integer[][][] getIntThreeDArray() {
        return intThreeDArray;
    }

    public void setIntThreeDArray(Integer[][][] intThreeDArray) {
        this.intThreeDArray = intThreeDArray;
    }

    public String[][][] getStringThreeDArray() {
        return stringThreeDArray;
    }

    public void setStringThreeDArray(String[][][] stringThreeDArray) {
        this.stringThreeDArray = stringThreeDArray;
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public void setIntList(List<Integer> intList) {
        this.intList = intList;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public LinkedList<Integer> getIntLinkedList() {
        return intLinkedList;
    }

    public void setIntLinkedList(LinkedList<Integer> intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public LinkedList<String> getStringLinkedList() {
        return stringLinkedList;
    }

    public void setStringLinkedList(LinkedList<String> stringLinkedList) {
        this.stringLinkedList = stringLinkedList;
    }

    public Set<Integer> getIntSet() {
        return intSet;
    }

    public void setIntSet(Set<Integer> intSet) {
        this.intSet = intSet;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public TreeSet<Integer> getIntTreeSet() {
        return intTreeSet;
    }

    public void setIntTreeSet(TreeSet<Integer> intTreeSet) {
        this.intTreeSet = intTreeSet;
    }

    public TreeSet<String> getStirngTreeSet() {
        return stirngTreeSet;
    }

    public void setStirngTreeSet(TreeSet<String> stirngTreeSet) {
        this.stirngTreeSet = stirngTreeSet;
    }

    public Map<Integer, Integer> getIntMap() {
        return intMap;
    }

    public void setIntMap(Map<Integer, Integer> intMap) {
        this.intMap = intMap;
    }

    public Map<String, String> getStringMap() {
        return StringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        StringMap = stringMap;
    }

    public Map<Integer, String> getIntStringMap() {
        return intStringMap;
    }

    public void setIntStringMap(Map<Integer, String> intStringMap) {
        this.intStringMap = intStringMap;
    }

    public TreeMap<Integer, String> getIntStringTreeMap() {
        return intStringTreeMap;
    }

    public void setIntStringTreeMap(TreeMap<Integer, String> intStringTreeMap) {
        this.intStringTreeMap = intStringTreeMap;
    }

    public static final class DataStructureBuilder {
        private Integer[] intArray;
        private String[] stringArray;
        private Integer[][] intTwoDArray;
        private String[][] stringTwoDArray;
        private Integer[][][] intThreeDArray;
        private String[][][] stringThreeDArray;
        private List<Integer> intList;
        private List<String> stringList;
        private LinkedList<Integer> intLinkedList;
        private LinkedList<String> stringLinkedList;
        private Set<Integer> intSet;
        private Set<String> stringSet;
        private TreeSet<Integer> intTreeSet;
        private TreeSet<String> stirngTreeSet;
        private Map<Integer, Integer> intMap;
        private Map<String, String> StringMap;
        private Map<Integer, String> intStringMap;
        private TreeMap<Integer, String> intStringTreeMap;
        private String dataStructureName;

        private DataStructureBuilder() {
        }

        public static DataStructureBuilder aDataStructure() {
            return new DataStructureBuilder();
        }

        public DataStructureBuilder withIntArray(Integer[] intArray) {
            this.intArray = intArray;
            return this;
        }

        public DataStructureBuilder withStringArray(String[] stringArray) {
            this.stringArray = stringArray;
            return this;
        }

        public DataStructureBuilder withIntTwoDArray(Integer[][] intTwoDArray) {
            this.intTwoDArray = intTwoDArray;
            return this;
        }

        public DataStructureBuilder withStringTwoDArray(String[][] stringTwoDArray) {
            this.stringTwoDArray = stringTwoDArray;
            return this;
        }

        public DataStructureBuilder withIntThreeDArray(Integer[][][] intThreeDArray) {
            this.intThreeDArray = intThreeDArray;
            return this;
        }

        public DataStructureBuilder withStringThreeDArray(String[][][] stringThreeDArray) {
            this.stringThreeDArray = stringThreeDArray;
            return this;
        }

        public DataStructureBuilder withIntList(List<Integer> intList) {
            this.intList = intList;
            return this;
        }

        public DataStructureBuilder withStringList(List<String> stringList) {
            this.stringList = stringList;
            return this;
        }

        public DataStructureBuilder withIntLinkedList(LinkedList<Integer> intLinkedList) {
            this.intLinkedList = intLinkedList;
            return this;
        }

        public DataStructureBuilder withStringLinkedList(LinkedList<String> stringLinkedList) {
            this.stringLinkedList = stringLinkedList;
            return this;
        }

        public DataStructureBuilder withIntSet(Set<Integer> intSet) {
            this.intSet = intSet;
            return this;
        }

        public DataStructureBuilder withStringSet(Set<String> stringSet) {
            this.stringSet = stringSet;
            return this;
        }

        public DataStructureBuilder withIntTreeSet(TreeSet<Integer> intTreeSet) {
            this.intTreeSet = intTreeSet;
            return this;
        }

        public DataStructureBuilder withStirngTreeSet(TreeSet<String> stirngTreeSet) {
            this.stirngTreeSet = stirngTreeSet;
            return this;
        }

        public DataStructureBuilder withIntMap(Map<Integer, Integer> intMap) {
            this.intMap = intMap;
            return this;
        }

        public DataStructureBuilder withStringMap(Map<String, String> StringMap) {
            this.StringMap = StringMap;
            return this;
        }

        public DataStructureBuilder withIntStringMap(Map<Integer, String> intStringMap) {
            this.intStringMap = intStringMap;
            return this;
        }

        public DataStructureBuilder withDataStructureName(String dataStructureName) {
            this.dataStructureName = dataStructureName;
            return this;
        }

        public DataStructureBuilder withIntStringTreeMap(TreeMap<Integer, String> intStringTreeMap) {
            this.intStringTreeMap = intStringTreeMap;
            return this;
        }

        public DataStructure build() {
            DataStructure dataStructure = new DataStructure(stringArray, intArray, dataStructureName,intTwoDArray,
                    stringTwoDArray,  intLinkedList,  intThreeDArray, stringThreeDArray, intList, stringList,
                    stringLinkedList, intSet, stringSet,  intTreeSet,  stirngTreeSet,  intMap,  StringMap,  intStringMap, intStringTreeMap);
            dataStructure.StringMap = this.StringMap;
            return dataStructure;
        }

        @Override
        public String toString() {
            return "DataStructureBuilder{" +
                    "intArray=" + Arrays.toString(intArray) +
                    ", stringArray=" + Arrays.toString(stringArray) +
                    ", intTwoDArray=" + Arrays.toString(intTwoDArray) +
                    ", stringTwoDArray=" + Arrays.toString(stringTwoDArray) +
                    ", intThreeDArray=" + Arrays.toString(intThreeDArray) +
                    ", stringThreeDArray=" + Arrays.toString(stringThreeDArray) +
                    ", intList=" + intList +
                    ", stringList=" + stringList +
                    ", intLinkedList=" + intLinkedList +
                    ", stringLinkedList=" + stringLinkedList +
                    ", intSet=" + intSet +
                    ", stringSet=" + stringSet +
                    ", intTreeSet=" + intTreeSet +
                    ", stirngTreeSet=" + stirngTreeSet +
                    ", intMap=" + intMap +
                    ", StringMap=" + StringMap +
                    ", intStringMap=" + intStringMap +
                    ", intStringTreeMap=" + intStringTreeMap +
                    ", dataStructureName=" + dataStructureName +
                    '}';
        }
    }

    public static DataStructure.DataStructureBuilder builder() {
        return new DataStructure.DataStructureBuilder();
    }
}
