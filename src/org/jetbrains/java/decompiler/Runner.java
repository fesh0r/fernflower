package org.jetbrains.java.decompiler;

import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler;

/**
 * Created by Jonathan on 4/21/2016.
 */
public class Runner {

    public static void main(String[] args) {
        ConsoleDecompiler.main(new String[]{"-mpm=10000", "-lit=1", "testData/classes/pkg", "test"});
    }

}
