import java.io.*;
import java.util.*;
import java.lang.*;
public class Person {
	private String name;
	public Person(String name)
	{
		name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
