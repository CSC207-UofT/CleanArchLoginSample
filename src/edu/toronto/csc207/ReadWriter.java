package edu.toronto.csc207;

import java.io.IOException;

public interface ReadWriter {
    /**
     * @param filepath location of ser file
     * @param o object to be serialized
     */
    void saveToFile(String filepath, Object o) throws IOException;

    /**
     * @param filepath location of ser file
     */
    UserList readFromFile(String filepath) throws IOException, ClassNotFoundException;
}
