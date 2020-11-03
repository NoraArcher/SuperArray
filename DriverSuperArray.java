public class DriverSuperArray {


  public static void main(String[] args) {


    System.out.println("The following is Mr. K's example test-");
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }


    System.out.println("\nResize, add, size, and get test all in one-");
    SuperArray skis = new SuperArray();
    for (int i = 0; i < 16; i++) {
      String object = "Hey";
      String type = "Yeah";
      String fabric = "You";
      if (Math.random() < 0.67) object = "Random-Access Memory";
      if (Math.random() < 0.33) object = "Nuclear Reactor";
      if (Math.random() > 0.67) object = "Snow Board";

      if (Math.random() < 0.67) type = "DDR4";
      if (Math.random() < 0.33) type = "Soviet RBMK";
      if (Math.random() > 0.67) type = "Burton Deep Thinker";

      if (Math.random() < 0.67) fabric = "Cashmere";
      if (Math.random() < 0.33) fabric = "Polyester";
      if (Math.random() > 0.67) fabric = "Silk Milk";
      skis.add(object + " : " + type + " : " + fabric);
    }
    //for(int i = 0; i < skis.size(); i++){
    //  System.out.println( skis.get(i) );
    //}


    System.out.println("\nDifferent get and set tests-");
    SuperArray books = new SuperArray();
    if (books.get(6).equals("There is no element at this index; the size of the super array is 0") ) {
      System.out.println("get test: SUCCESS");
    } else {
      System.out.println("get test: FAIL");
    }
    if (books.get(11).equals("There is no element at this index; the size of the super array is 0")) {
      System.out.println("get test: SUCCESS");
    } else {
      System.out.println("get test: FAIL");
    }
    books.add("The Namesake");
    books.add("Babe");
    books.add("Stamped From The Beginning");
    books.add("A Tale of Two Cities");
    if (books.get(2) == "Stamped From The Beginning") {
      System.out.println("get test: SUCCESS");
    } else {
      System.out.println("get test: FAIL");
    }
    if ( books.set(3, "I Capture The Castle").equals("A Tale of Two Cities") ) {
      System.out.println("set test: SUCCESS");
    } else {
      System.out.println("set test: FAIL");
    }
    if ( books.get(3).equals("I Capture The Castle") ) {
      System.out.println("set/get test: SUCCESS");
    } else {
      System.out.println("set/get test: FAIL");
    }
    books.add("Life of Pi");
    books.add("Paradise Lost");
    if ( books.set(4, "Sluaghterhouse 5").equals("Life of Pi") ) {
      System.out.println("set test: SUCCESS");
    } else {
      System.out.println("set test: FAIL");
    }

    System.out.println();
    SuperArray german = new SuperArray();
    System.out.println("Tuesday Do Now Methods Test-");
    if (german.isEmpty() == true) {
      System.out.println("isEmpty test: SUCCESS");
    } else {
      System.out.println("isEmpty test: FAIL");
    }
    german.add("Kneipp-Kur");
    if (german.isEmpty() == false) {
      System.out.println("isEmpty test: SUCCESS");
    } else {
      System.out.println("isEmpty test: FAIL");
    }
    if (german.toString().equals("[Kneipp-Kur]")) {
      System.out.println("toString test: SUCCESS");
    } else {
      System.out.println("toString test: FAIL\n" + german.toString());
    }
    german.add("Wassertreten");
    if (german.toString().equals("[Kneipp-Kur, Wassertreten]")) {
      System.out.println("toString test: SUCCESS");
    } else {
      System.out.println("toString test: FAIL\n" + german.toString());
    }
    if (german.contains("Bayern") == false) {
      System.out.println("contains test: SUCCESS");
    } else {
      System.out.println("contains test: FAIL");
    }
    german.add("Bayern");
    if (german.contains("Bayern") == true) {
      System.out.println("contains test: SUCCESS");
    } else {
      System.out.println("contains test: FAIL");
    }

    System.out.println();
    SuperArray europe = new SuperArray();
    System.out.println("Tuesday Classwork Methods Test-");
    europe.add("Czech Republic");//0
    europe.add("Slovakia");//1
    europe.add("Deutschland");//2 --> 3
    europe.add("Andorra");//3 --> 4
    europe.add("France");//4 --> 5
    europe.add(2, "Latvia");
    if ( europe.get(2).equals("Latvia") ) {
      System.out.println("indexed add test: SUCCESS");
    } else {
      System.out.println("indexed add test: FAIL");
    }
    if ( europe.get(5).equals("France") ) {
      System.out.println("indexed add test: SUCCESS");
    } else {
      System.out.println("indexed add test: FAIL");
    }


  }


}
