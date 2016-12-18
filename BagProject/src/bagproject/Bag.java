/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagproject;

/**
 *
 * @author Asus
 */
public class Bag {
    // Size variables

    public int sizeTotal = 0;
    private int sizeOfIntegerArray = 0;
    private int sizeOfStringArray = 0;
    private int sizeOfDoubleArray = 0;

    // Local Arrays
    private String[] stringArray = new String[10];
    private int[] integerArray = new int[10];
    private double[] doubleArray = new double[10];

    //
    int size_control = 0;
    String[] myArray = new String[10];
    int[] sizeArray = new int[10];
    int control_array = 0;
    int control_add;
    int distict_size_counter = 0;
    int element_size_counter = 0;

    boolean remove_counter;



    public void add(String item) {
        int control = 0;
        if (item != null) {
            control_add++;
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == item) {
                sizeArray[i]++;

                control++;

                break;
            }
        }

        if (control == 0) {
            myArray[control_array] = item;
            sizeArray[control_array]++;
            control_array++;
        }
    }

    public void clear() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = null;
            sizeArray[i] = 0;
            control_add = 0;
        }
    }

    public int size() {
        return control_add;
    }

    public boolean contains(String item) {

        boolean variable = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == item) {
                variable = true;

                break;
            }
        }
        return variable;
    }

    public boolean isEmpty() {

        boolean variable = false;

        if (myArray.length == 0) {
            variable = true;
        }
        return variable;
    }

    public void tostring() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Bag has " + sizeArray[i] + " " + "of " + myArray[i]);
            System.out.println("----------------");
        }
    }

    public int distictsize() {
        for (int i = 0; i < myArray.length; i++) {
            if (sizeArray[i] >= 1) {
                distict_size_counter++;
            }
        }

        return distict_size_counter;
    }

    public int elementSize(String item) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == item) {
                element_size_counter = sizeArray[i];
            }
        }
        return element_size_counter;
    }

    public void remove(String item) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == item) {
                remove_counter = true;
            } else {
                remove_counter = false;
            }

            if (remove_counter == true) {
                if (sizeArray.length >= 1) {
                    sizeArray[i]--;
                }

                if (sizeArray.length == 1) {
                    sizeArray[i] = 0;
                }

                if (sizeArray[i] == 0) {
                    myArray[i] = null;
                }

            }

        }
    }

    //From 
    
    public int distictSizeGeneric (){
        int count = 0;       
        
        
        return count;
    }
    
    public <T> void addGeneric(T item) {

        if (item instanceof Integer) {
            System.out.println("Integer");
            int newInt = (Integer) item;
            addInteger(newInt);
        } else if (item instanceof Double) {
            System.out.println("double");
            double newDouble = (Double) item;
            addDouble(newDouble);
        } else if (item instanceof String) {
            System.out.println("String");
            String newString = (String) item;
            addString(newString);
        }

        sizeTotal++;
    }

    private void addString(String item) {

        sizeOfStringArray++;

    }

    private void addInteger(int item) {

        sizeOfIntegerArray++;
    }

    private void addDouble(double item) {

        sizeOfDoubleArray++;
    }
    
    public void clearGeneric() {
        stringArray = new String[10];
        integerArray = new int[10];
        doubleArray = new double[10];

        sizeOfDoubleArray = 0;
        sizeOfIntegerArray = 0;
        sizeOfStringArray = 0;
        sizeTotal = 0;

    }

    public int sizeGeneric() {
        return sizeTotal;
    }

    public <T> boolean containsGeneric(T item) {
        boolean isContains = false;

        if (item instanceof Integer) {
            System.out.println("Integer");
            int intToSearch = (Integer) item;
            isContains = containsInteger(intToSearch);
        } else if (item instanceof Double) {
            System.out.println("double");
            double doubleToSearch = (Double) item;
            isContains = containsDouble(doubleToSearch);
        } else if (item instanceof String) {
            System.out.println("String");
            String stringToSearch = (String) item;
            isContains = containsString(stringToSearch);
        }
        return isContains;
    }

    private boolean containsInteger(int intToSearch) {
        for (int i = 0; i < integerArray.length; i++) {
            if (intToSearch == (integerArray[i])) {
                return true;
            }
        }
        return false;
    }

    private boolean containsDouble(double doubleToSearch) {
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleToSearch == (doubleArray[i])) {
                return true;
            }
        }
        return false;
    }

    private boolean containsString(String stringToSearch) {

        for (int i = 0; i < stringArray.length; i++) {
            if (stringToSearch.equals(stringArray[i])) {
                return true;
            }
        }
        return false;
    }

    public <T> void removeGeneric(T item) {

        if (item instanceof Integer) {
            System.out.println("Integer");
            int intToRemove = (Integer) item;
            removeInteger(intToRemove);
        } else if (item instanceof Double) {
            System.out.println("double");
            double doubleToRemove = (Double) item;
            removeDouble(doubleToRemove);
        } else if (item instanceof String) {
            System.out.println("String");
            String stringToRemove = (String) item;
            removeString(stringToRemove);
        }

        sizeTotal--;
    }

    private void removeString(String stringToRemove) {
        //todo
        sizeOfStringArray--;
    }

    private void removeDouble(double doubleToRemove) {
        //todo
        sizeOfDoubleArray--;
    }

    private void removeInteger(int intToRemove) {
        //todo
        sizeOfIntegerArray--;
    }

    public <T> int elementSizeGeneric(T item) {
        int elementCount = 0;

        if (item instanceof Integer) {
            System.out.println("Integer");
            int intToSearch = (Integer) item;
            elementCount = elementSizeInteger(intToSearch);
        } else if (item instanceof Double) {
            System.out.println("double");
            double doubleToSearch = (Double) item;
            elementCount = elementSizeDouble(doubleToSearch);
        } else if (item instanceof String) {
            System.out.println("String");
            String stringToSearch = (String) item;
            elementCount = elementSizeString(stringToSearch);
        }

        return elementCount;
    }

    private int elementSizeString(String stringToSearch) {
        int count = 0;
        for (int i = 0; i < sizeOfIntegerArray; i++) {
            if (stringArray[i].equals(stringToSearch)) {
                count++;
            }
        }
        return count;
    }

    private int elementSizeDouble(double doubleToSearch) {
        int count = 0;
        for (int i = 0; i < sizeOfDoubleArray; i++) {
            if (doubleArray[i] == doubleToSearch) {
                count++;
            }
        }
        return count;
    }

    private int elementSizeInteger(int intToSearch) {
        int count = 0;

        for (int i = 0; i < sizeOfIntegerArray; i++) {
            if (integerArray[i] == intToSearch) {
                count++;
            }
        }

        return count;
    }

    public boolean isEmptyGeneric() {
        if (sizeTotal == 0) {
            return true;
        }
        return false;
    }
}
