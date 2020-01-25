package org.generic.wildcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import org.generic.Person;

public class PersonLoader {

  private final RandomAccessFile file;

  public PersonLoader(final File file) throws FileNotFoundException {
    this.file = new RandomAccessFile(file,"rw");
  }

  public Person Load() throws ClassNotFoundException{
      return new Person("xyz",20);
  }
}
