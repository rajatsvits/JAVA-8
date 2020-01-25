package org.generic.wildcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import org.generic.Person;

public class PersonSaver {

  private final RandomAccessFile file;

  public PersonSaver(final File file) throws FileNotFoundException {
    this.file = new RandomAccessFile(file,"rw");
  }

  public void save(@org.jetbrains.annotations.NotNull Person person) throws IOException {
    file.writeUTF(person.getClass().getName());
    file.writeUTF(person.getName());
    file.writeInt(person.getAge());
  }

  public void saveAll(@org.jetbrains.annotations.NotNull final  List<? extends Person> xyz) throws IOException {
    for(Person person: xyz){
      save(person);
    }
  }
}
