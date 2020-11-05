public class SuperArray {


//Instance Variables
  private String[] data;
  private int size; //the current size


//Constructors
  public SuperArray() {
    data = new String[10];
    //for (int i = 0; i < data.length; i++) {
    //  data[i] = "BLANK";
    //}
    size = 0;
  }
  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
    //for (int i = 0; i < data.length; i++) {
    //  data[i] = "BLANK";
    //}
    size = 0;
  }
  public SuperArray(String[] arr) {
    size = arr.length;
    data = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      data[i] = arr[i];
    }
    resize();
  } //dw about this


//Original Methods
  public int size() { //Section c
    return size;
  }

  public boolean add(String element) { //Section d
    if (size == data.length) resize();
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
    for (int i = 0; i < (data.length * 2); i++) {
      if (i < data.length) newsie[i] = data[i];
      //if (i >= data.length) newsie[i] = "BLANK";
    }
    data = newsie;
    //Increase the capacity by: creating a larger array,
    //copying the values from the original array to the new one.
    // and assigning the new one to the instance variable.
  }

//First Set of Added Methods (CW 3.11.2020)
  public boolean isEmpty() {
    return (size == 0);
  }

  public void clear() {
    size = 0;
    String[] arr = new String[data.length];
    data = arr;
    //for (int i = 0; i < data.length; i++) {
    //  data[i] = "BLANK";
    //}
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
    return ( indexOf(s) != -1);
  }

//Second Set of Added Methods (HW#15)
  public void add(int index, String element) {
    if (size == data.length) resize();
    String[] newbie = new String[data.length];
    for (int i = 0; i < index; i++) {
      newbie[i] = data[i];
    }
    newbie[index] = element;
    size ++;
    for (int i = index; i < data.length - 1; i++) {
      newbie[i + 1] = data[i];
    }
    data = newbie;
  }

  public String remove(int index) {
    String[] newbie = new String[data.length];
    for (int i = 0; i < index; i++) {
      newbie[i] = data[i];
    }
    String removed = data[index];
    size --;
    for (int i = index; i < data.length - 1; i++) {
      newbie[i] = data[i + 1];
    }
    data = newbie;
    return removed;
  }

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

//Third Set of Added Methods (CW 5.11.2020)
  public void reverse() {
    String[] flipped = new String[data.length];
    for (int i = 0; i < size; i++) {
      flipped[i] = data[size - i - 1];
    }
    data = flipped;
  }

  public int lastIndexOf(String value) {
    for (int i = size - 1; i >= 0; i--) {
      if (data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other){
    for (int i = 0; i < size; i++) {
      if ( !data[i].equals( other.get(i) ) ) {
        return false;
      }
    }
    return ( size == other.size() ); //ignore capacity!!!
  }

//Fourth Set of Added Methods (CW 9.11.20)




}
