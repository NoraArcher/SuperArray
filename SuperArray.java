public class SuperArray {



  private String[] data;
  private int size; //the current size


  public SuperArray() {
    data = new String[10];
    for (int i = 0; i < data.length; i++) {
      data[i] = "BLANK";
    }
    size = 0;
  }
  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
    for (int i = 0; i < data.length; i++) {
      data[i] = "BLANK";
    }
    size = 0;
  }
  public SuperArray(String[] arr) {
    size = 0;
    data = new String[arr.length * 2];
    for (int i = 0; i < (arr.length * 2) ; i++) {
      if (i < arr.length) data[i] = arr[i];
      if (i >= arr.length) data[i] = "BLANK";
    }
  } //dw about this


  public int size() { //Section c
    return size;
  }

  public boolean add(String element) { //Section d
    if (size == data.length) {
      resize();
    }
    data[size] = element; //null pointer exception!!!!
    size ++;
    return true;
    //appends element to data, the next null value,
    //if capaacity is reached resize and try again
  }

  public String get(int index) { //Section e
    if ( (index >= size) || (index < 0) ) {
      return ("There is no element at this index; the size of the super array is " + size);
    }
    return data[index];
  }

  public String set(int index, String element) { // Section f
    if ( (index >= size) || (index < 0) ) {
      return "There is no element at this index to be replaced.";
    }
    String toReturn = data[index];
    data[index] = element;
    return toReturn;
    //replace the element at index with new element, assume index < size-1
  }


  private void resize() { //Section g
    String[] newsie = new String[data.length * 2];
    for (int i = 0; i < data.length; i++) {
      newsie[i] = data[i];
    }
    data = newsie;
    //Increase the capacity by: creating a larger array,
    //copying the values from the original array to the new one.
    // and assigning the new one to the instance variable.
  }


  public boolean isEmpty() {
    return (size == 0);
  }

  public String toString() {
    String fin = "[";
    for (int i = 0; i < size; i++) {
      fin += data[i];
      if (i < size - 1) {
        fin += ", ";
      }
    }
    return (fin + "]");
  }

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element) {
    String[] newbie = new String[data.length];
    for (int i = 0; i < index; i++) {
      newbie[i] = data[i];
    }
    add(element);
    for (int i = index; i < data.length - 1; i++) {
      newbie[i + 1] = data[i];
    }
    data = newbie;
  }

  public String remove(int index) {
    return "Berties";
  }
//Removes the element at the specified position in this list. Shifts any subsequent elements to the left

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] arr = new String[size];
    for (int i = 0; i < size; i++) {
      arr[i] = data[i];
    }
    return arr;
  }



}
